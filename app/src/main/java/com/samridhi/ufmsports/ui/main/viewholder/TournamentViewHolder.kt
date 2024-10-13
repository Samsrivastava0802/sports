package com.samridhi.ufmsports.ui.main.viewholder

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.samridhi.ufmsports.R
import com.samridhi.ufmsports.network.model.Tournament
import com.samridhi.ufmsports.ui.main.viewAdapter.TournamentAdapter

class TournamentViewHolder(
    itemView: View
): RecyclerView.ViewHolder(itemView)  {
    private val rvTournament: RecyclerView = itemView.findViewById(R.id.rvtournament)

    fun bind(tournaments: List<Tournament>){
      val adapter = TournamentAdapter(tournaments)
        rvTournament.setHasFixedSize(true)
        rvTournament.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
        rvTournament.adapter = adapter

        val snapHelper = PagerSnapHelper()
        rvTournament.onFlingListener = null;
        snapHelper.attachToRecyclerView(rvTournament)

    }

}