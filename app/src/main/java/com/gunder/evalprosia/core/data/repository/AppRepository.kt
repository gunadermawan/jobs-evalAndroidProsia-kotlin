package com.gunder.evalprosia.core.data.repository

import android.util.Log
import com.gunder.evalprosia.core.data.source.local.LocalDataSource
import com.gunder.evalprosia.core.data.source.remote.RemoteDataSource
import kotlinx.coroutines.flow.flow

class AppRepository(val local: LocalDataSource, val remote: RemoteDataSource) {
    fun login() = flow {
        try {
            remote.login().let {
                if (it.isSuccessful) {
                    val body = it.body()
                    emit(body)
                    Log.i(TAG, "Login success " + body.toString())
                } else {
                    Log.e(TAG, "login error: " + it.message())
                }
            }
        } catch (e: Exception) {
            Log.e(TAG, "Login error" + e.message)
        }
    }

    companion object {
        const val TAG = "APP_REPOSITORY"
    }
}