
package com.example.todolistbrief.data.room.database

import android.content.Context
import com.example.todolistbrief.data.room.repositories.OTPCodeRepository
import com.example.todolistbrief.data.room.repositories.UserRepository

object Graph {
    private lateinit var todoListDatabase: TodoListDatabase
        private set

    val userRepository by lazy{
        UserRepository(
            userDao = todoListDatabase.userDao()
        )
    }

    val otpCodeRepository by lazy {
        OTPCodeRepository(
            otpCodeDao = todoListDatabase.otpCodeDao()
        )
    }

    fun provide(context: Context){
        todoListDatabase = TodoListDatabase.getDatabase(context = context)
    }

}