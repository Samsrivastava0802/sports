package com.samridhi.ufmsports.network.model

data class FeaturedTournament (
    val tournament_list: List<Tournament>
)

data class Tournament(
    val tournament_id: String,
    val tournament_name: String,
    val match_list: List<MatchItem>,
    val prev_page: String,
   val  next_page :Int
)





