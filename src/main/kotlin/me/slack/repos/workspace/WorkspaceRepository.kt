package me.slack.repos.workspace

import kotlinx.coroutines.flow.Flow

interface WorkspaceRepository {
    fun streamWorkspacesFor(request: Slackbase.Empty): Flow<Slackbase.SKUserWorkspaces>
}