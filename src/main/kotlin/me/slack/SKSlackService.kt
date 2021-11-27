package me.slack

import kotlinx.coroutines.flow.Flow
import me.slack.repos.user.UserRepository
import me.slack.repos.workspace.WorkspaceRepository

class SKSlackService(private val workspaceRepository: WorkspaceRepository, private val userRepository: UserRepository) :
    SlackServiceGrpcKt.SlackServiceCoroutineImplBase() {

    override fun getWorkspaces(request: Slackbase.SKUser): Flow<Slackbase.SKUserWorkspaces> {
        return workspaceRepository.streamWorkspacesFor(request)
    }

    override fun getUsers(request: Slackbase.SKChannel): Flow<Slackbase.SKChannelUsers> {
        return userRepository.streamUsersForChannels(request)
    }

    override fun getUserChannels(request: Slackbase.SKUser): Flow<Slackbase.SKUserChannels> {
        return userRepository.streamChannelsForUsers(request)
    }
}