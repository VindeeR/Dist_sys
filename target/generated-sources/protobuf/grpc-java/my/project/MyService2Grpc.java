package my.project;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: service2.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MyService2Grpc {

  private MyService2Grpc() {}

  public static final String SERVICE_NAME = "project.myservice.MyService2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<my.project.MsgRequest,
      my.project.MsgReply> getAddLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addLocation",
      requestType = my.project.MsgRequest.class,
      responseType = my.project.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<my.project.MsgRequest,
      my.project.MsgReply> getAddLocationMethod() {
    io.grpc.MethodDescriptor<my.project.MsgRequest, my.project.MsgReply> getAddLocationMethod;
    if ((getAddLocationMethod = MyService2Grpc.getAddLocationMethod) == null) {
      synchronized (MyService2Grpc.class) {
        if ((getAddLocationMethod = MyService2Grpc.getAddLocationMethod) == null) {
          MyService2Grpc.getAddLocationMethod = getAddLocationMethod =
              io.grpc.MethodDescriptor.<my.project.MsgRequest, my.project.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyService2MethodDescriptorSupplier("addLocation"))
              .build();
        }
      }
    }
    return getAddLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<my.project.MsgRequest,
      my.project.MsgReply> getDeleteLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteLocation",
      requestType = my.project.MsgRequest.class,
      responseType = my.project.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<my.project.MsgRequest,
      my.project.MsgReply> getDeleteLocationMethod() {
    io.grpc.MethodDescriptor<my.project.MsgRequest, my.project.MsgReply> getDeleteLocationMethod;
    if ((getDeleteLocationMethod = MyService2Grpc.getDeleteLocationMethod) == null) {
      synchronized (MyService2Grpc.class) {
        if ((getDeleteLocationMethod = MyService2Grpc.getDeleteLocationMethod) == null) {
          MyService2Grpc.getDeleteLocationMethod = getDeleteLocationMethod =
              io.grpc.MethodDescriptor.<my.project.MsgRequest, my.project.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyService2MethodDescriptorSupplier("deleteLocation"))
              .build();
        }
      }
    }
    return getDeleteLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<my.project.MsgRequest,
      my.project.MsgReply> getSpecialSpotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "specialSpot",
      requestType = my.project.MsgRequest.class,
      responseType = my.project.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<my.project.MsgRequest,
      my.project.MsgReply> getSpecialSpotMethod() {
    io.grpc.MethodDescriptor<my.project.MsgRequest, my.project.MsgReply> getSpecialSpotMethod;
    if ((getSpecialSpotMethod = MyService2Grpc.getSpecialSpotMethod) == null) {
      synchronized (MyService2Grpc.class) {
        if ((getSpecialSpotMethod = MyService2Grpc.getSpecialSpotMethod) == null) {
          MyService2Grpc.getSpecialSpotMethod = getSpecialSpotMethod =
              io.grpc.MethodDescriptor.<my.project.MsgRequest, my.project.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "specialSpot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyService2MethodDescriptorSupplier("specialSpot"))
              .build();
        }
      }
    }
    return getSpecialSpotMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MyService2Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyService2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyService2Stub>() {
        @java.lang.Override
        public MyService2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyService2Stub(channel, callOptions);
        }
      };
    return MyService2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MyService2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyService2BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyService2BlockingStub>() {
        @java.lang.Override
        public MyService2BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyService2BlockingStub(channel, callOptions);
        }
      };
    return MyService2BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MyService2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyService2FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyService2FutureStub>() {
        @java.lang.Override
        public MyService2FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyService2FutureStub(channel, callOptions);
        }
      };
    return MyService2FutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void addLocation(my.project.MsgRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddLocationMethod(), responseObserver);
    }

    /**
     */
    default void deleteLocation(my.project.MsgRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLocationMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<my.project.MsgRequest> specialSpot(
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSpecialSpotMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MyService2.
   */
  public static abstract class MyService2ImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MyService2Grpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MyService2.
   */
  public static final class MyService2Stub
      extends io.grpc.stub.AbstractAsyncStub<MyService2Stub> {
    private MyService2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyService2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyService2Stub(channel, callOptions);
    }

    /**
     */
    public void addLocation(my.project.MsgRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteLocation(my.project.MsgRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<my.project.MsgRequest> specialSpot(
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSpecialSpotMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MyService2.
   */
  public static final class MyService2BlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MyService2BlockingStub> {
    private MyService2BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyService2BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyService2BlockingStub(channel, callOptions);
    }

    /**
     */
    public my.project.MsgReply addLocation(my.project.MsgRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public my.project.MsgReply deleteLocation(my.project.MsgRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLocationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MyService2.
   */
  public static final class MyService2FutureStub
      extends io.grpc.stub.AbstractFutureStub<MyService2FutureStub> {
    private MyService2FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyService2FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyService2FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<my.project.MsgReply> addLocation(
        my.project.MsgRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<my.project.MsgReply> deleteLocation(
        my.project.MsgRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLocationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_LOCATION = 0;
  private static final int METHODID_DELETE_LOCATION = 1;
  private static final int METHODID_SPECIAL_SPOT = 2;

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
        case METHODID_ADD_LOCATION:
          serviceImpl.addLocation((my.project.MsgRequest) request,
              (io.grpc.stub.StreamObserver<my.project.MsgReply>) responseObserver);
          break;
        case METHODID_DELETE_LOCATION:
          serviceImpl.deleteLocation((my.project.MsgRequest) request,
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
        case METHODID_SPECIAL_SPOT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.specialSpot(
              (io.grpc.stub.StreamObserver<my.project.MsgReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAddLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              my.project.MsgRequest,
              my.project.MsgReply>(
                service, METHODID_ADD_LOCATION)))
        .addMethod(
          getDeleteLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              my.project.MsgRequest,
              my.project.MsgReply>(
                service, METHODID_DELETE_LOCATION)))
        .addMethod(
          getSpecialSpotMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              my.project.MsgRequest,
              my.project.MsgReply>(
                service, METHODID_SPECIAL_SPOT)))
        .build();
  }

  private static abstract class MyService2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MyService2BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return my.project.Service2.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MyService2");
    }
  }

  private static final class MyService2FileDescriptorSupplier
      extends MyService2BaseDescriptorSupplier {
    MyService2FileDescriptorSupplier() {}
  }

  private static final class MyService2MethodDescriptorSupplier
      extends MyService2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MyService2MethodDescriptorSupplier(String methodName) {
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
      synchronized (MyService2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MyService2FileDescriptorSupplier())
              .addMethod(getAddLocationMethod())
              .addMethod(getDeleteLocationMethod())
              .addMethod(getSpecialSpotMethod())
              .build();
        }
      }
    }
    return result;
  }
}
