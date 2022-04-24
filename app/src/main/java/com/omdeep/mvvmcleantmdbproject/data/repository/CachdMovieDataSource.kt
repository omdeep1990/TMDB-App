package com.omdeep.mvvmcleantmdbproject.data.repository

import com.omdeep.mvvmcleantmdbproject.data.model.Movie

interface CacheMovieDataSource {
    suspend fun getMovieFromCache() : List<Movie>
    suspend fun saveMovieIntoCache(listMovie: List<Movie>)
}