package com.up.ads.musicapp.projeto.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.up.ads.musicapp.R
import com.up.ads.musicapp.projeto.db.Artista
import kotlinx.android.synthetic.main.artista_item.view.*

class ArtistaRecyclerAdapter internal constructor(context: Context):
RecyclerView.Adapter<ArtistaRecyclerAdapter.ViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var artistas = emptyList<Artista>()

    override fun onCreateViewHolder(holder: ViewGroup, position: Int): ViewHolder {
        val view = inflater.inflate(R.layout.artista_item, holder, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = artistas.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val current = artistas[position]
        holder.nomeArtista.text = current.nome
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val nomeArtista: TextView = itemView.txtArtistaNome
    }


}