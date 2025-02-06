package com.example.matchapp.businesslogic

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.matchapp.network.ApiService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LeagueViewModel @Inject constructor(
    private val apiService: ApiService
) : ViewModel() {

    private val _leagues = MutableStateFlow<List<String>>(emptyList())
    val leagues = _leagues.asStateFlow()

    init {
        fetchLeagues()
    }

    private fun fetchLeagues() {
        viewModelScope.launch {
            try {
                val response = apiService.getLeaguesList()
                if (response.success) {
                    _leagues.value = response.result.map { it.league ?: "Bilinmeyen Lig" }
                }
            } catch (e: Exception) {
                println("${e.message}")
            }
        }
    }
}
