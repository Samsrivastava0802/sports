package com.samridhi.ufmsports.ui.main.viewAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.samridhi.ufmsports.R
import com.samridhi.ufmsports.network.model.MatchItem
import com.samridhi.ufmsports.network.model.MatchListItem

class MyMatchesAdapter(
    private val matches: List<MatchListItem>
):RecyclerView.Adapter<MyMatchesAdapter.MyMatchViewHolder>() {

    class MyMatchViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
         val oneDayTextView : TextView
         val womenTextView : TextView
         val liveTextView : TextView
         val joinedTeamsTextView : TextView
         val contestTextView : TextView
         val topRunningRankTextView : TextView

        init{
            oneDayTextView = itemView.findViewById(R.id.tvT20)
            womenTextView = itemView.findViewById(R.id.tvWomenCup)
            liveTextView = itemView.findViewById(R.id.tvLive)
            joinedTeamsTextView = itemView.findViewById(R.id.tvJoinedTeams)
            contestTextView = itemView.findViewById(R.id.tvContest)
            topRunningRankTextView = itemView.findViewById(R.id.tvTopRunningRank)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyMatchViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.my_matches_item,parent,false)
        return MyMatchViewHolder(view)
    }
    override fun onBindViewHolder(holder: MyMatchViewHolder, position: Int) {
          holder.oneDayTextView.text = matches.get(position).match?.match_format
          holder.womenTextView.text = matches.get(position).match?.tournament_name
          holder.joinedTeamsTextView.text = matches.get(position).user_teams.toString()
          holder.contestTextView.text = matches.get(position).user_contests.toString()
          holder.topRunningRankTextView.text = matches.get(position).top_running_rank.toString()
    }

    override fun getItemCount(): Int {
     return  matches.size
    }

}