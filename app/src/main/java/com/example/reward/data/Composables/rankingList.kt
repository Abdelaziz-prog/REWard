package com.example.reward.data.Composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.reward.data.Composables.model.RankingEntity
import com.example.reward.data.Composables.sample.rankingList

@Composable
fun RankingList() {
    LazyColumn {

        items(rankingList) { item ->
            RankingRow(item)
        }
    }
}
@Composable
fun RankingRow(item: RankingEntity) {

    val bgColor =
        if (item.isCurrentUser) Color(0xFF134F49) else Color.White

    val textColor =
        if (item.isCurrentUser) Color.White else Color.Black

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(bgColor)
            .padding(16.dp)
            .padding(horizontal = 13.dp)
        ,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Row(verticalAlignment = Alignment.CenterVertically) {

            Image(
                painter = painterResource(id = item.image),
                contentDescription = null,
                modifier = Modifier
                    .size(45.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Text(item.name, color = textColor)
        }

        Text("${item.points}", color = textColor)
        Text("${item.place}", color = textColor)
    }
}