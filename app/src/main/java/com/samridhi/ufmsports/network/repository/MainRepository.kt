package com.samridhi.ufmsports.network.repository

import com.samridhi.ufmsports.network.api.SportsUFMApi
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val api : SportsUFMApi
){
    suspend fun getSportsData() = api.getSportsData()

}