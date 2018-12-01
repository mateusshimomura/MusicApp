package com.up.ads.musicapp.projeto.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.up.ads.musicapp.R
import com.up.ads.musicapp.projeto.adapter.ArtistaRecyclerAdapter
import com.up.ads.musicapp.projeto.viewmodel.ArtistaViewModel
import kotlinx.android.synthetic.main.artista_lista.*

class ListaArtistaActivity: AppCompatActivity() {

    private lateinit var artistaViewModel: ArtistaViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.artista_lista)

        val recyclerView = listaArtista
        val adapter = ArtistaRecyclerAdapter(this)
    }

}