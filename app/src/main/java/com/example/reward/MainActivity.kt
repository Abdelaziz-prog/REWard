package com.example.reward

import LoginScreen
import MapScreen


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.reward.data.Composables.homeHeader
import com.example.reward.data.Composables.reHeader
import com.example.reward.ui.theme.Screens.HomeScreen

import org.osmdroid.config.Configuration


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Configuration.getInstance().load(this, getSharedPreferences("osm", MODE_PRIVATE))
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
          // LoginScreen()
             // SignUpScreen()
            // reHeaderLogo()
            // reHeader()
            // HomeHeader()
            // homeHeader()
           // HomeScreen()
            MapScreen()
        }
    }
}
