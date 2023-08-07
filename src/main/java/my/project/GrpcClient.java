package my.project;

import io.grpc.Channel;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.util.Random;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import my.project.MyService1Grpc.MyService1Stub;	// async stub for client-streaming services
import my.project.MyService2Grpc.MyService2Stub;	// async stub for client-streaming services
import my.project.MyService3Grpc.MyService3Stub;	// async stub for client-streaming services

/**
 * Client code based on the helloWorld App
 * https://raw.githubusercontent.com/grpc/grpc-java/master/examples/src/main/java/io/grpc/examples/helloworld/HelloWorldClient.java
 */
public class GrpcClient {
	  private static final Logger logger = Logger.getLogger(GrpcClient.class.getName());
	  private final MyService1Grpc.MyService1BlockingStub blockingStubMyService1;
	  private final MyService2Grpc.MyService2BlockingStub blockingStubMyService2;
	  private final MyService3Grpc.MyService3BlockingStub blockingStubMyService3;
	  private final MyService1Stub asyncService1Stub;
	  private final MyService2Stub asyncService2Stub;
	  private final MyService3Stub asyncService3Stub;
	  static Random rand = new Random();

	  /** Construct client for accessing HelloWorld server using the existing channel. */
	  public GrpcClient(Channel channel) {
	    // The sync calls (blocking)
	    blockingStubMyService1 = MyService1Grpc.newBlockingStub(channel);
	    blockingStubMyService2 = MyService2Grpc.newBlockingStub(channel);
	    blockingStubMyService3 = MyService3Grpc.newBlockingStub(channel);
	    //MyService3Grpc.newBlockingStub(channel);

	    asyncService1Stub = MyService1Grpc.newStub(channel);	// async calls (for client-streaming)
	    asyncService2Stub = MyService2Grpc.newStub(channel);	// async calls (for client-streaming)
	    asyncService3Stub = MyService3Grpc.newStub(channel);	// async calls (for bidirectional streaming)
	  }

	  // Total car parking lots that is being used (Unary RPC) from service1
	  public void clientSideTotalFloor() {
		  logger.info("Calling gRPC unary type (from the client side)");

		  try {
			  MsgRequest request = MsgRequest.newBuilder().setMessage("(Unary RPC Client said: How many spots are being used?)").build();
			  MsgReply reply = blockingStubMyService1
					  .withDeadlineAfter(5, TimeUnit.SECONDS)
					  .totalFloor(request);
			  System.out.println("Client Received: " + reply.getMessage());
		  } catch (StatusRuntimeException e) {
			  logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			  return;
		  }
	  }
	  
	  // Which floor percentage is being used (Client streaming RPCs) from Service1
	  public void clientSidePercentageFloor() {
		  logger.info("Calling gRPC client streaming type (from the client side)");
		  StreamObserver<MsgRequest> requestObserver =
				  asyncService1Stub.percentageFloor(new StreamObserver<MsgReply>() {
					@Override
					public void onNext(MsgReply value) {
						System.out.println("Client received the percentage of: " + value.getMessage());
					}

					@Override
					public void onError(Throwable t) {
						t.printStackTrace();
					}

					@Override
					public void onCompleted() {
						System.out.println("Stream for percentage of floor being used is completed");
					}
				  });
		  
		  requestObserver.onNext(MsgRequest.newBuilder().setMessage("(floor percentage: What's the percentage?)").build());
		  for (int i=0; i<rand.nextInt(1, 10); i++){
			  requestObserver.onNext(MsgRequest.newBuilder().setMessage("(please keep up to date)").build());
		  }

		  requestObserver.onCompleted();
	  }
	  
	  // Verify if they activity nearby and turn off or on the lights (Client streaming RPCs) from Service1
	  public void clientSideChangeLights() {
		  logger.info("Calling gRPC client streaming type (from the client side)");
		  StreamObserver<MsgRequest> requestObserver =
				  asyncService1Stub.changeLights(new StreamObserver<MsgReply>() {
					@Override
					public void onNext(MsgReply value) {
						System.out.println("the spot needs to change its color: " + value.getMessage());
					}

					@Override
					public void onError(Throwable t) {
						t.printStackTrace();
					}

					@Override
					public void onCompleted() {
						System.out.println("Change color said: Color Changed bye.");
					}
				  });
		  
		  requestObserver.onNext(MsgRequest.newBuilder().setMessage("(Client clientSideChangeLights said: spot " +rand.nextInt(1,500)+ " needs to change its color)").build());
		  for (int i=0; i<rand.nextInt(1, 10); i++){
			  requestObserver.onNext(MsgRequest.newBuilder().setMessage("(spot " +rand.nextInt(1,500)+ " needs to change its color)").build());
		  }

		  requestObserver.onCompleted();
	  }

		// In case a spot need to be added (Unary RPC) service 2
		private void clientSideAddLocation() {
			  logger.info("Calling gRPC unary type (from the client side)");

			  try {
				  MsgRequest request = MsgRequest.newBuilder().setMessage("(Unary RPC Client said: Which new spot can be opened?)").build();
				  MsgReply reply = blockingStubMyService2
						  .withDeadlineAfter(5, TimeUnit.SECONDS)
						  .addLocation(request);
				  System.out.println("Client Received: " + reply.getMessage());
			  } catch (StatusRuntimeException e) {
				  logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
				  return;
			  }
		  }

