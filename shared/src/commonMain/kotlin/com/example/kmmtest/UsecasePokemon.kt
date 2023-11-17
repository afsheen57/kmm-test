package com.example.kmmtest

import com.example.kmmtest.model.Pokemon
import com.example.kmmtest.network.APIConfig

class UseCasePokemon() {
    private val apiService = APIConfig()

    suspend fun loadData(): Pokemon? {
        return apiService.getAllLaunches()
    }
}