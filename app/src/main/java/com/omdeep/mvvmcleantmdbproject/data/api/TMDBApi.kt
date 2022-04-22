package com.omdeep.mvvmcleantmdbproject.data.api

import com.omdeep.mvvmcleantmdbproject.data.model.MovieList
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBApi {
    @GET("/movie/popular")
    suspend fun getMovie(@Query("api_key") apikey : String) : List<MovieList>
}