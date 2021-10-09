class TextMessage (
    val sender: User,
    val recipient : User,
    val content: String
) {
    fun show(){
        println("${sender.firstName} a envoyé à ${recipient.firstName} : \"$content\"")
    }
}