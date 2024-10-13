package com.samridhi.ufmsports.ui.main.viewAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.samridhi.ufmsports.R
import com.samridhi.ufmsports.network.model.Tournament

class TournamentAdapter(

    private val tournament: List<Tournament>
): RecyclerView.Adapter<TournamentAdapter.TournamentViewHolder>() {

    class TournamentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TournamentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.tournament_item,parent,false)
        return TournamentViewHolder(view)
    }

    override fun onBindViewHolder(holder: TournamentViewHolder, position: Int) {

    }
    override fun getItemCount(): Int {
        return 10
    }
}