package com.up.ads.musicapp.projeto.repository

import android.arch.lifecycle.LiveData
import com.up.ads.musicapp.projeto.db.Artista
import com.up.ads.musicapp.projeto.db.ArtistaDao

class ArtistaRepository(private val artistaDao: ArtistaDao) {

    val allArtistas: LiveData<List<Artista>> = artistaDao.get()

    fun insert(artista: Artista) {
        artistaDao.insert(artista)
    }

}