fun main(args: Array<String>){
    var total=interest(amt=500, charge=0.03);
    println(total)

}

fun interest(amt: Int, charge:Double=0.04) : Int
{

    return (amt+amt*charge).toInt()

}