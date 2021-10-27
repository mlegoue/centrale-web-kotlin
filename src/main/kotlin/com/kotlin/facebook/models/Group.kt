package com.kotlin.facebook.models

enum class Privacy {
    SECRET, PRIVATE, PUBLIC
}

class Group (
    name: String,
    description: String?,
    admin: User,
    val members: MutableList<User> = mutableListOf<User>(),
    val privacy: Privacy
) : Organization(name, description, "group", admin) {

    override fun show(){
        println("$name est un groupe $privacy géré par ${admin.fullName()}.");
    }

    fun addMembers(vararg users: User) {
        for (user in users)
            members.add(user)
    }
}