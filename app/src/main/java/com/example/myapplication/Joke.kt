package com.example.myapplication

//import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Joke(
    val categories: List<String> = emptyList(),
    val createdAt: String =" " ,
    val iconUrl: String =" ",
    val id: String=" ",
    val updatedAt: String=" ",
    val url: String=" ",
    val value: String){
}