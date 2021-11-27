package me.slack.repos.user

import kotlinx.coroutines.flow.Flow
import me.slack.repos.channel.ChannelDataSource

class UserRepositoryImpl(private val userDataSource: UserDataSource, private val channelDataSource: ChannelDataSource) :
    UserRepository {

    override fun streamUsersForChannels(request: Slackbase.SKChannel): Flow<Slackbase.SKChannelUsers> {
        return userDataSource.stream
    }

    override fun streamChannelsForUsers(request: Slackbase.SKUser): Flow<Slackbase.SKUserChannels> {
        return channelDataSource.stream
    }
}