import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: me/slack/slackbase.proto")
public final class SlackServiceGrpc {

  private SlackServiceGrpc() {}

  public static final String SERVICE_NAME = "SlackService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Slackbase.SKUser,
      Slackbase.SKUserWorkspaces> getGetWorkspacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getWorkspaces",
      requestType = Slackbase.SKUser.class,
      responseType = Slackbase.SKUserWorkspaces.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<Slackbase.SKUser,
      Slackbase.SKUserWorkspaces> getGetWorkspacesMethod() {
    io.grpc.MethodDescriptor<Slackbase.SKUser, Slackbase.SKUserWorkspaces> getGetWorkspacesMethod;
    if ((getGetWorkspacesMethod = SlackServiceGrpc.getGetWorkspacesMethod) == null) {
      synchronized (SlackServiceGrpc.class) {
        if ((getGetWorkspacesMethod = SlackServiceGrpc.getGetWorkspacesMethod) == null) {
          SlackServiceGrpc.getGetWorkspacesMethod = getGetWorkspacesMethod =
              io.grpc.MethodDescriptor.<Slackbase.SKUser, Slackbase.SKUserWorkspaces>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getWorkspaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Slackbase.SKUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Slackbase.SKUserWorkspaces.getDefaultInstance()))
              .setSchemaDescriptor(new SlackServiceMethodDescriptorSupplier("getWorkspaces"))
              .build();
        }
      }
    }
    return getGetWorkspacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Slackbase.SKChannel,
      Slackbase.SKChannelUsers> getGetUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUsers",
      requestType = Slackbase.SKChannel.class,
      responseType = Slackbase.SKChannelUsers.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<Slackbase.SKChannel,
      Slackbase.SKChannelUsers> getGetUsersMethod() {
    io.grpc.MethodDescriptor<Slackbase.SKChannel, Slackbase.SKChannelUsers> getGetUsersMethod;
    if ((getGetUsersMethod = SlackServiceGrpc.getGetUsersMethod) == null) {
      synchronized (SlackServiceGrpc.class) {
        if ((getGetUsersMethod = SlackServiceGrpc.getGetUsersMethod) == null) {
          SlackServiceGrpc.getGetUsersMethod = getGetUsersMethod =
              io.grpc.MethodDescriptor.<Slackbase.SKChannel, Slackbase.SKChannelUsers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Slackbase.SKChannel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Slackbase.SKChannelUsers.getDefaultInstance()))
              .setSchemaDescriptor(new SlackServiceMethodDescriptorSupplier("getUsers"))
              .build();
        }
      }
    }
    return getGetUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Slackbase.SKUser,
      Slackbase.SKUserChannels> getGetUserChannelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserChannels",
      requestType = Slackbase.SKUser.class,
      responseType = Slackbase.SKUserChannels.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<Slackbase.SKUser,
      Slackbase.SKUserChannels> getGetUserChannelsMethod() {
    io.grpc.MethodDescriptor<Slackbase.SKUser, Slackbase.SKUserChannels> getGetUserChannelsMethod;
    if ((getGetUserChannelsMethod = SlackServiceGrpc.getGetUserChannelsMethod) == null) {
      synchronized (SlackServiceGrpc.class) {
        if ((getGetUserChannelsMethod = SlackServiceGrpc.getGetUserChannelsMethod) == null) {
          SlackServiceGrpc.getGetUserChannelsMethod = getGetUserChannelsMethod =
              io.grpc.MethodDescriptor.<Slackbase.SKUser, Slackbase.SKUserChannels>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getUserChannels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Slackbase.SKUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Slackbase.SKUserChannels.getDefaultInstance()))
              .setSchemaDescriptor(new SlackServiceMethodDescriptorSupplier("getUserChannels"))
              .build();
        }
      }
    }
    return getGetUserChannelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SlackServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlackServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlackServiceStub>() {
        @java.lang.Override
        public SlackServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlackServiceStub(channel, callOptions);
        }
      };
    return SlackServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SlackServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlackServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlackServiceBlockingStub>() {
        @java.lang.Override
        public SlackServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlackServiceBlockingStub(channel, callOptions);
        }
      };
    return SlackServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SlackServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlackServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlackServiceFutureStub>() {
        @java.lang.Override
        public SlackServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlackServiceFutureStub(channel, callOptions);
        }
      };
    return SlackServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SlackServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getWorkspaces(Slackbase.SKUser request,
        io.grpc.stub.StreamObserver<Slackbase.SKUserWorkspaces> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWorkspacesMethod(), responseObserver);
    }

    /**
     */
    public void getUsers(Slackbase.SKChannel request,
        io.grpc.stub.StreamObserver<Slackbase.SKChannelUsers> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUsersMethod(), responseObserver);
    }

    /**
     */
    public void getUserChannels(Slackbase.SKUser request,
        io.grpc.stub.StreamObserver<Slackbase.SKUserChannels> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserChannelsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetWorkspacesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                Slackbase.SKUser,
                Slackbase.SKUserWorkspaces>(
                  this, METHODID_GET_WORKSPACES)))
          .addMethod(
            getGetUsersMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                Slackbase.SKChannel,
                Slackbase.SKChannelUsers>(
                  this, METHODID_GET_USERS)))
          .addMethod(
            getGetUserChannelsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                Slackbase.SKUser,
                Slackbase.SKUserChannels>(
                  this, METHODID_GET_USER_CHANNELS)))
          .build();
    }
  }

  /**
   */
  public static final class SlackServiceStub extends io.grpc.stub.AbstractAsyncStub<SlackServiceStub> {
    private SlackServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlackServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlackServiceStub(channel, callOptions);
    }

    /**
     */
    public void getWorkspaces(Slackbase.SKUser request,
        io.grpc.stub.StreamObserver<Slackbase.SKUserWorkspaces> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetWorkspacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUsers(Slackbase.SKChannel request,
        io.grpc.stub.StreamObserver<Slackbase.SKChannelUsers> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserChannels(Slackbase.SKUser request,
        io.grpc.stub.StreamObserver<Slackbase.SKUserChannels> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetUserChannelsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SlackServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SlackServiceBlockingStub> {
    private SlackServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlackServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlackServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<Slackbase.SKUserWorkspaces> getWorkspaces(
        Slackbase.SKUser request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetWorkspacesMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<Slackbase.SKChannelUsers> getUsers(
        Slackbase.SKChannel request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<Slackbase.SKUserChannels> getUserChannels(
        Slackbase.SKUser request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetUserChannelsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SlackServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SlackServiceFutureStub> {
    private SlackServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlackServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlackServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_WORKSPACES = 0;
  private static final int METHODID_GET_USERS = 1;
  private static final int METHODID_GET_USER_CHANNELS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SlackServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SlackServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_WORKSPACES:
          serviceImpl.getWorkspaces((Slackbase.SKUser) request,
              (io.grpc.stub.StreamObserver<Slackbase.SKUserWorkspaces>) responseObserver);
          break;
        case METHODID_GET_USERS:
          serviceImpl.getUsers((Slackbase.SKChannel) request,
              (io.grpc.stub.StreamObserver<Slackbase.SKChannelUsers>) responseObserver);
          break;
        case METHODID_GET_USER_CHANNELS:
          serviceImpl.getUserChannels((Slackbase.SKUser) request,
              (io.grpc.stub.StreamObserver<Slackbase.SKUserChannels>) responseObserver);
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

  private static abstract class SlackServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SlackServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Slackbase.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SlackService");
    }
  }

  private static final class SlackServiceFileDescriptorSupplier
      extends SlackServiceBaseDescriptorSupplier {
    SlackServiceFileDescriptorSupplier() {}
  }

  private static final class SlackServiceMethodDescriptorSupplier
      extends SlackServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SlackServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SlackServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SlackServiceFileDescriptorSupplier())
              .addMethod(getGetWorkspacesMethod())
              .addMethod(getGetUsersMethod())
              .addMethod(getGetUserChannelsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
