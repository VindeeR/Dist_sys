package my.project;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: service3.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MyService3Grpc {

  private MyService3Grpc() {}

  public static final String SERVICE_NAME = "project.myservice.MyService3";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<my.project.MsgRequest,
      my.project.MsgReply> getFreeSpotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "freeSpots",
      requestType = my.project.MsgRequest.class,
      responseType = my.project.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<my.project.MsgRequest,
      my.project.MsgReply> getFreeSpotsMethod() {
    io.grpc.MethodDescriptor<my.project.MsgRequest, my.project.MsgReply> getFreeSpotsMethod;
    if ((getFreeSpotsMethod = MyService3Grpc.getFreeSpotsMethod) == null) {
      synchronized (MyService3Grpc.class) {
        if ((getFreeSpotsMethod = MyService3Grpc.getFreeSpotsMethod) == null) {
          MyService3Grpc.getFreeSpotsMethod = getFreeSpotsMethod =
              io.grpc.MethodDescriptor.<my.project.MsgRequest, my.project.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "freeSpots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyService3MethodDescriptorSupplier("freeSpots"))
              .build();
        }
      }
    }
    return getFreeSpotsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<my.project.MsgRequest,
      my.project.MsgReply> getCountTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countTime",
      requestType = my.project.MsgRequest.class,
      responseType = my.project.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<my.project.MsgRequest,
      my.project.MsgReply> getCountTimeMethod() {
    io.grpc.MethodDescriptor<my.project.MsgRequest, my.project.MsgReply> getCountTimeMethod;
    if ((getCountTimeMethod = MyService3Grpc.getCountTimeMethod) == null) {
      synchronized (MyService3Grpc.class) {
        if ((getCountTimeMethod = MyService3Grpc.getCountTimeMethod) == null) {
          MyService3Grpc.getCountTimeMethod = getCountTimeMethod =
              io.grpc.MethodDescriptor.<my.project.MsgRequest, my.project.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyService3MethodDescriptorSupplier("countTime"))
              .build();
        }
      }
    }
    return getCountTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<my.project.MsgRequest,
      my.project.MsgReply> getPaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "payment",
      requestType = my.project.MsgRequest.class,
      responseType = my.project.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<my.project.MsgRequest,
      my.project.MsgReply> getPaymentMethod() {
    io.grpc.MethodDescriptor<my.project.MsgRequest, my.project.MsgReply> getPaymentMethod;
    if ((getPaymentMethod = MyService3Grpc.getPaymentMethod) == null) {
      synchronized (MyService3Grpc.class) {
        if ((getPaymentMethod = MyService3Grpc.getPaymentMethod) == null) {
          MyService3Grpc.getPaymentMethod = getPaymentMethod =
              io.grpc.MethodDescriptor.<my.project.MsgRequest, my.project.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "payment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyService3MethodDescriptorSupplier("payment"))
              .build();
        }
      }
    }
    return getPaymentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MyService3Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyService3Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyService3Stub>() {
        @java.lang.Override
        public MyService3Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyService3Stub(channel, callOptions);
        }
      };
    return MyService3Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MyService3BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyService3BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyService3BlockingStub>() {
        @java.lang.Override
        public MyService3BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyService3BlockingStub(channel, callOptions);
        }
      };
    return MyService3BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MyService3FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyService3FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyService3FutureStub>() {
        @java.lang.Override
        public MyService3FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyService3FutureStub(channel, callOptions);
        }
      };
    return MyService3FutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<my.project.MsgRequest> freeSpots(
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getFreeSpotsMethod(), responseObserver);
    }

    /**
     */
    default void countTime(my.project.MsgRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountTimeMethod(), responseObserver);
    }

    /**
     */
    default void payment(my.project.MsgRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPaymentMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MyService3.
   */
  public static abstract class MyService3ImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MyService3Grpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MyService3.
   */
  public static final class MyService3Stub
      extends io.grpc.stub.AbstractAsyncStub<MyService3Stub> {
    private MyService3Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyService3Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyService3Stub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<my.project.MsgRequest> freeSpots(
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getFreeSpotsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void countTime(my.project.MsgRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getCountTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void payment(my.project.MsgRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPaymentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MyService3.
   */
  public static final class MyService3BlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MyService3BlockingStub> {
    private MyService3BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyService3BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyService3BlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<my.project.MsgReply> countTime(
        my.project.MsgRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getCountTimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public my.project.MsgReply payment(my.project.MsgRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPaymentMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MyService3.
   */
  public static final class MyService3FutureStub
      extends io.grpc.stub.AbstractFutureStub<MyService3FutureStub> {
    private MyService3FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyService3FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyService3FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<my.project.MsgReply> payment(
        my.project.MsgRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPaymentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COUNT_TIME = 0;
  private static final int METHODID_PAYMENT = 1;
  private static final int METHODID_FREE_SPOTS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COUNT_TIME:
          serviceImpl.countTime((my.project.MsgRequest) request,
              (io.grpc.stub.StreamObserver<my.project.MsgReply>) responseObserver);
          break;
        case METHODID_PAYMENT:
          serviceImpl.payment((my.project.MsgRequest) request,
              (io.grpc.stub.StreamObserver<my.project.MsgReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FREE_SPOTS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.freeSpots(
              (io.grpc.stub.StreamObserver<my.project.MsgReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getFreeSpotsMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              my.project.MsgRequest,
              my.project.MsgReply>(
                service, METHODID_FREE_SPOTS)))
        .addMethod(
          getCountTimeMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              my.project.MsgRequest,
              my.project.MsgReply>(
                service, METHODID_COUNT_TIME)))
        .addMethod(
          getPaymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              my.project.MsgRequest,
              my.project.MsgReply>(
                service, METHODID_PAYMENT)))
        .build();
  }

  private static abstract class MyService3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MyService3BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return my.project.Service3.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MyService3");
    }
  }

  private static final class MyService3FileDescriptorSupplier
      extends MyService3BaseDescriptorSupplier {
    MyService3FileDescriptorSupplier() {}
  }

  private static final class MyService3MethodDescriptorSupplier
      extends MyService3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MyService3MethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MyService3Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MyService3FileDescriptorSupplier())
              .addMethod(getFreeSpotsMethod())
              .addMethod(getCountTimeMethod())
              .addMethod(getPaymentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
