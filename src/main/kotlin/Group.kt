class Group (
    name: String,
    description: String,
    admin: User,
    val privacy: String
) : Organization(name, description, "group", admin) {

    override fun show(){
        println("$name est un groupe $privacy géré par ${admin.fullName()}.");
    }

}