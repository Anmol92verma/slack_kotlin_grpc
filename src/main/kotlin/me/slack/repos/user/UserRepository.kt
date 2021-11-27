package me.slack.repos.user

import kotlinx.coroutines.flow.Flow

interface UserRepository {
    fun streamUsersForChannels(request: Slackbase.SKChannel): Flow<Slackbase.SKChannelUsers>
    fun streamChannelsForUsers(request: Slackbase.SKUser): Flow<Slackbase.SKUserChannels>
}