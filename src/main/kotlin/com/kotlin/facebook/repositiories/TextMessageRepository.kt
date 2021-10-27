package com.kotlin.facebook.repositiories

import org.springframework.data.annotation.Id
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.relational.core.mapping.Table
import org.springframework.data.repository.CrudRepository

@Table("TEXTMESSAGE")
data class TextMessage(
    @Id val id: String?,
    val sender: User,
    val recipient : User,
    val content: String
)

interface TextMessageRepository : CrudRepository<TextMessage, String> {

    @Query("select * from textmessages")
    fun findTextMessages(): List<TextMessage>
    abstract fun save(textmessage: com.kotlin.facebook.models.TextMessage)
}