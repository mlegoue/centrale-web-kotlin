class User(
    val firstName: String,
    val lastName: String,
    val mail: String,
    val password: String,
    var age: Int,
    val friends : MutableList<User> = mutableListOf<User>()
){
    fun introduce() {
        println("Je m'appelle $firstName $lastName et j'ai $age ans.")
    }

    fun showFriends() {
        println("Les amis de $firstName :")
        for(user in friends){
            println(user.fullName())
        }
    }

    fun addFriend(newUser: User) {
        friends.add(newUser)
    }

    fun fullName(): String {
        return "$firstName $lastName";
    }
}