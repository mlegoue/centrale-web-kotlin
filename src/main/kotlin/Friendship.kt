class Friendship (
    val user1: User,
    val user2 : User,
) {
    init {
        user1.addFriend(user2);
        user2.addFriend(user1)
    }

    fun show(){
        println("${user1.firstName} et ${user2.firstName} sont amis.")
    }
}