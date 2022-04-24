package com.omdeep.mvvmcleantmdbproject.data.repository

import com.omdeep.mvvmcleantmdbproject.data.model.Movie
import com.omdeep.mvvmcleantmdbproject.data.model.MovieList

interface LocalDbDataSource {
    suspend fun saveMovieIntoDb(movieList: List<Movie>)
    suspend fun getMovieFromDb() : List<Movie>
    suspend fun clearMovie()
}