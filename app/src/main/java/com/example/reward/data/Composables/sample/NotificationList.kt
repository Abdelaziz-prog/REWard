package com.example.reward.data.Composables.sample

import com.example.reward.R
import com.example.reward.data.Composables.model.NotificationEntity

val notificationsList = listOf(
    NotificationEntity(
        title = "Hi Layla,",
        message = "Your recycling request has been approved",
        time = "Today",
        icon = R.drawable.recycle_icon
    ),
    NotificationEntity(
        title = "Congratulations !",
        message = "You're close to the top 3! One more recycling drop to go!",
        time = "1 day ago",
        icon = R.drawable.medal_icon
    ),
    NotificationEntity(
        title = "Hi Layla,",
        message = "You successfully recycled 20 plastic bottles today",
        time = "1 day ago",
        icon = R.drawable.bottle_icon
    ),NotificationEntity(
        title = "Hi Layla,",
        message = "Your recycling request has been approved",
        time = "2 days ago",
        icon = R.drawable.recycle_icon
    ),
    NotificationEntity(
        title = "Congratulations !",
        message = "You're close to the top 3! One more recycling drop to go!",
        time = "3 days ago",
        icon = R.drawable.medal_icon
    ),
    NotificationEntity(
        title = "Hi Layla,",
        message = "You successfully recycled 20 plastic bottles today",
        time = "4 days ago",
        icon = R.drawable.bottle_icon
    ),
    NotificationEntity(
        title = "Congratulations !",
        message = "You're close to the top 3! One more recycling drop to go!",
        time = "5 days ago",
        icon = R.drawable.medal_icon
    )

)