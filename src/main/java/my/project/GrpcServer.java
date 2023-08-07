/*
 * Copyright 2015 The gRPC Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package my.project;

import io.grpc.BindableService;
import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.Random;

/**
 * Server code based on the helloWorld App
 * https://raw.githubusercontent.com/grpc/grpc-java/master/examples/src/main/java/io/grpc/examples/helloworld/HelloWorldServer.java
 */
public class GrpcServer {
	private static final Logger logger = Logger.getLogger(GrpcServer.class.getName());
	static Random rand = new Random();
	private Server server;

	private void start() throws IOException, InterruptedException {
		/* Grpc will find a suitable port to run the services (see "0" below) */
		server = Grpc.newServerBuilderForPort(0, InsecureServerCredentials.create())
				.addService((BindableService) new MyService1Impl())
				.addService((BindableService) new MyService2Impl())
				.addService((BindableService) new MyService3Impl())
				.build()
				.start();
		JmDnsServiceRegistration.register("_gRPCserver._tcp.local.", server.getPort());
		logger.info("Server started, listening on " + server.getPort());
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				// Use stderr here since the logger may have been reset by its JVM shutdown hook.
				System.err.println("*** shutting down gRPC server since JVM is shutting down");
				try {
					GrpcServer.this.stop();
				} catch (InterruptedException e) {
					e.printStackTrace(System.err);
				}
				System.err.println("*** server shut down");
			}
		});
	}

	private void stop() throws InterruptedException {
		if (server != null) {
			server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
		}
	  }

	/**
	 * Await termination on the main thread since the grpc library uses daemon threads.
	 */
	private void blockUntilShutdown() throws InterruptedException {
		if (server != null) {
			server.awaitTermination();
		}
	}

	/**
	 * Main launches the server from the command line.
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		final GrpcServer server = new GrpcServer();
		server.start();
		server.blockUntilShutdown();
	}

	static class MyService1Impl extends MyService1Grpc.MyService1ImplBase {
		/*
		 * Unary RPCs where the client sends a single request to the server and gets a single response back
		 * https://grpc.io/docs/what-is-grpc/core-concepts/
		 */
		
		// total car parking lots that is being used (Unary RPC)
		@Override
		public void totalFloor (MsgRequest req, StreamObserver<MsgReply> responseObserver) {
			logger.info("7 - Calling gRPC unary type (from the server side)");
			MsgReply reply = MsgReply.newBuilder().setMessage(req.getMessage() + "\ntotal car parking lots that is being used " + rand.nextInt(10, 100) + " out of 500 \n(Stream completed)").build();
			responseObserver.onNext(reply);
			responseObserver.onCompleted();
		}
		
		// which floor percentage is bring used (Client streaming RPCs) from Service1
		@Override
		public StreamObserver<MsgRequest> percentageFloor (StreamObserver<MsgReply> responseObserver) {
			logger.info("8 - Calling gRPC client streaming type (from the server side)");
			return new StreamObserver<MsgRequest>() {

				@Override
				public void onNext(MsgRequest value) {
					System.out.println("\nServer received: " + value.getMessage());
				}

				@Override
				public void onError(Throwable t) {
					t.printStackTrace();
				}

				@Override
				public void onCompleted() {
					MsgReply reply = MsgReply.newBuilder().setMessage("\nIt's " + rand.nextInt(0, 100) + "% \n(Stream completed)").build();
					responseObserver.onNext(reply);
					responseObserver.onCompleted();
				}
			};
		}
		
		// verify if they activity nearby and turn off or on the lights (Client streaming RPCs) from Service1
		@Override
		public StreamObserver<MsgRequest> changeLights (StreamObserver<MsgReply> responseObserver) {
			logger.info("9 - Calling gRPC client streaming type (from the server side)");
			return new StreamObserver<MsgRequest>() {

				@Override
				public void onNext(MsgRequest value) {
					System.out.println("\nServer received: " + value.getMessage());
				}

				@Override
				public void onError(Throwable t) {
					t.printStackTrace();
				}

				@Override
				public void onCompleted() {
					MsgReply reply = MsgReply.newBuilder().setMessage("\nChanging Light colors! \n(Stream completed)").build();
					responseObserver.onNext(reply);
					responseObserver.onCompleted();
				}
			};
		}
	}
	
	static class MyService2Impl extends MyService2Grpc.MyService2ImplBase {
		/*
		 * Server streaming RPCs where the client sends a request to the server and gets a stream to
		 * read a sequence of messages back
		 * https://grpc.io/docs/what-is-grpc/core-concepts/
		 */
		@Override
		public void function1Service2(MsgRequest req, StreamObserver<MsgReply> responseObserver) {
			logger.info("Calling gRPC server streaming type (from the server side)");
			MsgReply reply = MsgReply.newBuilder().setMessage(req.getMessage() + "(Streaming Server said: blah, blah)").build();
			responseObserver.onNext(reply);

			// send a stream (aka: bunch of messages) back to the client
			for (int i=0; i<rand.nextInt(1, 10); i++){
				reply = MsgReply.newBuilder().setMessage("(Streaming Server: and more blah, blah, blah)").build();
				responseObserver.onNext(reply);
			}

			// no more messages
			responseObserver.onCompleted();
		}

		/*
		 * Client streaming RPCs where the client writes a sequence of messages and sends them to the server,
		 * again using a provided stream
		 * https://grpc.io/docs/what-is-grpc/core-concepts/
		 */
		@Override
		public StreamObserver<MsgRequest> function2Service2(StreamObserver<MsgReply> responseObserver) {
			logger.info("Calling gRPC client streaming type (from the server side)");
			return new StreamObserver<MsgRequest>() {

				@Override
				public void onNext(MsgRequest value) {
					System.out.println("Server received: " + value.getMessage());
				}

				@Override
				public void onError(Throwable t) {
					t.printStackTrace();
				}

				@Override
				public void onCompleted() {
					MsgReply reply = MsgReply.newBuilder().setMessage("(Stream completed)").build();
					responseObserver.onNext(reply);
					responseObserver.onCompleted();
				}
			};
		}
		
		@Override
		public void addLocation(MsgRequest req, StreamObserver<MsgReply> responseObserver) {
			logger.info("1 - Calling gRPC unary type (from the server side)");
			MsgReply reply = MsgReply.newBuilder().setMessage("\n" + req.getMessage() + "Added parking space to be used" + rand.nextInt(10, 100)).build();
			responseObserver.onNext(reply);
			responseObserver.onCompleted();
		}
		
		@Override
		public void deleteLocation(MsgRequest req, StreamObserver<MsgReply> responseObserver) {
			logger.info("2 - Calling gRPC unary type (from the server side)");
			MsgReply reply = MsgReply.newBuilder().setMessage("\n" + req.getMessage() + "Parking space deleted and connot be used anymore" + rand.nextInt(10, 100)).build();
			responseObserver.onNext(reply);
			responseObserver.onCompleted();
		}
		
		@Override
		public StreamObserver<MsgRequest> specialSpot(StreamObserver<MsgReply> responseObserver) {
			logger.info("3 - gRPC bi-directional streaming type (from the server side)");
			return new StreamObserver<MsgRequest>() {
				@Override
				public void onNext(MsgRequest value) {
					System.out.println("\nCreate new special spot out of spot: " + value.getMessage() + ")");
					MsgReply reply = MsgReply.newBuilder().setMessage("successful creation").build();
					responseObserver.onNext(reply);
				}

				@Override
				public void onError(Throwable t) {
					t.printStackTrace();
				}

				@Override
				public void onCompleted() {
					responseObserver.onCompleted();
				}
			};
		}
	}

	static class MyService3Impl extends MyService3Grpc.MyService3ImplBase {
		/*
		 * Bidirectional streaming RPCs where both sides send a sequence of messages using a read-write stream
		 * https://grpc.io/docs/what-is-grpc/core-concepts/
		 */
		@Override
		public StreamObserver<MsgRequest> function1Service3(StreamObserver<MsgReply> responseObserver) {
			logger.info("Calling gRPC bi-directional streaming type (from the server side)");
			return new StreamObserver<MsgRequest>() {
				@Override
				public void onNext(MsgRequest value) {
					System.out.println("(Bi-di Server Received: " + value.getMessage() + ")");
					MsgReply reply = MsgReply.newBuilder().setMessage("(Bi-di Server said: blah, blah, blah)").build();
					responseObserver.onNext(reply);
					reply = MsgReply.newBuilder().setMessage("(Bi-di Server said: blah, blah, blah)").build();
					responseObserver.onNext(reply);
				}

				@Override
				public void onError(Throwable t) {
					t.printStackTrace();
				}

				@Override
				public void onCompleted() {
					responseObserver.onCompleted();
				}
			};
		}
		
		// count the amount of free spots
		@Override
		public StreamObserver<MsgRequest> freeSpots(StreamObserver<MsgReply> responseObserver) {
			logger.info("4 - gRPC bi-directional streaming type (from the server side)");
			return new StreamObserver<MsgRequest>() {
				@Override
				public void onNext(MsgRequest value) {
					System.out.println("\nRequest to count free spot received: " + value.getMessage() + ")");
					MsgReply reply = MsgReply.newBuilder().setMessage("Free spots Count is: "+rand.nextInt(0,500)).build();
					responseObserver.onNext(reply);
					reply = MsgReply.newBuilder().setMessage("\nFree spots Count is: "+rand.nextInt(0,500)).build();
					responseObserver.onNext(reply);
				}

				@Override
				public void onError(Throwable t) {
					t.printStackTrace();
				}

				@Override
				public void onCompleted() {
					responseObserver.onCompleted();
				}
			};
		}
		
		// count the time each car is at one spot
		@Override
		public void countTime(MsgRequest req, StreamObserver<MsgReply> responseObserver) {
			logger.info("5 - gRPC server streaming type (from the server side)");
			MsgReply reply = MsgReply.newBuilder().setMessage(req.getMessage() + "\nThe amount of time each car is located is: ").build();
			responseObserver.onNext(reply);

			// send a stream (aka: bunch of messages) back to the client
			for (int i=0; i<5; i++){
				reply = MsgReply.newBuilder().setMessage(i + " is located for " + rand.nextInt(1, 400) + " minutes").build();
				responseObserver.onNext(reply);
			}

			// no more messages
			responseObserver.onCompleted();
		}
		
		@Override
		public void payment(MsgRequest req, StreamObserver<MsgReply> responseObserver) {
			logger.info("6 - gRPC server streaming type (from the server side)");
			MsgReply reply = MsgReply.newBuilder().setMessage(req.getMessage() + "The total to be paid for each car is as follow:").build();
			responseObserver.onNext(reply);

			// send a stream (aka: bunch of messages) back to the client
			for (int i=0; i<5; i++){
				reply = MsgReply.newBuilder().setMessage(i + " - pays the total of " + rand.nextInt(1, 15)).build();
				responseObserver.onNext(reply);
			}

			// no more messages
			responseObserver.onCompleted();
		}

	}
}