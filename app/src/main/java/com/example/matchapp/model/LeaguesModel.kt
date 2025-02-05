package com.example.matchapp.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class LeaguesModel(
    @SerializedName("league")
    val league: String?,
    @SerializedName("key")
    val key: String?
):Serializable