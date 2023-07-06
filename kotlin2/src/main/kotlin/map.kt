import java.util.TreeMap
fun main(arg: Array<String>) {
    var alien=TreeMap<String, Int>()
    alien ["Affaxerd"] =23
    alien["Giddy"]=20

    for((string, int) in alien){
        println("$string : $int")
    }
}