package com.samridhi.ufmsports.ui.main.viewholder

import android.graphics.Color
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.samridhi.ufmsports.R
import com.samridhi.ufmsports.network.model.MatchListItem
import com.samridhi.ufmsports.ui.main.viewAdapter.MyMatchesAdapter

class MyMatchesViewHolder(
    itemView: View
): RecyclerView.ViewHolder(itemView) {

    private val rv: RecyclerView = itemView.findViewById(R.id.rvMyMatches)

    fun bind(matches: List<MatchListItem>){
        val adapter = MyMatchesAdapter(matches)
    rv.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL,false)
        rv.adapter = adapter

        val snapHelper = PagerSnapHelper()
        rv.onFlingListener = null;
        snapHelper.attachToRecyclerView(rv)
    }

}