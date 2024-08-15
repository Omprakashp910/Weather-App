package com.weatherapp.models

import java.io.Serializable

data class Main(
    val temp: Double,       // Changed from Int to Double
    val pressure: Int,
    val humidity: Int,
    val tempMin: Double,    // Changed from Int to Double
    val tempMax: Double     // Changed from Int to Double
) : Serializable
