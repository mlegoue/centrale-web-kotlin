package com.kotlin.facebook.repositiories

import org.springframework.data.annotation.Id
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.relational.core.mapping.Table
import org.springframework.data.repository.CrudRepository

@Table("USERS")
data class User(
    @Id val id: String?,
    val firstname: String,
    val lastname: String,
    val mail: String,
    val password: String,
    var age: Int
)

interface UserRepository : CrudRepository<User, String> {

    @Query("select * from users")
    fun findUsers(): List<User>
    abstract fun save(user: com.kotlin.facebook.models.User)
}