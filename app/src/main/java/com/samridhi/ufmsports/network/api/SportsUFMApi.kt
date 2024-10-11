package com.samridhi.ufmsports.network.api

import com.samridhi.ufmsports.network.model.Hi
import retrofit2.http.GET

interface SportsUFMApi {

   @GET("data-pipeline/v1/mock-frontend/homepage/1")
     suspend fun getSportsData(
     ): Hi
}