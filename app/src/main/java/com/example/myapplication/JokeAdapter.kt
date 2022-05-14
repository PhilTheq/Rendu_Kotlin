package com.example.myapplication


import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.JokeAdapter

class JokeAdapter : RecyclerView.Adapter<JokeAdapter.JokeViewHolder>(){
    class JokeViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    var list_jokes = listOf("The Pope once tried to bless Chuck Norris. Nobody crosses Chuck Norris.",
        "Chuck Norris uses a flamethrower to light his BBQ.",
        "Chuck Norris gives computers viruses",
        "Chuck Norris can cover a Beatles song on Youtube and won't get comments saying he ruined the song.",
        "There is only 1 person in the world who can kill Chuck Norris, ITS HIS EVIL TWIN Chack Norris",
        "Chuck Norris never asks if you are talking to him.",
        "Chuck Norris once won an arm wrestling match,with both hands tied behind his back",
        "Chuck Norris can connect parallel lines",
        "Unlike Santa Claus, Chuck Norris doesn't need to check his list twice.",
        "Chuck Norris can login without signing up, on any website.")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokeViewHolder {
        val textView = TextView(parent.context)
        return JokeViewHolder(textView)
    }

    override fun onBindViewHolder(holder: JokeViewHolder, position: Int) {
        val joke = list_jokes[position]
        holder.textView.text = joke
    }

    override fun getItemCount(): Int {
        return list_jokes.size
    }
}

