package me.slack.repos.workspace

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

class WorkspaceDataSource {

    private val dataSource =
        MutableStateFlow<Slackbase.SKUserWorkspaces>(Slackbase.SKUserWorkspaces.getDefaultInstance())

    val stream: Flow<Slackbase.SKUserWorkspaces> = dataSource

    init {
        prepareDataSet()
    }

    private fun prepareDataSet() {
        val workspaces = Slackbase.SKUserWorkspaces.newBuilder().apply {
            this.addWorkspace(Slackbase.SKWorkspace.newBuilder().apply {
                this.name = "Mutual Mobile"
                this.imageUrl = "https://avatars.slack-edge.com/2018-07-20/401750958992_1b07bb3c946bc863bfc6_88.png"
                this.subdomain = "mutualmobile.slack.com"
            })
            this.addWorkspace(Slackbase.SKWorkspace.newBuilder().apply {
                this.name = "Kotlin Lang"
                this.imageUrl = "https://avatars.slack-edge.com/2021-08-18/2394702857843_51119ca847fe3f05614b_88.png"
                this.subdomain = "kotlin-lang.slack.com"
            })
            this.addWorkspace(Slackbase.SKWorkspace.newBuilder().apply {
                this.name = "Appium"
                this.imageUrl = "https://avatars.slack-edge.com/2016-02-23/22719144819_f572eff841880a2b284f_88.png"
                this.subdomain = "appium.slack.com"
            })
        }.build()
        dataSource.value = workspaces
    }

}