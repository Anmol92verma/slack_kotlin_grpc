package me.slack.repos.user

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

class UserDataSource {
    private val dataSource =
        MutableStateFlow<Slackbase.SKChannelUsers>(Slackbase.SKChannelUsers.getDefaultInstance())
    val stream: Flow<Slackbase.SKChannelUsers> = dataSource

}