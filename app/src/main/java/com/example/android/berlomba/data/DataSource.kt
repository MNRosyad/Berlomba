package com.example.android.berlomba.data

import com.example.android.berlomba.R
import com.example.android.berlomba.model.Competition

// An object to generate a static list of competition

object DataSource {
    operator fun get(position: Int): Any {
        return competitions
    }

    val competitions: List<Competition> = listOf(
        Competition(
            R.drawable.comp_poster_clapeyron,
            "Lorem ipsum dolor sit amet",
            "Lorem ipsum",
            "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim."
        ),
        Competition(
            R.drawable.comp_poster_clapeyron,
            "Lorem ipsum dolor sit amet",
            "Lorem ipsum",
            "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim."
        ),
        Competition(
            R.drawable.comp_poster_clapeyron,
            "Lorem ipsum dolor sit amet",
            "Lorem ipsum",
            "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim."
        ),
        Competition(
            R.drawable.comp_poster_clapeyron,
            "Lorem ipsum dolor sit amet",
            "Lorem ipsum",
            "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim."
        ),
        Competition(
            R.drawable.comp_poster_clapeyron,
            "Lorem ipsum dolor sit amet",
            "Lorem ipsum",
            "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim."
        ),
        Competition(
            R.drawable.comp_poster_clapeyron,
            "Lorem ipsum dolor sit amet",
            "Lorem ipsum",
            "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim."
        )
    )
}