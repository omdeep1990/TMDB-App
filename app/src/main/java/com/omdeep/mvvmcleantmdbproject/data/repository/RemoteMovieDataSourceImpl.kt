package com.omdeep.mvvmcleantmdbproject.data.repository

import com.omdeep.mvvmcleantmdbproject.data.api.TMDBApi
import com.omdeep.mvvmcleantmdbproject.data.model.Movie
import retrofit2.Response

class RemoteMovieDataSourceImpl(private val tmdbApi: TMDBApi,
                                private val apiKey : String) : RemoteMovieDataSource{
    override suspend fun getMovie(): Response<List<Movie>> {
        return tmdbApi.getMovie(apiKey)
    }
}