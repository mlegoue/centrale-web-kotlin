class User(
    val firstName: String,
    val lastName: String,
    val mail: String,
    val password: String,
    var age: Int
){
    fun introduce() {
        println("Je m'appelle $firstName $lastName et j'ai $age ans.")
    }

    fun fullName(): String {
        return "$firstName $lastName";
    }
}