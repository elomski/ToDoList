package com.example.todolistbrief.data.room.repositories

import com.example.todolistbrief.data.room.daos.UserDao
import com.example.todolistbrief.data.room.models.User
import kotlinx.coroutines.flow.Flow

class UserRepository(
    private val userDao: UserDao
) {
    val usersList = userDao.usersList()

    suspend fun register(user: User){
        userDao.register(user)
    }
    fun getUserByEmail(email: String): Flow<List<User>> = userDao.getUserByEmail(email)
    fun activateUserByEmail(email: String) = userDao.activateUserByEmail(email)
}