package com.example.reward.ui.theme.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.reward.data.Composables.RankingList
import com.example.reward.data.Composables.rankingHeader

@Composable
fun RankingScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        rankingHeader()

        RankingList()

        Spacer(modifier = Modifier.weight(1f))

        //  BottomNavigationBar()
    }
}