package com.gunder.evalprosia.core.data.source.remote

import com.gunder.evalprosia.core.data.source.remote.network.ApiService

class RemoteDataSource(private val api: ApiService) {
    suspend fun login() = api.login()
}