package com.samridhi.ufmsports.network.model

data class UserMatches(
    val match_list: List<MatchListItem>
)

data class MatchListItem (
    val matchItem: MatchItem,
    val user_contests:Int,
    val user_teams:Int,
    val top_running_rank:Int
)
