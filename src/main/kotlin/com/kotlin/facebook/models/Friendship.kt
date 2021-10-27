package com.kotlin.facebook.models

class Friendship (
    val user1: User,
    val user2 : User,
) {
//    init {
//        user1.addFriend(user2);
//        user2.addFriend(user1)
//    }

    fun show(){
        println("${user1.fullName()} et ${user2.fullName()} sont amis.")
    }
}