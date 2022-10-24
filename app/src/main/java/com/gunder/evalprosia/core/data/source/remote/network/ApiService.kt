package com.gunder.evalprosia.core.data.source.remote.network

import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.POST

interface ApiService {
    @POST("login")
    suspend fun login(): Response<RequestBody>

    @POST("register")
    suspend fun register(): Response<RequestBody>
}