package com.example.myapplication

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.Call

interface JokeApiService {
    @GET("/posts")
    fun getPost(): Call<MutableList<Joke>>
    fun giveMeAJoke() : Call<MutableList<Single<Joke>>>
}