package com.example.matchapp.network

import com.example.matchapp.model.LeagueListResponseModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("leaguesList")
    suspend fun getLeaguesList(

    ): Call<LeagueListResponseModel>
}