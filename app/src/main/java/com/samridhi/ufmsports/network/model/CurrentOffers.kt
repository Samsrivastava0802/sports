package com.samridhi.ufmsports.network.model

data class CurrentOffers (
    val offer_list: List<OfferListItem>
)

data class OfferListItem (
    val offer_banner_url: String,
    val type: String
)