		// In case a spot need to be deleted (Unary RPC) from service 2
		private void clientSideDeleteLocation() {
			  logger.info("Calling gRPC unary type (from the client side)");

			  try {
				  MsgRequest request = MsgRequest.newBuilder().setMessage("(Unary RPC Client said: Which spot can be removed?)").build();
				  MsgReply reply = blockingStubMyService2
						  .withDeadlineAfter(5, TimeUnit.SECONDS)
						  .deleteLocation(request);
				  System.out.println("Client Received: " + reply.getMessage());
			  } catch (StatusRuntimeException e) {
				  logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
				  return;
			  }
		  }

		// Change the spot to have a different price (Bi-directional streaming RPC) from service 2
		private void clientSideSpecialSpot() {
			logger.info("Calling gRPC client streaming type (from the client side)");

			  StreamObserver<MsgReply> responseObserver = new StreamObserver<MsgReply>() {
				  @Override
				  public void onNext(MsgReply value) {
					  System.out.println("Received: " + value.getMessage());					
				  }

				  @Override
				  public void onError(Throwable t) {
					  t.printStackTrace();
				  }

				  @Override
				  public void onCompleted() {
					  System.out.println("Bye. Stream completed");
				  }
			  };

			  // send a stream (aka: bunch of messages) back to the server
			  StreamObserver<MsgRequest> requestObserver = asyncService2Stub.specialSpot(responseObserver);
			  requestObserver.onNext(MsgRequest.newBuilder().setMessage("(Client said: Apply discount to an spot)").build());
			  for (int i=0; i<rand.nextInt(1, 10); i++){
				  requestObserver.onNext(MsgRequest.newBuilder().setMessage("(Client said: Apply discount)").build());
			  }

			  requestObserver.onCompleted();
		  }


		  // Manage the amount to be paid (Unary Service) from service 3
		  private void clientSidePayment() {
				logger.info("Calling gRPC unary type (from the client side)");

				  try {
					  MsgRequest request = MsgRequest.newBuilder().setMessage("(Unary RPC Client said: How much should i pay?)").build();
					  MsgReply reply = blockingStubMyService3
							  .withDeadlineAfter(5, TimeUnit.SECONDS)
							  .payment(request);
					  System.out.println("Client Received: " + reply.getMessage());
				  } catch (StatusRuntimeException e) {
					  logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
					  return;
				  }
			  }

			// Count the time each car is at one spot (Server streaming RPCs) from service 3
			private void clientSideCountTime() {
				  logger.info("Calling gRPC server streaming type (from the client side)");

				  try {
					  MsgRequest request = MsgRequest.newBuilder().setMessage("(Client clientSideCountTime said: how long has the car being there?)").build();
					  Iterator<MsgReply> reply = blockingStubMyService3
							  .withDeadlineAfter(5, TimeUnit.SECONDS)
							  .countTime(request);
						while(reply.hasNext()) {
							System.out.println(reply.next());		// print all messages from the server				
						}
					  logger.info("End of server streaming");
				  } catch (StatusRuntimeException e) {
					  logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
					  return;
				  }
			  }
			
			// Count the amount of free spots (Bi-directional streaming RPC) from service 3
			private void clientSideFreeSpots() {
				logger.info("Calling gRPC client streaming type (from the client side)");

				  StreamObserver<MsgReply> responseObserver = new StreamObserver<MsgReply>() {
					  @Override
					  public void onNext(MsgReply value) {
						  System.out.println("(Client clientSideCountTime said: Received: " + value.getMessage() + ")");					
					  }

					  @Override
					  public void onError(Throwable t) {
						  t.printStackTrace();
					  }

					  @Override
					  public void onCompleted() {
						  System.out.println("Bye. Stream completed");
					  }
				  };

				  // send a stream (aka: bunch of messages) back to the server
				  StreamObserver<MsgRequest> requestObserver = asyncService3Stub.freeSpots(responseObserver);
				  requestObserver.onNext(MsgRequest.newBuilder().setMessage("(Client clientSideCountTime said: How many free spots are there?)").build());
				  for (int i=0; i<rand.nextInt(1, 10); i++){
					  requestObserver.onNext(MsgRequest.newBuilder().setMessage("(Client said: How many free spots are there?)").build());
				  }

				  requestObserver.onCompleted();
			  }

	  /**
	   * 
	   */
	  public static void main(String[] args) throws Exception {
		  String target;

		  // Service discovery part (Where's the gRPC server running?) 
		  JmDnsServiceDiscovery jmDnsServiceDiscovery = new JmDnsServiceDiscovery();
		  JmDnsServiceDiscovery.find("_gRPCserver._tcp.local.");	// service name
		  do {
			  target = jmDnsServiceDiscovery.getLocGrpc();
			  System.out.println("jmDnsServiceDiscovery: " + target);
		  } while (target.length()<2);		// wait for the service to be discovered

		  ManagedChannel channel = Grpc.newChannelBuilder(target, InsecureChannelCredentials.create())
				  .build();
		  try {
			  GrpcClient client = new GrpcClient(channel);
			  client.clientSideTotalFloor();				// unary type
			  client.clientSidePercentageFloor();			// client-streaming type
			  client.clientSideChangeLights();				// client-streaming type

			  client.clientSideAddLocation();				// client-streaming type
			  client.clientSideDeleteLocation();			// client-streaming type
			  client.clientSideSpecialSpot();				// bi-directional streaming type
			  
			  client.clientSideFreeSpots();					// bi-directional streaming type
			  client.clientSideCountTime();					// server-streaming type
			  client.clientSidePayment();					// unary type
		  } finally {
			  channel.shutdown().awaitTermination(30, TimeUnit.SECONDS);
		  }
	  }
}