abstract class Organization(
    val name: String,
    val description: String,
    val type: String,
    val admin: User
) {
    abstract fun show();
}