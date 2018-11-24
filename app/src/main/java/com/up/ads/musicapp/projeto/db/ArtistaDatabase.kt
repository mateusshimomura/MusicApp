package com.up.ads.musicapp.projeto.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = [Artista::class], version = 1)
abstract class ArtistaDatabase: RoomDatabase() {

    abstract fun ArtistaDao(): ArtistaDao

}