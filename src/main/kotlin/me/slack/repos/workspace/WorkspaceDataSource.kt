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

    }

}