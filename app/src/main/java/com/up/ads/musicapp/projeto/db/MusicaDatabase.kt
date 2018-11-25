package com.up.ads.musicapp.projeto.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import kotlinx.coroutines.experimental.CoroutineScope

@Database(entities = [Musica::class], version = 1)
abstract class MusicaDatabase: RoomDatabase() {

    abstract fun MusicaDao(): MusicaDao


    companion object {

        @Volatile
        private var INSTANCE: MusicaDatabase? = null

        fun getDatabase(context: Context, scope: CoroutineScope): MusicaDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                        context.applicationContext,
                        MusicaDatabase::class.java,
                        "musica-database"
                )
                        .fallbackToDestructiveMigration()
                        .build()
                INSTANCE = instance
                instance
            }
        }


    }
}