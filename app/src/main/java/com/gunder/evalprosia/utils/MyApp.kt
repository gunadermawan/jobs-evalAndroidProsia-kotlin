package com.gunder.evalprosia.utils

import android.app.Application
import com.gunder.evalprosia.core.di.appModule
import com.gunder.evalprosia.core.di.repositoryModule
import com.gunder.evalprosia.core.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)
            modules(listOf(appModule, viewModelModule, repositoryModule))
        }
    }
}