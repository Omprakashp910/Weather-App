package com.example.weatherapp.model

import java.io.Serializable

data class Sys(
    val type: Int,
    val message: Double,
    val country: String,
    val sunrise: Int,
    val sunset: Int
) : Serializable