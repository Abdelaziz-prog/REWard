package com.example.reward.data.Composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.reward.R

@Composable
fun bottombaricon(){
    NavigationBar {
        NavigationBarItem(
            selected = true,
            onClick = {},
            icon = { Icon(Icons.Default.Home, "", modifier = Modifier.size(35.dp)) }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = { Icon(Icons.Default.Person, null, modifier = Modifier.size(35.dp)) }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Surface(
                    modifier = Modifier.size(56.dp),
                    shape = CircleShape,
                    color = Color.White,
                    shadowElevation = 5.dp
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Icon(
                            painter = painterResource(id = R.drawable.qr),
                            contentDescription = "QR Code",
                            modifier = Modifier.size(35.dp),
                            tint = Color.Black
                        )
                    }
                }
            }

        )
        NavigationBarItem(
            selected = false,
            onClick = {}, icon = {
                Icon(
                    modifier = Modifier.size(35.dp),
                    painter = painterResource(id = R.drawable.barchart),
                    contentDescription = "Statistics" // وصف الأيقونة

                )
            })
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = { Icon(Icons.Default.LocationOn, null, modifier = Modifier.size(35.dp)) }
        )

    }}