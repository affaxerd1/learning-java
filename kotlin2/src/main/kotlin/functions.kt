fun main(arg: Array<String>){
    var result= add(12,9)
    var kubwa=max(12, 5)


    println(result)
    println(kubwa)

}

fun add(a:Int, b:Int): Int=a+b;

fun max(a: Int, b:Int): Int= if(a>b) a else b

