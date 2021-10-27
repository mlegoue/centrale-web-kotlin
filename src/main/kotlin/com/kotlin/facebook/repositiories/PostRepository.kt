package com.kotlin.facebook.repositiories

import org.springframework.data.annotation.Id
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.relational.core.mapping.Table
import org.springframework.data.repository.CrudRepository

@Table("POST")
data class Post(
    @Id val id: String?,
    val publisher: User,
    val content: String
)

interface PostRepository : CrudRepository<Post, String> {

    @Query("select * from posts")
    fun findPosts(): List<Post>
    abstract fun save(post: com.kotlin.facebook.models.Post)
}