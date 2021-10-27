package com.kotlin.facebook.repositiories

import com.kotlin.facebook.models.User
import org.springframework.data.annotation.Id
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.relational.core.mapping.Table
import org.springframework.data.repository.CrudRepository

@Table("FRIENDSHIP")
data class Friendship(
    @Id val id: String?,
    val user1: User,
    val user2 : User
)

interface FriendshipRepository : CrudRepository<Friendship, String> {

    @Query("select * from friendships")
    fun findFriendships(): List<Friendship>
    abstract fun save(friendship: Friendship)
}