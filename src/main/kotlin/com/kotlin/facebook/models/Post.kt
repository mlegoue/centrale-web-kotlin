package com.kotlin.facebook.models

class Post (
    val publisher: User,
    val content: String,
    var likes: MutableList<User> = mutableListOf<User>()
) : Likable {
    fun show(){
        println("${publisher.fullName()} a publié \"$content\".")
    }

    override fun like(user: User){
        likes.add(user)
    }
}