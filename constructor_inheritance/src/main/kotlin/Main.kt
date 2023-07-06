open class   Human(age:Int){
    var age: Int=0
    init{
        println("we are learning constructors in human class"+ age)
    }
    open fun think(){

        println("Just think" )
    }

}

class Alien(age: Int) : Human(age)
{
    init {
        println("we are learning constructors as aliens" )
    }
    fun advthink(age: Int){
        println("Advanced thinking")

    }
}
fun main(arg: Array<String>){


    var Affaxerd= Alien(10);
    Affaxerd.think()
}