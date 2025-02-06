package com.example.matchapp.uiscreens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.matchapp.businesslogic.LeagueViewModel
import androidx.compose.ui.Modifier
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(viewModel: LeagueViewModel = hiltViewModel()) {
    val leaguesState = viewModel.leagues.collectAsState()
    val leagues = leaguesState.value

    LazyColumn {
        items(leagues) { league ->
            Text(
                text = league,
                fontSize = 18.sp,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}