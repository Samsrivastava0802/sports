package com.samridhi.ufmsports.ui.main.viewAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.samridhi.ufmsports.R
import com.samridhi.ufmsports.network.model.OfferListItem

class OfferViewAdapter(
     val context: Context,
   private val  offers: List<OfferListItem>
): RecyclerView.Adapter<OfferViewAdapter.OfferViewHolder>() {

    class OfferViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val offerAdsImageView: ImageView

        init {
          offerAdsImageView = itemView.findViewById(R.id.ivOffer)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfferViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.offer_item, parent, false)
        return OfferViewHolder(view)
    }

    override fun onBindViewHolder(holder: OfferViewHolder, position: Int) {
       Glide.with(context)
           .load(offers.get(position).offer_banner_url)
           .into(holder.offerAdsImageView)
    }
    override fun getItemCount(): Int {
      return  offers.size
    }
}


