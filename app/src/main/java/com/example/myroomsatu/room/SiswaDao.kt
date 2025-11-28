package com.example.myroomsatu.room

import androidx.room.Dao
import androidx.room.Query

@Dao

interface SiswaDao {
    @Query("SELECT * FROM tblSiswa ORDER BY nama ASC")
    fun getAllSiswa(): List<Siswa>
}