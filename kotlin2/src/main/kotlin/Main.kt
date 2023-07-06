fun main(args: Array<String>){
    var num= listOf(1,2,3,4,5,6)

    for((i,e) in num.withIndex() ){
        println("$i : $e")
    }
}
