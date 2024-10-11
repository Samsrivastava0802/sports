package com.samridhi.ufmsports.ui.main.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.samridhi.ufmsports.R
import com.samridhi.ufmsports.network.model.OfferListItem


class MainAdapter(
    val context: Context
) : RecyclerView.Adapter<MainAdapter.ItemViewHolder>() {

    private var list: MutableList<OfferListItem> = mutableListOf()



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
     val itemView = LayoutInflater.from(parent.context).inflate(R.layout.offer_list,parent,false)
        return ItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

    }


    override fun getItemCount(): Int {
     return list.size
    }


    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view){
       val yuvImageView: ImageView

        init {
          yuvImageView = view.findViewById(R.id.ivOfferImage)
        }
    }

}