package com.example.myapplication

import retrofit2.Retrofit
import okhttp3.OkHttpClient
import retrofit2.converter.gson.GsonConverterFactory

/*
Dans ce fichier nous allons créer notre Builder qui va se connecter à l'API
 */



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