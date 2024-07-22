package com.example.todolistbrief.data.room.daos

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import kotlinx.coroutines.flow.Flow
import androidx.room.Dao
import androidx.room.Query
import com.example.todolistbrief.data.room.models.OTPCode
@Dao
interface OTPCodeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(otpCode: OTPCode)

    @Query("SELECT* FROM otp_codes WHERE email =:email AND code =:code")
    fun checkOtpCode(email:String, code: String): Flow<List<OTPCode>>
}