package com.gunder.evalprosia.core.di

import com.gunder.evalprosia.core.data.source.local.LocalDataSource
import com.gunder.evalprosia.core.data.source.remote.RemoteDataSource
import com.gunder.evalprosia.core.data.source.remote.network.ApiConfig
import org.koin.dsl.module

val appModule = module {
    single { ApiConfig.provideApiService }
    single { RemoteDataSource(get()) }
    single { LocalDataSource() }
}