package com.up.ads.musicapp.projeto.db

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "musica")
data class Musica (
        @ColumnInfo(name = "artista_id")
        var artista_id: Long,
        @ColumnInfo(name = "nome")
        var nome: String,
        @ColumnInfo(name = "letra")
        var letra: String,
        @ColumnInfo(name = "foto")
        var foto: String
        ): Serializable {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long = 0
}