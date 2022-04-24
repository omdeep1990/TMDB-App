package com.omdeep.mvvmcleantmdbproject.data.repository

import com.omdeep.mvvmcleantmdbproject.data.model.Movie
import retrofit2.Response

interface RemoteMovieDataSource {
    suspend fun getMovie() : Response<List<Movie>>
}