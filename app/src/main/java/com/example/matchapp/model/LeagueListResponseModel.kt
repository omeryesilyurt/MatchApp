package com.example.matchapp.model

import com.google.gson.annotations.SerializedName

data class LeagueListResponseModel(
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("result")
    val result: List<LeaguesModel>
)
