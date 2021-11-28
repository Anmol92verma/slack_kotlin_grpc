package me.slack.repos.user

import kotlinx.coroutines.flow.Flow
import me.slack.repos.channel.ChannelDataSource

class UserRepositoryImpl(private val userDataSource: UserDataSource, private val channelDataSource: ChannelDataSource) :
    UserRepository {

    override fun streamUsersForChannels(request: Slackbase.Empty): Flow<Slackbase.SKChannelUsers> {
        return userDataSource.stream
    }

    override fun streamChannelsForUsers(request: Slackbase.Empty): Flow<Slackbase.SKUserChannels> {
        return channelDataSource.stream
    }
}