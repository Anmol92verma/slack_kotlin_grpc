package me.slack.repos.channel

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

class ChannelDataSource {
    private val dataSource =
        MutableStateFlow<Slackbase.SKUserChannels>(Slackbase.SKUserChannels.getDefaultInstance())
    val stream: Flow<Slackbase.SKUserChannels> = dataSource
}