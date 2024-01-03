package com.example.kmmtest.di

import com.example.kmmtest.network.HttpClient
import org.koin.core.context.startKoin
import org.koin.dsl.module

fun initKoin() {
    startKoin {
        modules(commonModule)
    }
}

val commonModule = module {
    single { HttpClient() }
}