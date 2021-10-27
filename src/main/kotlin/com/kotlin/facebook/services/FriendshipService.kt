package com.kotlin.facebook.services

import com.kotlin.facebook.repositiories.Friendship
import com.kotlin.facebook.repositiories.FriendshipRepository
import org.springframework.stereotype.Service

@Service
class FriendshipService(val db: FriendshipRepository) {

    fun findFriendships(): List<Friendship> = db.findFriendships()

    fun post(friendship: Friendship){
        db.save(friendship)
    }
}