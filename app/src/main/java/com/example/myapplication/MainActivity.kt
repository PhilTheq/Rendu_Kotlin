package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.reactivex.Single
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import io.reactivex.disposables.CompositeDisposable



class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.activity_main_recycler_view)
        recyclerview.layoutManager = LinearLayoutManager(this)
        val adapter = JokeAdapter(JokesList.list.toJokeList())
        recyclerview.adapter = adapter

        val jokeService : JokeApiService = JokeApiServiceFactory.createService()








    }
    private fun List<String>.toJokeList() : List<Joke> = map { stringJoke ->
        Joke(categories = listOf(" ", " "),
            createdAt = " ",
            iconUrl = " ",
            id = " ",
            updatedAt = " ",
            url = " ",
            value = stringJoke+"\n" )

    }


}