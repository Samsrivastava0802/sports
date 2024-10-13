package com.samridhi.ufmsports.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.samridhi.ufmsports.R
import com.samridhi.ufmsports.network.model.MatchListItem

class MyMatchesViewPager: RecyclerView.Adapter<MyMatchesViewPager.MyMatchesViewHolder>() {
    var matchlist = mutableListOf<MatchListItem>()

    class MyMatchesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyMatchesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.offer_item,parent,false)
        return MyMatchesViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: MyMatchesViewHolder, position: Int) {
       
    }

    override fun getItemCount(): Int {
        return matchlist.size
    }
}


