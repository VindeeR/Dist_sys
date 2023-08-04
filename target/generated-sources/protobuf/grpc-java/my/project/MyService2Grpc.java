package my.project;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: helloworld.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MyService2Grpc {

  private MyService2Grpc() {}

  public static final String SERVICE_NAME = "project.MyService2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<my.project.MsgRequest,
      my.project.MsgReply> getFunction1Service2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "function1Service2",
      requestType = my.project.MsgRequest.class,
      responseType = my.project.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<my.project.MsgRequest,
      my.project.MsgReply> getFunction1Service2Method() {
    io.grpc.MethodDescriptor<my.project.MsgRequest, my.project.MsgReply> getFunction1Service2Method;
    if ((getFunction1Service2Method = MyService2Grpc.getFunction1Service2Method) == null) {
      synchronized (MyService2Grpc.class) {
        if ((getFunction1Service2Method = MyService2Grpc.getFunction1Service2Method) == null) {
          MyService2Grpc.getFunction1Service2Method = getFunction1Service2Method =
              io.grpc.MethodDescriptor.<my.project.MsgRequest, my.project.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "function1Service2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyService2MethodDescriptorSupplier("function1Service2"))
              .build();
        }
      }
    }
    return getFunction1Service2Method;
  }

  private static volatile io.grpc.MethodDescriptor<my.project.MsgRequest,
      my.project.MsgReply> getFunction2Service2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "function2Service2",
      requestType = my.project.MsgRequest.class,
      responseType = my.project.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<my.project.MsgRequest,
      my.project.MsgReply> getFunction2Service2Method() {
    io.grpc.MethodDescriptor<my.project.MsgRequest, my.project.MsgReply> getFunction2Service2Method;
    if ((getFunction2Service2Method = MyService2Grpc.getFunction2Service2Method) == null) {
      synchronized (MyService2Grpc.class) {
        if ((getFunction2Service2Method = MyService2Grpc.getFunction2Service2Method) == null) {
          MyService2Grpc.getFunction2Service2Method = getFunction2Service2Method =
              io.grpc.MethodDescriptor.<my.project.MsgRequest, my.project.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "function2Service2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyService2MethodDescriptorSupplier("function2Service2"))
              .build();
        }
      }
    }
    return getFunction2Service2Method;
  }

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
     * <pre>
     * Server streaming RPCs where the client sends a request
     * to the server and gets a stream to read a sequence of
     * messages back
     * </pre>
     */
    default void function1Service2(my.project.MsgRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFunction1Service2Method(), responseObserver);
    }

    /**
     * <pre>
     * Client streaming RPCs where the client writes a sequence
     * of messages and sends them to the server
     * </pre>
     */
    default io.grpc.stub.StreamObserver<my.project.MsgRequest> function2Service2(
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getFunction2Service2Method(), responseObserver);
    }

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
     * <pre>
     * Server streaming RPCs where the client sends a request
     * to the server and gets a stream to read a sequence of
     * messages back
     * </pre>
     */
    public void function1Service2(my.project.MsgRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFunction1Service2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client streaming RPCs where the client writes a sequence
     * of messages and sends them to the server
     * </pre>
     */
    public io.grpc.stub.StreamObserver<my.project.MsgRequest> function2Service2(
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getFunction2Service2Method(), getCallOptions()), responseObserver);
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
     * <pre>
     * Server streaming RPCs where the client sends a request
     * to the server and gets a stream to read a sequence of
     * messages back
     * </pre>
     */
    public java.util.Iterator<my.project.MsgReply> function1Service2(
        my.project.MsgRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFunction1Service2Method(), getCallOptions(), request);
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

  private static final int METHODID_FUNCTION1SERVICE2 = 0;
  private static final int METHODID_ADD_LOCATION = 1;
  private static final int METHODID_DELETE_LOCATION = 2;
  private static final int METHODID_FUNCTION2SERVICE2 = 3;
  private static final int METHODID_SPECIAL_SPOT = 4;

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
        case METHODID_FUNCTION1SERVICE2:
          serviceImpl.function1Service2((my.project.MsgRequest) request,
              (io.grpc.stub.StreamObserver<my.project.MsgReply>) responseObserver);
          break;
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
        case METHODID_FUNCTION2SERVICE2:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.function2Service2(
              (io.grpc.stub.StreamObserver<my.project.MsgReply>) responseObserver);
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
          getFunction1Service2Method(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              my.project.MsgRequest,
              my.project.MsgReply>(
                service, METHODID_FUNCTION1SERVICE2)))
        .addMethod(
          getFunction2Service2Method(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              my.project.MsgRequest,
              my.project.MsgReply>(
                service, METHODID_FUNCTION2SERVICE2)))
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
      return my.project.MyProjectProto.getDescriptor();
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
              .addMethod(getFunction1Service2Method())
              .addMethod(getFunction2Service2Method())
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
