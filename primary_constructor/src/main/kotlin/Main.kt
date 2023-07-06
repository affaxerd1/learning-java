class Developer constructor(var l: String="php"){   //php is default
      var lang: String= l

    //init will run some functions with constructors
    init {
        println("Hello welcome to recruitment")
    }

    fun code(){
        println(lang)
    }



}
fun main(arg: Array<String>){
    var affaxerd= Developer()
    affaxerd.code()

}