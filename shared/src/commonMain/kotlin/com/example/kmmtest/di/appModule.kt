package com.example.kmmtest.di

import com.example.kmmtest.network.HttpClient
import org.koin.dsl.module

val commonModule = module {
    single { HttpClient() }
}