package com.example.myroomsatu.repositori

import com.example.myroomsatu.room.Siswa
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswa(): Flow<List<Siswa>>
    suspend fun insert(siswa: Siswa)
}