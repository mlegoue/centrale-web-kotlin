package com.kotlin.facebook.services

import com.kotlin.facebook.repositiories.User
import com.kotlin.facebook.repositiories.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(val db: UserRepository) {

    fun findUsers(): List<User> = db.findUsers()

    fun post(user: User){
        db.save(user)
    }
}