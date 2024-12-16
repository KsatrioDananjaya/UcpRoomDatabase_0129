package com.example.ucplagi.data.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity (tableName = "mataKuliah",
        foreignKeys = [ForeignKey(
    entity = com.example.ucplagi.data.entity.Dosen::class,
    parentColumns = ["nidn"],
            ["dosenPengampu"],
            onDelete =
                ForeignKey.CASCADE
    )]
)
data class MataKuliah(
    @PrimaryKey
    val kode: String,
    val nama: String,
    val sks: Int,
    val semester: Int,
    val jenis: String,
    val dosenPengampu: String
)