class Friendship (
    val user1: User,
    val user2 : User
) {
    fun show(){
        println("${user1.firstName} et ${user2.firstName} sont amis.")
    }
}