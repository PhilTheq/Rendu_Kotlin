package com.example.myapplication

import kotlin.random.Random
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val d = Log.d("ListOfJokes", ListOfJokes.toString())

        val btn = findViewById(R.id.button) as Button
        val textView = findViewById(R.id.textView3) as TextView
        val recyclerview = findViewById<RecyclerView>(R.id.activity_main_recycler_view)

        recyclerview.adapter = JokeAdapter()


        btn.setOnClickListener {
            var randomIndex = Random.nextInt(Joke_list.size);
            var randomElement = Joke_list[randomIndex]

            randomElement = randomElement;
            activity_main_recycler_view.text = randomElement.toString();
            Toast.makeText(this@MainActivity, "Another Joke ? :D", Toast.LENGTH_SHORT).show()
        }
    }
        object ListOfJokes {
            val Joke_list = listOf<String>(
                "Those aren't credits that roll after Walker Texas Ranger. It is actually a list of fatalities that occurred during the making of the episode.",
                "The devil has a Chuck Norris-may-care attitude.",
                "Chuck Norris roundhouse kicked the winnyness out of Caillou.",
                "The Most Interesting Man in the World's hair is not actually grey. It's actually covered with Chuck Norris' sperm.",
                "Freddy thought he was the true nightmare until he met Chuck Norris who roundhouse kicked and from that day Freddy hides in fear thinking a nightmare in texas",
                "Chuck Norris can drink a bucket of KFC.",
                "Mike Tyson was overheard saying he would bite a live cobra before he would bite Chuck Norris' ear.",
                "Chuck Norris often works out in public. He was spotted last week on Hwy 66 roundhouse kicking tornados as a warm up.",
                "Medusa's hair is made of snakes. Chuck Norris's beard is made of hair-colored barbed wire. Medusa can turn you into stone by staring at you. Chuck Norris doesn't have to look at you to turn you into pulp.",
                "When Chuck Norris stares at you your balls drop to the ground",
                "Chuck Norris is the only person on Earth who can literally be beside himself. You don't want to be around when they do that.",
                "Chuck Norris smelly breath is so strong that he can demolish a house just by breathing on it."
            )
        }






}