class Page (
    name: String,
    description: String,
    admin: User
) : Organization(name, description, "page", admin) {

    override fun show(){
        println("$name est une page gérée par ${admin.fullName()}.");
    }

}