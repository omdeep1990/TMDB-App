package com.omdeep.mvvmcleantmdbproject.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.omdeep.mvvmcleantmdbproject.data.model.Movie

@Database(entities = [Movie::class], version = 1)
abstract class MovieDatabase : RoomDatabase() {
    abstract val dao : MovieDao

    companion object{
        private val INSTANCE : MovieDatabase? = null
        fun getInstance(context : Context) : MovieDatabase{
            var instance = INSTANCE
            if (instance == null){
                instance = Room.databaseBuilder(context.applicationContext,
                MovieDatabase::class.java, "movieDb").build()
            }
            return instance
        }
    }
}