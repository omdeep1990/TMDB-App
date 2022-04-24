package com.omdeep.mvvmcleantmdbproject.data.repository

import com.omdeep.mvvmcleantmdbproject.data.model.Movie

class CacheMovieDataSourceImpl : CacheMovieDataSource{
    private lateinit var movieList : ArrayList<Movie>
    override suspend fun getMovieFromCache(): List<Movie> {
        return movieList
    }

//    override suspend fun saveMovieIntoCache(): List<Movie> {
//        TODO("Not yet implemented")
//    }


    override suspend fun saveMovieIntoCache(listMovie: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(listMovie)
    }
}