package com.example.ucplagi.data.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity (tableName = "mataKuliah")
data class MataKuliah(
    @PrimaryKey
    val kode: String,
    val nama: String,
    val sks: Int,
    val semester: Int,
    val jenis: String,
    val dosenPengampu: String
)