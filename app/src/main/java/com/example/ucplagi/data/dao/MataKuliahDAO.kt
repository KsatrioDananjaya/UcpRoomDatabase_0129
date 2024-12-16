package com.example.ucplagi.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.ucplagi.data.entity.MataKuliah

@Dao
interface MataKuliahDAO {
    @Insert
    suspend fun insertMatakuliah(mataKuliah: MataKuliah)

    @Query("SELECT * FROM mataKuliah")
    suspend fun getAllMatakuliah(): List<MataKuliah>

}