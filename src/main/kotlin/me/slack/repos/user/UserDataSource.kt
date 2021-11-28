package me.slack.repos.user

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

class UserDataSource {
    private val dataSource =
        MutableStateFlow<Slackbase.SKChannelUsers>(Slackbase.SKChannelUsers.getDefaultInstance())
    val stream: Flow<Slackbase.SKChannelUsers> = dataSource


    init {
        prepareDataSet()
    }

    private fun prepareDataSet() {
        val users = Slackbase.SKChannelUsers.newBuilder().apply {
            this.addUsers(Slackbase.SKUser.newBuilder().apply {
                this.name = "Anmol Verma"
                this.userId = "1"
                this.username = "anmol"
                this.title = "Android Architect"
                this.imageUrl = "https://avatars.slack-edge.com/2018-07-20/401750958992_1b07bb3c946bc863bfc6_88.png"
                this.status = Slackbase.SKUserStatus.newBuilder().setStatus("Developing Slack! \uD83E\uDD17")
                    .setEmoji("\uD83E\uDD17").build()
            })
            this.addUsers(Slackbase.SKUser.newBuilder().apply {
                this.name = "Carl Jung"
                this.userId = "2"
                this.username = "carl"
                this.title = "Android Lead"
                this.imageUrl = "https://ca.slack-edge.com/T02TLUWLZ-UPAEPG4LV-3032624d37a5-512"
                this.status = Slackbase.SKUserStatus.newBuilder().setStatus("Developing Gmail! \uD83E\uDD17")
                    .setEmoji("\uD83E\uDD17").build()
            })
            this.addUsers(Slackbase.SKUser.newBuilder().apply {
                this.name = "Johnny Dep"
                this.userId = "3"
                this.username = "johnny"
                this.title = "Codeforces Hero"
                this.imageUrl = "https://ca.slack-edge.com/T02TLUWLZ-URKGG6GLF-86e0da78811c-512"
                this.status =
                    Slackbase.SKUserStatus.newBuilder().setStatus("We are Pro's Developing Dart! \uD83E\uDD17")
                        .setEmoji("\uD83E\uDD17").build()
            })

        }.build()
        dataSource.value = users
    }
}