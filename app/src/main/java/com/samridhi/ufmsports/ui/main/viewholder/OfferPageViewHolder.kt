package com.samridhi.ufmsports.ui.main.viewholder

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.samridhi.ufmsports.R
import com.samridhi.ufmsports.network.model.OfferListItem
import com.samridhi.ufmsports.ui.main.viewAdapter.OfferViewAdapter

class OfferPageViewHolder(
    itemView: View
): RecyclerView.ViewHolder(itemView) {
    private val rvoffer: RecyclerView = itemView.findViewById(R.id.rvOffer)

    fun bind(offers: List<OfferListItem>,context: Context){
        val adapter = OfferViewAdapter(context,offers)
        rvoffer.setHasFixedSize(true)
        rvoffer.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
        rvoffer.adapter = adapter

        val snapHelper = PagerSnapHelper()
        rvoffer.onFlingListener = null;
        snapHelper.attachToRecyclerView(rvoffer)
    }


}