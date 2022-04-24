package com.omdeep.mvvmcleantmdbproject.data.repository

import com.omdeep.mvvmcleantmdbproject.data.db.MovieDao
import com.omdeep.mvvmcleantmdbproject.data.model.Movie
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LocalDbDataSourceImpl(private var dao : MovieDao) : LocalDbDataSource{
    override suspend fun saveMovieIntoDb(movieList: List<Movie>) {
        CoroutineScope(Dispatchers.IO).launch {
            dao.insertMovie(movieList)
        }
    }

    override suspend fun getMovieFromDb(): List<Movie> {
        return dao.getMovie()
    }

    override suspend fun clearMovie() {
        dao.clearAll()
    }

}