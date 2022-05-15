package com.example.myapplication

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

/*
object JokeApiServiceFactory {
    fun createService(): JokeApiService {
            val builder : Retrofit = Retrofit.Builder()
                    .baseUrl("https://jsonplaceholder.typicode.com")
                    .addConverterFactory(Json.asConverterFactory(MediaType.get("application/json")))
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()
        }
}*/




object ServiceGenerator{

    private val client = OkHttpClient.Builder().build()

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

        fun <T> buildService(service: Class<T>):T{
            return retrofit.create(service)
        }
}