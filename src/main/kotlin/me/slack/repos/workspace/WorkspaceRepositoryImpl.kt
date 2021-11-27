package me.slack.repos.workspace

import kotlinx.coroutines.flow.Flow

class WorkspaceRepositoryImpl(private val workspaceDataSource: WorkspaceDataSource) : WorkspaceRepository {

    override fun streamWorkspacesFor(request: Slackbase.SKUser): Flow<Slackbase.SKUserWorkspaces> {
        return workspaceDataSource.stream
    }
}