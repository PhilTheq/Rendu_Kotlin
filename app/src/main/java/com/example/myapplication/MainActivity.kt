package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.reactivex.Single
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import io.reactivex.disposables.CompositeDisposable
import android.widget.ProgressBar
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import java.util.concurrent.TimeUnit
import io.reactivex.android.schedulers.AndroidSchedulers
import android.util.Log
import android.widget.Button
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback


/*
class MainActivity : AppCompatActivity() {

    private val disposable = CompositeDisposable()
    private val adf : MutableList<Joke> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler : RecyclerView = findViewById(R.id.activity_main_recycler_view)
        recycler.layoutManager = LinearLayoutManager(this)

        /*val adapter = JokeAdapter(JokesList.list.toJokeList())
        recyclerview.adapter = adapter*/

        val progressBar: ProgressBar = findViewById(R.id.ProgressBar)

        val jokeService : JokeApiService = JokeApiServiceFactory.createService()
        val joke: Single<Joke> = jokeService.giveMeAJoke()

        val adapter = JokeAdapter(adf){ jokeAdapter : JokeAdapter ->
            val resultSubscribe = joke.subscribeOn(Schedulers.io())
                .delay(100, TimeUnit.MILLISECONDS, AndroidSchedulers.mainThread())
                .repeat(10)
                .doOnError { println("FF") }
                .doOnSubscribe  {   progressBar.visibility = VISIBLE    }
                .doOnNext { joke ->
                    println("aled : ${joke.value}")
                    jokeAdapter.setJokes(joke)

                }
                .doAfterTerminate   {   progressBar.visibility = INVISIBLE      }
                .subscribe()
            disposable.add(resultSubscribe)
        }
        recycler.adapter = adapter


        /*
        val jokeService : JokeApiService = JokeApiServiceFactory.createService()


        val joke : Single<Joke> = jokeService.giveMeAJoke()
        val compositeDisposable = CompositeDisposable()
        compositeDisposable.add(joke.subscribeOn(Schedulers.io())
            .subscribeBy(
                onError = {println("Error")},
                onSuccess = { joke -> println("Success :${joke.value}")}
            )
        )
        */






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
*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView = findViewById<RecyclerView>(R.id.myRecyclerView)

        val serviceGenerator = ServiceGenerator.buildService(JokeApiService::class.java)
        val call = serviceGenerator.getPost()


        call.enqueue(object : retrofit2.Callback<MutableList<Joke>> {
            override fun onResponse(
                call: Call<MutableList<Joke>>,
                response: Response<MutableList<Joke>>
            ) {
                if (response.isSuccessful) {
                    recyclerView.apply {
                        layoutManager = LinearLayoutManager(this@MainActivity)
                        adapter = JokeAdapter(response.body()!!)
                    }
                }
            }

            override fun onFailure(call: Call<MutableList<Joke>>, t: Throwable) {
                t.printStackTrace()
                Log.e("error", t.message.toString())
            }

        })

    }
}