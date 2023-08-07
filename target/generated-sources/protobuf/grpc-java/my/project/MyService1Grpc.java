package my.project;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Unary RPCs where the client sends a single request to
 * the server and gets a single response back, just like
 * a normal function call.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: service1.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MyService1Grpc {

  private MyService1Grpc() {}

  public static final String SERVICE_NAME = "project.myservice.MyService1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<my.project.MsgRequest,
      my.project.MsgReply> getTotalFloorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "totalFloor",
      requestType = my.project.MsgRequest.class,
      responseType = my.project.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<my.project.MsgRequest,
      my.project.MsgReply> getTotalFloorMethod() {
    io.grpc.MethodDescriptor<my.project.MsgRequest, my.project.MsgReply> getTotalFloorMethod;
    if ((getTotalFloorMethod = MyService1Grpc.getTotalFloorMethod) == null) {
      synchronized (MyService1Grpc.class) {
        if ((getTotalFloorMethod = MyService1Grpc.getTotalFloorMethod) == null) {
          MyService1Grpc.getTotalFloorMethod = getTotalFloorMethod =
              io.grpc.MethodDescriptor.<my.project.MsgRequest, my.project.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "totalFloor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyService1MethodDescriptorSupplier("totalFloor"))
              .build();
        }
      }
    }
    return getTotalFloorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<my.project.MsgRequest,
      my.project.MsgReply> getPercentageFloorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "percentageFloor",
      requestType = my.project.MsgRequest.class,
      responseType = my.project.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<my.project.MsgRequest,
      my.project.MsgReply> getPercentageFloorMethod() {
    io.grpc.MethodDescriptor<my.project.MsgRequest, my.project.MsgReply> getPercentageFloorMethod;
    if ((getPercentageFloorMethod = MyService1Grpc.getPercentageFloorMethod) == null) {
      synchronized (MyService1Grpc.class) {
        if ((getPercentageFloorMethod = MyService1Grpc.getPercentageFloorMethod) == null) {
          MyService1Grpc.getPercentageFloorMethod = getPercentageFloorMethod =
              io.grpc.MethodDescriptor.<my.project.MsgRequest, my.project.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "percentageFloor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyService1MethodDescriptorSupplier("percentageFloor"))
              .build();
        }
      }
    }
    return getPercentageFloorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<my.project.MsgRequest,
      my.project.MsgReply> getChangeLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeLights",
      requestType = my.project.MsgRequest.class,
      responseType = my.project.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<my.project.MsgRequest,
      my.project.MsgReply> getChangeLightsMethod() {
    io.grpc.MethodDescriptor<my.project.MsgRequest, my.project.MsgReply> getChangeLightsMethod;
    if ((getChangeLightsMethod = MyService1Grpc.getChangeLightsMethod) == null) {
      synchronized (MyService1Grpc.class) {
        if ((getChangeLightsMethod = MyService1Grpc.getChangeLightsMethod) == null) {
          MyService1Grpc.getChangeLightsMethod = getChangeLightsMethod =
              io.grpc.MethodDescriptor.<my.project.MsgRequest, my.project.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "changeLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyService1MethodDescriptorSupplier("changeLights"))
              .build();
        }
      }
    }
    return getChangeLightsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MyService1Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyService1Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyService1Stub>() {
        @java.lang.Override
        public MyService1Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyService1Stub(channel, callOptions);
        }
      };
    return MyService1Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MyService1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyService1BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyService1BlockingStub>() {
        @java.lang.Override
        public MyService1BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyService1BlockingStub(channel, callOptions);
        }
      };
    return MyService1BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MyService1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyService1FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyService1FutureStub>() {
        @java.lang.Override
        public MyService1FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyService1FutureStub(channel, callOptions);
        }
      };
    return MyService1FutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Unary RPCs where the client sends a single request to
   * the server and gets a single response back, just like
   * a normal function call.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void totalFloor(my.project.MsgRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalFloorMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<my.project.MsgRequest> percentageFloor(
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getPercentageFloorMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<my.project.MsgRequest> changeLights(
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getChangeLightsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MyService1.
   * <pre>
   * Unary RPCs where the client sends a single request to
   * the server and gets a single response back, just like
   * a normal function call.
   * </pre>
   */
  public static abstract class MyService1ImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MyService1Grpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MyService1.
   * <pre>
   * Unary RPCs where the client sends a single request to
   * the server and gets a single response back, just like
   * a normal function call.
   * </pre>
   */
  public static final class MyService1Stub
      extends io.grpc.stub.AbstractAsyncStub<MyService1Stub> {
    private MyService1Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyService1Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyService1Stub(channel, callOptions);
    }

    /**
     */
    public void totalFloor(my.project.MsgRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalFloorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<my.project.MsgRequest> percentageFloor(
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getPercentageFloorMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<my.project.MsgRequest> changeLights(
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getChangeLightsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MyService1.
   * <pre>
   * Unary RPCs where the client sends a single request to
   * the server and gets a single response back, just like
   * a normal function call.
   * </pre>
   */
  public static final class MyService1BlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MyService1BlockingStub> {
    private MyService1BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyService1BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyService1BlockingStub(channel, callOptions);
    }

    /**
     */
    public my.project.MsgReply totalFloor(my.project.MsgRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalFloorMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MyService1.
   * <pre>
   * Unary RPCs where the client sends a single request to
   * the server and gets a single response back, just like
   * a normal function call.
   * </pre>
   */
  public static final class MyService1FutureStub
      extends io.grpc.stub.AbstractFutureStub<MyService1FutureStub> {
    private MyService1FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyService1FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyService1FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<my.project.MsgReply> totalFloor(
        my.project.MsgRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalFloorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TOTAL_FLOOR = 0;
  private static final int METHODID_PERCENTAGE_FLOOR = 1;
  private static final int METHODID_CHANGE_LIGHTS = 2;

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
        case METHODID_TOTAL_FLOOR:
          serviceImpl.totalFloor((my.project.MsgRequest) request,
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
        case METHODID_PERCENTAGE_FLOOR:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.percentageFloor(
              (io.grpc.stub.StreamObserver<my.project.MsgReply>) responseObserver);
        case METHODID_CHANGE_LIGHTS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.changeLights(
              (io.grpc.stub.StreamObserver<my.project.MsgReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getTotalFloorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              my.project.MsgRequest,
              my.project.MsgReply>(
                service, METHODID_TOTAL_FLOOR)))
        .addMethod(
          getPercentageFloorMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              my.project.MsgRequest,
              my.project.MsgReply>(
                service, METHODID_PERCENTAGE_FLOOR)))
        .addMethod(
          getChangeLightsMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              my.project.MsgRequest,
              my.project.MsgReply>(
                service, METHODID_CHANGE_LIGHTS)))
        .build();
  }

  private static abstract class MyService1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MyService1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return my.project.MyProjectProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MyService1");
    }
  }

  private static final class MyService1FileDescriptorSupplier
      extends MyService1BaseDescriptorSupplier {
    MyService1FileDescriptorSupplier() {}
  }

  private static final class MyService1MethodDescriptorSupplier
      extends MyService1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MyService1MethodDescriptorSupplier(String methodName) {
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
      synchronized (MyService1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MyService1FileDescriptorSupplier())
              .addMethod(getTotalFloorMethod())
              .addMethod(getPercentageFloorMethod())
              .addMethod(getChangeLightsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
