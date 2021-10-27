package com.kotlin.facebook.services

import com.kotlin.facebook.repositiories.TextMessage
import com.kotlin.facebook.repositiories.TextMessageRepository
import org.springframework.stereotype.Service

@Service
class TextMessageService(val db: TextMessageRepository) {

    fun findTextMessages(): List<TextMessage> = db.findTextMessages()

    fun post(textMessage: TextMessage){
        db.save(textMessage)
    }
}