package com.up.ads.musicapp.projeto.db

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface MusicaDao {

    @Insert
    fun insert(musica: Musica)

    @Query("DELETE FROM musica where id = :id")
    fun delete(id: Long)

    @Query("SELECT * FROM  musica where artista_id = :artista_id")
    fun get(artista_id: Long): LiveData<List<Musica>>
}