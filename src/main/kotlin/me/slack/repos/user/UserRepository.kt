package me.slack.repos.user

import kotlinx.coroutines.flow.Flow

interface UserRepository {
    fun streamUsersForChannels(request: Slackbase.Empty): Flow<Slackbase.SKChannelUsers>
    fun streamChannelsForUsers(request: Slackbase.Empty): Flow<Slackbase.SKUserChannels>
}