package com.omdeep.mvvmcleantmdbproject.domain

import com.omdeep.mvvmcleantmdbproject.data.model.Movie

interface MovieRepository {
    suspend fun getMovies() : List<Movie>
    suspend fun updateMovie() : List<Movie>
}