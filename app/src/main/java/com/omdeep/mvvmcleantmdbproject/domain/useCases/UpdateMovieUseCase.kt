package com.omdeep.mvvmcleantmdbproject.domain.useCases

import com.omdeep.mvvmcleantmdbproject.data.model.Movie
import com.omdeep.mvvmcleantmdbproject.domain.MovieRepository

class UpdateMovieUseCase(private val movieRepository: MovieRepository) {
    suspend fun updateMovies() : List<Movie> {
        return movieRepository.updateMovie()
    }
}