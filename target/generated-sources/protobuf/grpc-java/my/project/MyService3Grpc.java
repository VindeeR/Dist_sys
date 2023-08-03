package my.project;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: helloworld.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MyService3Grpc {

  private MyService3Grpc() {}

  public static final String SERVICE_NAME = "project.MyService3";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<my.project.MsgRequest,
      my.project.MsgReply> getFunction1Service3Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "function1Service3",
      requestType = my.project.MsgRequest.class,
      responseType = my.project.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<my.project.MsgRequest,
      my.project.MsgReply> getFunction1Service3Method() {
    io.grpc.MethodDescriptor<my.project.MsgRequest, my.project.MsgReply> getFunction1Service3Method;
    if ((getFunction1Service3Method = MyService3Grpc.getFunction1Service3Method) == null) {
      synchronized (MyService3Grpc.class) {
        if ((getFunction1Service3Method = MyService3Grpc.getFunction1Service3Method) == null) {
          MyService3Grpc.getFunction1Service3Method = getFunction1Service3Method =
              io.grpc.MethodDescriptor.<my.project.MsgRequest, my.project.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "function1Service3"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyService3MethodDescriptorSupplier("function1Service3"))
              .build();
        }
      }
    }
    return getFunction1Service3Method;
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
     * <pre>
     * Bidirectional streaming RPCs where both sides send a
     * sequence of messages using a read-write stream
     * </pre>
     */
    default io.grpc.stub.StreamObserver<my.project.MsgRequest> function1Service3(
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getFunction1Service3Method(), responseObserver);
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
     * <pre>
     * Bidirectional streaming RPCs where both sides send a
     * sequence of messages using a read-write stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<my.project.MsgRequest> function1Service3(
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getFunction1Service3Method(), getCallOptions()), responseObserver);
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
  }

  private static final int METHODID_FUNCTION1SERVICE3 = 0;

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
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FUNCTION1SERVICE3:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.function1Service3(
              (io.grpc.stub.StreamObserver<my.project.MsgReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getFunction1Service3Method(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              my.project.MsgRequest,
              my.project.MsgReply>(
                service, METHODID_FUNCTION1SERVICE3)))
        .build();
  }

  private static abstract class MyService3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MyService3BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return my.project.MyProjectProto.getDescriptor();
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
              .addMethod(getFunction1Service3Method())
              .build();
        }
      }
    }
    return result;
  }
}
