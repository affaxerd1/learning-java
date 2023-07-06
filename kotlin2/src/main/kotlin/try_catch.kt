import java.lang.NumberFormatException

fun main(arg: Array<String>){
    var str: String="4a"
    var i: Int=
    try {
        str.toInt();
    }
    catch (e : NumberFormatException){
        -1
    }
i++


    println(i)



}