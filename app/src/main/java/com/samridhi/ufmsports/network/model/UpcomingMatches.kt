package com.samridhi.ufmsports.network.model

data class UpcomingMatches(
    val match_list:List<MatchItem>,
    val prev_page: Int,
    val next_page: Int
)

data class MatchItem(
   val id:String,
   val name: String,
   val match_format:String,
   val tournament_name: String,
   val status: String,
   val starts_at: Long,
   val teams: Teams,
   val match_offers: List<MatchOffers>,
    val metadata: MetaData
)

data class Teams(
    val a: TeamData,
    val b: TeamData
)

data class TeamData(
   val  name:String,
   val code:String,
   val logo_url:String,
   val logo_bg_color:String
)

data class MatchOffers(
   val offer_icon_url:String,
   val title:String,
   val subtext:String
)
data class MetaData(
   val is_lineup_out: Boolean,
    val is_match_initialized : Boolean
)






