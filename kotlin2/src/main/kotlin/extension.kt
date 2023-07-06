fun main(args: Array<String>){
    var john=Alien()
    john.skills="Java"
    john.show()

    var doe=Alien()
    doe.skills="SQL"
    doe.show()

    var johnte=john.plus(doe)
    johnte.show()
}

 fun Alien.plus(doe: Alien) : Alien{
     var newAlien= Alien()
     newAlien.skills=this.skills + " "+ doe.skills
     return newAlien
 }