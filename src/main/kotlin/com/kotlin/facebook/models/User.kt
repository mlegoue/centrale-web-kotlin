package com.kotlin.facebook.models

class User(
    val firstname: String,
    val lastname: String,
    val mail: String,
    val password: String,
    var age: Int,
//    val friends : MutableList<User> = mutableListOf<User>()
){
    fun introduce() {
        println("Je m'appelle $firstname $lastname.")
    }

//    fun showFriends() {
//        println("Les amis de $firstName :")
//        for(user in friends){
//            println(user.fullName())
//        }
//    }
//
//    fun addFriend(newUser: User) {
//        friends.add(newUser)
//    }

    fun fullName(): String {
        return "$firstname $lastname";
    }
}