package com.example.myapplication


import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class JokeAdapter (private var list_jokes: List<Joke>): RecyclerView.Adapter<JokeAdapter.JokeViewHolder>(){
    class JokeViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokeViewHolder {
        val textView = TextView(parent.context)
        textView.layoutParams = RecyclerView.LayoutParams( ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)
        return JokeViewHolder(textView)
    }

    override fun onBindViewHolder(holder: JokeViewHolder, position: Int) {
        holder.textView.text = list_jokes[position].value
    }

    override fun getItemCount(): Int {
        return list_jokes.size
    }

}

