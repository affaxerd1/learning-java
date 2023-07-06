class Developer constructor(n:String){
    var name:String=n
    var age:Int=0

    constructor(name: String, age: Int): this(name){
        this.age=age
    }

    fun code(){
        println("Affaxerd is proficient in $name and has an experience of $age years")
    }
}

fun main(args:Array<String>){
    var affaxerd=Developer("Php", 20)
    affaxerd.code()
}