import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.serverStreamingRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.serverStreamingServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for SlackService.
 */
object SlackServiceGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = SlackServiceGrpc.getServiceDescriptor()

  val getWorkspacesMethod: MethodDescriptor<Slackbase.SKUser, Slackbase.SKUserWorkspaces>
    @JvmStatic
    get() = SlackServiceGrpc.getGetWorkspacesMethod()

  val getUsersMethod: MethodDescriptor<Slackbase.SKChannel, Slackbase.SKChannelUsers>
    @JvmStatic
    get() = SlackServiceGrpc.getGetUsersMethod()

  val getUserChannelsMethod: MethodDescriptor<Slackbase.SKUser, Slackbase.SKUserChannels>
    @JvmStatic
    get() = SlackServiceGrpc.getGetUserChannelsMethod()

  /**
   * A stub for issuing RPCs to a(n) SlackService service as suspending coroutines.
   */
  @StubFor(SlackServiceGrpc::class)
  class SlackServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<SlackServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): SlackServiceCoroutineStub =
        SlackServiceCoroutineStub(channel, callOptions)

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    fun getWorkspaces(request: Slackbase.SKUser): Flow<Slackbase.SKUserWorkspaces> =
        serverStreamingRpc(
      channel,
      SlackServiceGrpc.getGetWorkspacesMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    fun getUsers(request: Slackbase.SKChannel): Flow<Slackbase.SKChannelUsers> = serverStreamingRpc(
      channel,
      SlackServiceGrpc.getGetUsersMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    fun getUserChannels(request: Slackbase.SKUser): Flow<Slackbase.SKUserChannels> =
        serverStreamingRpc(
      channel,
      SlackServiceGrpc.getGetUserChannelsMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the SlackService service based on Kotlin coroutines.
   */
  abstract class SlackServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns a [Flow] of responses to an RPC for SlackService.getWorkspaces.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open fun getWorkspaces(request: Slackbase.SKUser): Flow<Slackbase.SKUserWorkspaces> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method SlackService.getWorkspaces is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for SlackService.getUsers.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open fun getUsers(request: Slackbase.SKChannel): Flow<Slackbase.SKChannelUsers> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method SlackService.getUsers is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for SlackService.getUserChannels.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open fun getUserChannels(request: Slackbase.SKUser): Flow<Slackbase.SKUserChannels> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method SlackService.getUserChannels is unimplemented"))

    final override fun bindService(): ServerServiceDefinition =
        builder(SlackServiceGrpc.getServiceDescriptor())
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = SlackServiceGrpc.getGetWorkspacesMethod(),
      implementation = ::getWorkspaces
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = SlackServiceGrpc.getGetUsersMethod(),
      implementation = ::getUsers
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = SlackServiceGrpc.getGetUserChannelsMethod(),
      implementation = ::getUserChannels
    )).build()
  }
}
