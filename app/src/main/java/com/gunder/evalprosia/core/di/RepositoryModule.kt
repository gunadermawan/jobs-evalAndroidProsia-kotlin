package com.gunder.evalprosia.core.di

import com.gunder.evalprosia.core.data.repository.AppRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { AppRepository(get(), get()) }
}
