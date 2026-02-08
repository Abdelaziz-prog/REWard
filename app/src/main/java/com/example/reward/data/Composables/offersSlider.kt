package com.example.reward.data.Composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.reward.R

@Composable
fun OffersSlider(modifier: Modifier = Modifier) {
    val offerImages = listOf(
        R.drawable.bigmac,
        R.drawable.papajohns,
        R.drawable.suchi,
    )
    LazyRow(
        modifier = modifier,
        contentPadding = PaddingValues(start = 16.dp, end = 80.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(offerImages) { imgRes ->
            OfferCard(imageRes = imgRes)
        }
    }
}

@Composable
fun OfferCard(imageRes: Int) {
    Box(
        modifier = Modifier
            .width(150.dp)
            .height(150.dp)
            .clip(RoundedCornerShape(16.dp))
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}