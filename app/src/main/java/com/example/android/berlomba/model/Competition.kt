package com.example.android.berlomba.model

import androidx.annotation.DrawableRes

// data class to represent the information presented in the competition card

class Competition (
    @DrawableRes val imageResourceId: Int,
    val title: String,
    val organizer: String,
    val description: String
)