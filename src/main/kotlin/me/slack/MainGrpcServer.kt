package me.slack

import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder
import me.slack.repos.channel.ChannelDataSource
import me.slack.repos.user.UserDataSource
import me.slack.repos.user.UserRepositoryImpl
import me.slack.repos.workspace.WorkspaceDataSource
import me.slack.repos.workspace.WorkspaceRepositoryImpl

object MainGrpcServer {

    @JvmStatic
    fun main(args: Array<String>) {
        val server = NettyServerBuilder.forPort(5001)
            .addService(
                SKSlackService(
                    WorkspaceRepositoryImpl(WorkspaceDataSource()),
                    UserRepositoryImpl(UserDataSource(), ChannelDataSource())
                )
            )
            .build()

        server.start()
        print("GRPC server on port ${server.port} ,started!")
        server.awaitTermination()
    }

}