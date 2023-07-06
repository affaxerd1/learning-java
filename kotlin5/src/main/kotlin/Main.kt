import java.math.BigInteger

fun main(arg: Array<String>){
    var num=BigInteger("100")

    println(fact(num))

}

fun fact(num:BigInteger):BigInteger{
    if(num==BigInteger.ZERO){
        return BigInteger("1")
    }else{
        return num*fact(num- BigInteger.ONE)
    }
}