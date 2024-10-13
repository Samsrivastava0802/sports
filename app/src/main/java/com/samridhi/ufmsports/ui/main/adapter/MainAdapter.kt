package com.samridhi.ufmsports.ui.main.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.samridhi.ufmsports.R
import com.samridhi.ufmsports.network.model.Hi
import com.samridhi.ufmsports.network.model.MatchItem
import com.samridhi.ufmsports.network.model.MatchListItem
import com.samridhi.ufmsports.network.model.OfferListItem
import com.samridhi.ufmsports.network.model.Tournament
import com.samridhi.ufmsports.ui.main.viewholder.MyMatchesViewHolder
import com.samridhi.ufmsports.ui.main.viewholder.OfferPageViewHolder
import com.samridhi.ufmsports.ui.main.viewholder.TournamentViewHolder
import com.samridhi.ufmsports.ui.main.viewholder.UpcomingViewHolder


class MainAdapter(
    val context: Context
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

     val matchList = mutableListOf<MatchListItem>()
     val offerList = mutableListOf<OfferListItem>()
     val tournamentList = mutableListOf<Tournament>()
     val upcomingList= mutableListOf<MatchItem>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType){
          OfferType.TYPE_MY_MATCHES.ordinal -> {
              val itemView = LayoutInflater.from(parent.context).inflate(R.layout.my_matches_page,parent,false)
             MyMatchesViewHolder(itemView)
          }
            OfferType.TYPE_UPCOMING_MATCHES.ordinal -> {
                val itemView = LayoutInflater.from(parent.context).inflate(R.layout.offer_list_page, parent, false)
                OfferPageViewHolder(itemView)
            }
            OfferType.TYPE_INDIAN_T20_LEAGUE.ordinal -> {
                val itemView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.tournament_view, parent, false)
                TournamentViewHolder(itemView)
            }
            else -> {
                val itemView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.upcoming_match_item, parent, false)
                UpcomingViewHolder(itemView)
            }
        }
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is MyMatchesViewHolder -> holder.bind(matchList)
            is OfferPageViewHolder -> holder.bind(offerList,context)
            is TournamentViewHolder -> holder.bind(tournamentList)
            is UpcomingViewHolder -> holder
        }

    }

    override fun getItemViewType(position: Int): Int {
        return when (position) {
            0 -> OfferType.TYPE_MY_MATCHES.ordinal
            1 -> OfferType.TYPE_SECOND_VIEWPAGER.ordinal
            2 -> OfferType.TYPE_INDIAN_T20_LEAGUE.ordinal
            3 -> OfferType.TYPE_UPCOMING_MATCHES.ordinal
            else -> OfferType.TYPE_UPCOMING_MATCHES.ordinal
        }
    }
    fun submitList(hi: Hi) {
        matchList.addAll(hi.user_matches.match_list)
        offerList.addAll(hi.current_offers!!.offer_list)
        tournamentList.addAll(hi.featured_tournament!!.tournament_list)
        hi.upcoming_matches!!.match_list?.let {
            upcomingList.addAll(it)
            notifyDataSetChanged()
        }
    }


    override fun getItemCount(): Int {
        return 3 + upcomingList.size

    }

}
enum class OfferType{
    TYPE_MY_MATCHES,
    TYPE_SECOND_VIEWPAGER,
    TYPE_INDIAN_T20_LEAGUE,
    TYPE_UPCOMING_MATCHES
}