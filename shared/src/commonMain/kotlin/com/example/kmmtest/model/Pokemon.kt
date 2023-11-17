package com.example.kmmtest.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ListPokemon(
    @SerialName("name")
    val name: String?,
    @SerialName("url")
    val url: String?
)

@Serializable
data class Pokemon(
    @SerialName("count")
    val count: Int,
    @SerialName("results")
    val listPokemon: List<ListPokemon>
)