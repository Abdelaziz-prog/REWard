package com.example.reward.data.Composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun OTPInput() {

    Row(
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        repeat(4) {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .width(55.dp)
                    .height(55.dp),
                singleLine = true,
                shape = RoundedCornerShape(12.dp)
            )
        }
    }
}