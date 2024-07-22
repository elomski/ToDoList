package com.example.todolistbrief.data.room.repositories

import com.example.todolistbrief.data.room.models.OTPCode
import com.example.todolistbrief.data.room.daos.OTPCodeDao
import kotlinx.coroutines.flow.Flow

class OTPCodeRepository(
    private val otpCodeDao: OTPCodeDao
)

{

    suspend fun insert(otpCode: OTPCode){ otpCodeDao.insert(otpCode) }
    fun checkOtpCode(email: String, code: String): Flow<List<OTPCode>> = otpCodeDao.checkOtpCode(email, code)
}