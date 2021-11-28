package me.slack.repos.channel

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

class ChannelDataSource {
    private val dataSource =
        MutableStateFlow<Slackbase.SKUserChannels>(Slackbase.SKUserChannels.getDefaultInstance())
    val stream: Flow<Slackbase.SKUserChannels> = dataSource

    init {
        prepareDataSet()
    }

    private fun prepareDataSet() {
        val channels = Slackbase.SKUserChannels.newBuilder().apply {
            for (a in 0..10) {
                this.addChannels(Slackbase.SKChannel.newBuilder().apply {
                    this.name = "android-devs"
                    this.channelId = "1"
                    this.description = "For Android Devs!"
                    this.isPrivate = true
                    this.topic = "#android #dev"
                    this.isStarred = true
                })
                this.addChannels(Slackbase.SKChannel.newBuilder().apply {
                    this.name = "flutter-devs"
                    this.channelId = "2"
                    this.description = "For Flutter Devs!"
                    this.isPrivate = false
                    this.topic = "#flutter #dev"
                    this.isStarred = true
                })
                this.addChannels(Slackbase.SKChannel.newBuilder().apply {
                    this.name = "kotlin-multiplatform"
                    this.channelId = "3"
                    this.description = "For KMM enthusiasts!"
                    this.isPrivate = false
                    this.topic = "#kmm #dev"
                    this.isStarred = false
                })

            }

        }.build()
        dataSource.value = channels
    }
}