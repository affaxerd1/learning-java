fun main(arg: Array<String>){
    open class Human{
        open fun think() {
            println("Basic thinking")
        }

    }
    class Alien: Human()
    {
        fun adv(){
            println("More advanced thinking")
        }
        //trying to override. we ,make the parent method overridable using open keyword
        //and declare our intentions to override using the override keyword
        override fun think(){
            println("you've got to think better")
        }
    }


    var Affaxerd= Alien()
    Affaxerd.think()
}