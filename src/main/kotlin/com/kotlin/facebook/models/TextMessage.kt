package com.kotlin.facebook.models

class TextMessage (
    val sender: User,
    val recipient : User,
    val content: String
) {
    fun show(){
        println("${sender.fullName()} a envoyé à ${recipient.fullName()} : \"$content\"")
    }

    operator fun plus(message: TextMessage) : TextMessage {
        return TextMessage(sender, recipient, message.content)
    }
}