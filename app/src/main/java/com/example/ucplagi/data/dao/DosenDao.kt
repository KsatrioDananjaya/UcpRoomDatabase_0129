package com.example.ucplagi.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.ucplagi.data.entity.Dosen

@Dao
interface DosenDao {
    @Insert
    suspend fun insertDosen(dosen: Dosen)

    @Query("SELECT * FROM dosen")
    suspend fun getAllDosen(): List<Dosen>
}