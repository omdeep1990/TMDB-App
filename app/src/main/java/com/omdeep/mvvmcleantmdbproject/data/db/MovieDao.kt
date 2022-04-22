package com.omdeep.mvvmcleantmdbproject.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.omdeep.mvvmcleantmdbproject.data.model.Movie
import com.omdeep.mvvmcleantmdbproject.data.model.MovieList

@Dao
interface MovieDao {

    @Insert
    suspend fun insertMovie(movie : List<Movie>) : Long

    @Update
    suspend fun updateMovie(movie: List<Movie>) : Long

    @Query("SELECT * FROM movie_table")
    suspend fun getMovie() : List<Movie>

    @Query("DELETE FROM movie_table")
    suspend fun clearAll()
}