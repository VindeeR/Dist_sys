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



	  // Run function1Service2 from Service2 (Server streaming RPC)
	  public void clientSideFunction1Service2() {
		  logger.info("Calling gRPC server streaming type (from the client side)");

		  try {
			  MsgRequest request = MsgRequest.newBuilder().setMessage("(Client said: How're you keeping?)").build();
			  Iterator<MsgReply> reply = blockingStubMyService2
					  .withDeadlineAfter(1, TimeUnit.SECONDS)
					  .function1Service2(request);
				while(reply.hasNext()) {
					System.out.println(reply.next());		// print all messages from the server				
				}
			  logger.info("End of server streaming");
		  } catch (StatusRuntimeException e) {
			  logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			  return;
		  }
	  }

	  // Run function2Service2 from Service2 (Client streaming RPC)
	  public void clientSideFunction2Service2() {
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
		  StreamObserver<MsgRequest> requestObserver = asyncService2Stub.function2Service2(responseObserver);
		  requestObserver.onNext(MsgRequest.newBuilder().setMessage("(Client said: How're you keeping?)").build());
		  for (int i=0; i<rand.nextInt(1, 10); i++){
			  requestObserver.onNext(MsgRequest.newBuilder().setMessage("(Client said: blah, blah, blah)").build());
		  }

		  requestObserver.onCompleted();
	  }

	  // Run function1Service3 from Service3 (Bi-directional streaming RPC)
	  public void clientSideFunction1Service3() {
		  logger.info("Calling gRPC bi-directional streaming type (from the client side)");
		  StreamObserver<MsgRequest> requestObserver =
				  asyncService3Stub.function1Service3(new StreamObserver<MsgReply>() {
					@Override
					public void onNext(MsgReply value) {
						System.out.println("Bidi Client Received: " + value.getMessage());
					}

					@Override
					public void onError(Throwable t) {
						t.printStackTrace();
					}

					@Override
					public void onCompleted() {
						System.out.println("Bidi Client said: Bye. Stream completed");
					}
				  });
		  
		  requestObserver.onNext(MsgRequest.newBuilder().setMessage("(Bidi Client said: What's the craic?)").build());
		  for (int i=0; i<rand.nextInt(1, 10); i++){
			  requestObserver.onNext(MsgRequest.newBuilder().setMessage("(Bidi Client said: blah, blah, blah)").build());
		  }

		  requestObserver.onCompleted();
	  }
	  // total car parking lots that is being used (Unary RPC) from service1
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
	  
	  // which floor percentage is bring used (Client streaming RPCs) from Service1
	  public void clientSidePercentageFloor() {
		  logger.info("Calling gRPC client streaming type (from the client side)");
		  StreamObserver<MsgRequest> requestObserver =
				  asyncService1Stub.percentageFloor(new StreamObserver<MsgReply>() {
					@Override
					public void onNext(MsgReply value) {
						System.out.println("Bidi Client Received: " + value.getMessage());
					}

					@Override
					public void onError(Throwable t) {
						t.printStackTrace();
					}

					@Override
					public void onCompleted() {
						System.out.println("Bidi Client said: Bye. Stream completed");
					}
				  });
		  
		  requestObserver.onNext(MsgRequest.newBuilder().setMessage("(Bidi Client said: What's the craic?)").build());
		  for (int i=0; i<rand.nextInt(1, 10); i++){
			  requestObserver.onNext(MsgRequest.newBuilder().setMessage("(Bidi Client said: blah, blah, blah)").build());
		  }

		  requestObserver.onCompleted();
	  }
	  
	  // verify if they activity nearby and turn off or on the lights (Client streaming RPCs) from Service1
	  public void clientSideChangeLights() {
		  logger.info("Calling gRPC client streaming type (from the client side)");
		  StreamObserver<MsgRequest> requestObserver =
				  asyncService1Stub.changeLights(new StreamObserver<MsgReply>() {
					@Override
					public void onNext(MsgReply value) {
						System.out.println("Bidi Client Received: " + value.getMessage());
					}

					@Override
					public void onError(Throwable t) {
						t.printStackTrace();
					}

					@Override
					public void onCompleted() {
						System.out.println("Bidi Client said: Bye. Stream completed");
					}
				  });
		  
		  requestObserver.onNext(MsgRequest.newBuilder().setMessage("(Bidi Client said: What's the craic?)").build());
		  for (int i=0; i<rand.nextInt(1, 10); i++){
			  requestObserver.onNext(MsgRequest.newBuilder().setMessage("(Bidi Client said: blah, blah, blah)").build());
		  }

		  requestObserver.onCompleted();
	  }



	  private void clientSidePayment() {
			logger.info("Calling gRPC unary type (from the client side)");

			  try {
				  MsgRequest request = MsgRequest.newBuilder().setMessage("(Unary RPC Client said: How many spots are being used?)").build();
				  MsgReply reply = blockingStubMyService3
						  .withDeadlineAfter(5, TimeUnit.SECONDS)
						  .payment(request);
				  System.out.println("Client Received: " + reply.getMessage());
			  } catch (StatusRuntimeException e) {
				  logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
				  return;
			  }
		  }

		// count the time each car is at one spot
		private void clientSideCountTime() {
			  logger.info("Calling gRPC server streaming type (from the client side)");

			  try {
				  MsgRequest request = MsgRequest.newBuilder().setMessage("(Client said: How're you keeping?)").build();
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
		
		// count the amount of free spots
		private void clientSideFreeSpots() {
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
			  StreamObserver<MsgRequest> requestObserver = asyncService3Stub.freeSpots(responseObserver);
			  requestObserver.onNext(MsgRequest.newBuilder().setMessage("(Client said: How're you keeping?)").build());
			  for (int i=0; i<rand.nextInt(1, 10); i++){
				  requestObserver.onNext(MsgRequest.newBuilder().setMessage("(Client said: blah, blah, blah)").build());
			  }

			  requestObserver.onCompleted();
		  }

		private void clientSideAddLocation() {
			  logger.info("Calling gRPC unary type (from the client side)");

			  try {
				  MsgRequest request = MsgRequest.newBuilder().setMessage("(Unary RPC Client said: How many spots are being used?)").build();
				  MsgReply reply = blockingStubMyService2
						  .withDeadlineAfter(5, TimeUnit.SECONDS)
						  .addLocation(request);
				  System.out.println("Client Received: " + reply.getMessage());
			  } catch (StatusRuntimeException e) {
				  logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
				  return;
			  }
		  }

		private void clientSideDeleteLocation() {
			  logger.info("Calling gRPC unary type (from the client side)");

			  try {
				  MsgRequest request = MsgRequest.newBuilder().setMessage("(Unary RPC Client said: How many spots are being used?)").build();
				  MsgReply reply = blockingStubMyService2
						  .withDeadlineAfter(5, TimeUnit.SECONDS)
						  .deleteLocation(request);
				  System.out.println("Client Received: " + reply.getMessage());
			  } catch (StatusRuntimeException e) {
				  logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
				  return;
			  }
		  }

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
			  requestObserver.onNext(MsgRequest.newBuilder().setMessage("(Client said: How're you keeping?)").build());
			  for (int i=0; i<rand.nextInt(1, 10); i++){
				  requestObserver.onNext(MsgRequest.newBuilder().setMessage("(Client said: blah, blah, blah)").build());
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
			  
			  client.clientSideFunction1Service2();			// server-streaming type
			  client.clientSideFunction2Service2();			// client-streaming type
			  client.clientSideFunction1Service3();			// bi-directional streaming type
		  } finally {
			  channel.shutdown().awaitTermination(30, TimeUnit.SECONDS);
		  }
	  }
}