class Post (
    val publisher: User,
    val content: String
) {
    fun show(){
        println("${publisher.fullName()} a publié \"$content\".")
    }
}