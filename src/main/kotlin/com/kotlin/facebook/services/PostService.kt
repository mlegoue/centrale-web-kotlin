package com.kotlin.facebook.services

import com.kotlin.facebook.repositiories.Post
import com.kotlin.facebook.repositiories.PostRepository
import org.springframework.stereotype.Service

@Service
class PostService(val db: PostRepository) {

    fun findPosts(): List<Post> = db.findPosts()

    fun post(post: Post){
        db.save(post)
    }
}