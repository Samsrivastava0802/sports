package com.samridhi.ufmsports.network.model

data class UserMatches(
    val match_list: List<MatchListItem>
)

data class MatchListItem (
    val match: MatchItem? = null,
    val user_contests:Int? = null,
    val user_teams:Int? = null,
    val top_running_rank:Int? = null
)
