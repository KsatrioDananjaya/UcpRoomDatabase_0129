package com.example.ucplagi.data.dao

import androidx.room.Dao
import androidx.room.Delete
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

    @Update
    suspend fun updateMatakuliah(mataKuliah: MataKuliah)

    @Query("SELECT * FROM mataKuliah WHERE kode = :kode")
    suspend fun getDetailMataKuliah(kode: String): MataKuliah
}