package com.up.ads.musicapp.projeto.db

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

interface MusicaDao {

    @Insert
    fun insert(musica: Musica)

    @Query("DELETE FROM musica where id = :id")
    fun delete(id: Long)

    @Query("SELECT * FROM  musica")
    fun get(): LiveData<List<Musica>>
}