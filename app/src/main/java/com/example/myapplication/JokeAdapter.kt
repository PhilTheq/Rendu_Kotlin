package com.example.myapplication


import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View

/* Redefinition de la fonction onCreateViewHolder pour qu'elle affiche maintenant notre list<Joke>*/


class JokeAdapter(val list_jokes: MutableList<Joke>) : RecyclerView.Adapter<JokeViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokeViewHolder {
        val textView = LayoutInflater.from(parent.context).inflate(R.layout.joke_layout, parent, false)
        return JokeViewHolder(textView)
    }

    override fun onBindViewHolder(holder: JokeViewHolder, position: Int) {
        return holder.bindView(list_jokes[position])
    }

    override fun getItemCount(): Int {
        return list_jokes.size
    }

    fun setJokes(Joke : Joke)   {
        this.list_jokes.add(Joke)
    }
    }

class JokeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    private val tvValue: TextView = itemView.findViewById(R.id.tvValue)

    fun bindView(postModel: Joke){
        tvValue.text = postModel.body

    }
}



