package com.up.ads.musicapp.projeto.db

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface ArtistaDao {

    @Insert
    fun insert(artista: Artista)

    @Query("DELETE FROM artista where id = :id")
    fun delete(id: Long)

    @Query("SELECT * FROM artista")
    fun get(): LiveData<List<Artista>>
}