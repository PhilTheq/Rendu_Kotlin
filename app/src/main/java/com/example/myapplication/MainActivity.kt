package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.util.Log
import retrofit2.Call
import retrofit2.Response

// class MainActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Call our recyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.myRecyclerView)

        val jokeapiservice = JokeApiServiceFactory.buildService(JokeApiService::class.java)
        val call = jokeapiservice.getPost()

        //Call our enqueue
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
            /*
            private val jokeService : JokeApiService = JokeApiServiceFactory.createService()
            val compositeDisposable = CompositeDisposable()
            fun getJoke(){
                jokeService.giveMeAJoke().subscribeOn(Schedulers.io()).subscribeBy(
                    onError = {println("Error")},
                    onSuccess = {println("it.value")})
            }*/

            override fun onFailure(call: Call<MutableList<Joke>>, t: Throwable) {
                t.printStackTrace()
                Log.e("error", t.message.toString())
            }

        })

    }
}