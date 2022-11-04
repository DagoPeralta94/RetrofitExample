package com.example.retroexample

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {
    @GET("movie/popular")
    fun listTopRatedMovies(@Query("api_key") apiKey: String): Call<MovieDbResult>

}