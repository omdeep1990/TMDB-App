package com.omdeep.mvvmcleantmdbproject.domain.useCases

import com.omdeep.mvvmcleantmdbproject.data.model.Movie
import com.omdeep.mvvmcleantmdbproject.domain.MovieRepository

class GetMovieUseCase(private val movieRepository: MovieRepository) {
    suspend fun getMovie() : List<Movie> {
        return movieRepository.getMovies()
    }
}