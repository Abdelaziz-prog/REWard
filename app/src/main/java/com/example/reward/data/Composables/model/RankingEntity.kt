package com.example.reward.data.Composables.model

data class RankingEntity(
    val name: String,
    val points: Int,
    val place: Int,
    val image: Int,
    val isCurrentUser: Boolean = false
)
