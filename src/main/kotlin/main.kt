fun main() {

    val marie = User("Marie", "Le Goué", "marie@test.com", "testtest", 22);
    val foder = User("François", "Oder", "foder@test.com", "testtest", 21);

    marie.introduce();
    foder.introduce();

    val friendship = Friendship(marie, foder);
    friendship.show();

    val message = TextMessage(marie, foder, "Coucou");
    message.show();

    val ginfo = Page("GInfo", "L'association d'informatique de Centrale Marseille", marie);
    ginfo.show();

    val ginfoMembres = Group("GInfo membres", "Groupe des cotisants du GInfo", marie, "privé");
    ginfoMembres.show();

    val post = Post(foder, "Bonjour tout le monde, j'organise une fête samedi chez moi !");
    post.show();

}