package com.up.ads.musicapp.projeto.db

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "artista")
data class Artista (
        @ColumnInfo(name = "nome")
        var nome: String,
        @ColumnInfo(name = "foto")
        var foto: String,
        @ColumnInfo(name = "descricao")
        var descricao: String
        ): Serializable {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long = 0
}