package com.example.weatherapp.network


import com.example.weatherapp.model.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


//interface WeatherService {
//
//    @GET("2.5/weather")
//    fun getWeather(
//        @Query("lat") lat: Double,
//        @Query("lon") lon: Double,
//        @Query("units") units: String?,
//        @Query("appid") appid: String?
//    ): Call<WeatherResponse>
//}


interface WeatherService {
    @GET("weather")
    fun getWeather(
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double,
        @Query("units") units: String,
        @Query("appid") apiKey: String
    ): Call<WeatherResponse>
}