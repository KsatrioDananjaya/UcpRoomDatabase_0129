package com.example.ucplagi.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.ucplagi.data.dao.DosenDao
import com.example.ucplagi.data.dao.MataKuliahDAO
import com.example.ucplagi.data.entity.Dosen

@Database(entities = [Dosen::class], version = 1, exportSchema = false)
abstract class Database : RoomDatabase() {
    abstract  fun dosenDao() : DosenDao
    abstract  fun matakuliahDao(): MataKuliahDAO
}