package com.example.myapplication

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
class Joke(val categories: String, @SerialName("create") val createdAt: String, @SerialName("url") val iconUrl: String, val id: String, @SerialName("update") val updatedAt: String, val url: String, val value: String)
