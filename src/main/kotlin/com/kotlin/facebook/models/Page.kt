package com.kotlin.facebook.models

class Page (
    name: String,
    description: String?,
    admin: User,
    var likes: MutableList<User> = mutableListOf<User>()
) : Likable, Organization(name, description, "page", admin) {

    override fun show(){
        println("$name est une page gérée par ${admin.fullName()}.");
    }

    override fun like(user: User){
        likes.add(user)
    }

}