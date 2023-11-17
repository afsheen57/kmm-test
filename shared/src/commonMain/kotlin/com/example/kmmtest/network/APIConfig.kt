package com.example.kmmtest.network

import com.example.kmmtest.model.Pokemon
import io.ktor.client.*
import io.ktor.client.call.body
import io.ktor.client.request.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

class APIConfig {
    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                useAlternativeNames = false
            })
        }
    }

    suspend fun getAllLaunches(): Pokemon? {
        return try {
            httpClient.get("https://pokeapi.co/api/v2/pokemon").body()
        } catch (e: Exception) {
            println("masuk error $e")
            null
        }
    }
}