package me.slack

import kotlinx.coroutines.flow.Flow
import me.slack.repos.user.UserRepository
import me.slack.repos.workspace.WorkspaceRepository

class SKSlackService(private val workspaceRepository: WorkspaceRepository, private val userRepository: UserRepository) :
    SlackServiceGrpcKt.SlackServiceCoroutineImplBase() {

    override fun getWorkspaces(request: Slackbase.Empty): Flow<Slackbase.SKUserWorkspaces> {
        return workspaceRepository.streamWorkspacesFor(request)
    }

    override fun getUsers(request: Slackbase.Empty): Flow<Slackbase.SKChannelUsers> {
        return userRepository.streamUsersForChannels(request)
    }

    override fun getUserChannels(request: Slackbase.Empty): Flow<Slackbase.SKUserChannels> {
        return userRepository.streamChannelsForUsers(request)
    }
}