package com.example.reward.ui.theme.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.reward.data.Composables.OffersSlider
import com.example.reward.data.Composables.bottombaricon

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dealsandpromotions(){

    Scaffold (modifier = Modifier, topBar = {
        CenterAlignedTopAppBar(title = {Text("Deals and promotions", fontWeight = FontWeight.Bold)})
    }
    ){paddingValues ->
        Column (modifier = Modifier.padding(paddingValues)){
            Spacer(modifier = Modifier.padding(10.dp))
            OffersSlider()
            Spacer(modifier = Modifier.padding(10.dp))
            Icon(
                imageVector = Icons.Default.MoreHoriz,
                contentDescription = null,
                tint = Color.Black
                , modifier = Modifier.size(35.dp)
                    .  offset(180.dp)


            )
             
        }
    }
}