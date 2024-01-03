package com.example.kmmtest.network

import com.example.kmmtest.model.Pokemon
import io.ktor.client.call.body
import io.ktor.client.request.*
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class APIConfig: KoinComponent {

//    private val httpClient = HttpClient {
//        install(ContentNegotiation) {
//            json(Json {
//                ignoreUnknownKeys = true
//                useAlternativeNames = false
//            })
//        }
//    }

    private val httpClient: HttpClient by inject()

    suspend fun getAllLaunches(): Pokemon? {
        return try {
            httpClient.provideHttpClient().get("https://pokeapi.co/api/v2/pokemon").body()
        } catch (e: Exception) {
            println("masuk error $e")
            null
        }
    }

}