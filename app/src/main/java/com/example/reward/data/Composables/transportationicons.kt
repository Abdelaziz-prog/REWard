package com.example.reward.data.Composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.DirectionsWalk
import androidx.compose.material.icons.filled.DirectionsBus
import androidx.compose.material.icons.filled.DirectionsCar
import androidx.compose.material.icons.filled.DirectionsWalk
import androidx.compose.material.icons.filled.Motorcycle
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp




@Composable
fun TransportModes() {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)
    ) {
        IconButton(onClick = {}) { Icon(Icons.Default.DirectionsCar, contentDescription = null) }
        IconButton(onClick = {}) { Icon(Icons.Default.Motorcycle, contentDescription = null) }
        IconButton(onClick = {}) { Icon(Icons.Default.DirectionsBus, contentDescription = null) }
        IconButton(onClick = {}) { Icon(Icons.Default.DirectionsWalk, contentDescription = null) }
    }
}