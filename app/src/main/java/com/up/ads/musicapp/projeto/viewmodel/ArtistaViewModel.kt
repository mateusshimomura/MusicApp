package com.up.ads.musicapp.projeto.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import com.up.ads.musicapp.projeto.db.Artista
import com.up.ads.musicapp.projeto.db.ArtistaDatabase
import com.up.ads.musicapp.projeto.repository.ArtistaRepository
import kotlinx.coroutines.experimental.CoroutineScope
import kotlinx.coroutines.experimental.Dispatchers
import kotlinx.coroutines.experimental.Job
import kotlinx.coroutines.experimental.android.Main
import kotlin.coroutines.experimental.CoroutineContext

class ArtistaViewModel(application: Application): AndroidViewModel(application) {

    private val repository: ArtistaRepository
    val allArtistas: LiveData<List<Artista>>
    private var parentJob = Job()
    private val coroutineContext: CoroutineContext
        get() = parentJob + Dispatchers.Main
    private val scope = CoroutineScope(coroutineContext)


    init {
        val artistaDao = ArtistaDatabase.getDatabase(application, scope).ArtistaDao()
        repository = ArtistaRepository(artistaDao)
        allArtistas = repository.allArtistas
    }



}