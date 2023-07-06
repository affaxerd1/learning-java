abstract class Human{
    fun school(){
        println("study")
    }

    abstract fun choice()
}

class Doctor : Human(){
    override fun choice(){
        println("medicine")
    }
}

class Programmer: Human(){
    override fun choice(){
        println("Computer science or It")
    }
}


fun main(arg: Array<String>){
    var Affaxerd= Programmer()
    Affaxerd.school()
    Affaxerd.choice()

    var Jeff=Doctor()
    Jeff.school()
    Jeff.choice()

}