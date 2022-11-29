package demo;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.2)",
    comments = "Source: UserRequests.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserAccessGrpc {

  private UserAccessGrpc() {}

  public static final String SERVICE_NAME = "demo.UserAccess";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<demo.UserRequests.LoginRequest,
      demo.UserRequests.UserRequestResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = demo.UserRequests.LoginRequest.class,
      responseType = demo.UserRequests.UserRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<demo.UserRequests.LoginRequest,
      demo.UserRequests.UserRequestResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<demo.UserRequests.LoginRequest, demo.UserRequests.UserRequestResponse> getLoginMethod;
    if ((getLoginMethod = UserAccessGrpc.getLoginMethod) == null) {
      synchronized (UserAccessGrpc.class) {
        if ((getLoginMethod = UserAccessGrpc.getLoginMethod) == null) {
          UserAccessGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<demo.UserRequests.LoginRequest, demo.UserRequests.UserRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.UserRequests.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.UserRequests.UserRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserAccessMethodDescriptorSupplier("login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<demo.UserRequests.LogoutRequest,
      demo.UserRequests.UserRequestResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = demo.UserRequests.LogoutRequest.class,
      responseType = demo.UserRequests.UserRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<demo.UserRequests.LogoutRequest,
      demo.UserRequests.UserRequestResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<demo.UserRequests.LogoutRequest, demo.UserRequests.UserRequestResponse> getLogoutMethod;
    if ((getLogoutMethod = UserAccessGrpc.getLogoutMethod) == null) {
      synchronized (UserAccessGrpc.class) {
        if ((getLogoutMethod = UserAccessGrpc.getLogoutMethod) == null) {
          UserAccessGrpc.getLogoutMethod = getLogoutMethod =
              io.grpc.MethodDescriptor.<demo.UserRequests.LogoutRequest, demo.UserRequests.UserRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.UserRequests.LogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.UserRequests.UserRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserAccessMethodDescriptorSupplier("logout"))
              .build();
        }
      }
    }
    return getLogoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserAccessStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserAccessStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserAccessStub>() {
        @java.lang.Override
        public UserAccessStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserAccessStub(channel, callOptions);
        }
      };
    return UserAccessStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserAccessBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserAccessBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserAccessBlockingStub>() {
        @java.lang.Override
        public UserAccessBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserAccessBlockingStub(channel, callOptions);
        }
      };
    return UserAccessBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserAccessFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserAccessFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserAccessFutureStub>() {
        @java.lang.Override
        public UserAccessFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserAccessFutureStub(channel, callOptions);
        }
      };
    return UserAccessFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserAccessImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(demo.UserRequests.LoginRequest request,
        io.grpc.stub.StreamObserver<demo.UserRequests.UserRequestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void logout(demo.UserRequests.LogoutRequest request,
        io.grpc.stub.StreamObserver<demo.UserRequests.UserRequestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                demo.UserRequests.LoginRequest,
                demo.UserRequests.UserRequestResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getLogoutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                demo.UserRequests.LogoutRequest,
                demo.UserRequests.UserRequestResponse>(
                  this, METHODID_LOGOUT)))
          .build();
    }
  }

  /**
   */
  public static final class UserAccessStub extends io.grpc.stub.AbstractAsyncStub<UserAccessStub> {
    private UserAccessStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAccessStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserAccessStub(channel, callOptions);
    }

    /**
     */
    public void login(demo.UserRequests.LoginRequest request,
        io.grpc.stub.StreamObserver<demo.UserRequests.UserRequestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(demo.UserRequests.LogoutRequest request,
        io.grpc.stub.StreamObserver<demo.UserRequests.UserRequestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserAccessBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserAccessBlockingStub> {
    private UserAccessBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAccessBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserAccessBlockingStub(channel, callOptions);
    }

    /**
     */
    public demo.UserRequests.UserRequestResponse login(demo.UserRequests.LoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public demo.UserRequests.UserRequestResponse logout(demo.UserRequests.LogoutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserAccessFutureStub extends io.grpc.stub.AbstractFutureStub<UserAccessFutureStub> {
    private UserAccessFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAccessFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserAccessFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<demo.UserRequests.UserRequestResponse> login(
        demo.UserRequests.LoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<demo.UserRequests.UserRequestResponse> logout(
        demo.UserRequests.LogoutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserAccessImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserAccessImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((demo.UserRequests.LoginRequest) request,
              (io.grpc.stub.StreamObserver<demo.UserRequests.UserRequestResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((demo.UserRequests.LogoutRequest) request,
              (io.grpc.stub.StreamObserver<demo.UserRequests.UserRequestResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserAccessBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserAccessBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return demo.UserRequests.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserAccess");
    }
  }

  private static final class UserAccessFileDescriptorSupplier
      extends UserAccessBaseDescriptorSupplier {
    UserAccessFileDescriptorSupplier() {}
  }

  private static final class UserAccessMethodDescriptorSupplier
      extends UserAccessBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserAccessMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserAccessGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserAccessFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
