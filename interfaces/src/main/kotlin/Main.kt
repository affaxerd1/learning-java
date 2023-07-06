interface A {
    fun show()
    fun star(){
        println("star A")
    }
}
interface B{
    fun work()
    fun star(){
        println("star B")
    }

}
class C: A, B{
    override fun show() {
        println("This is class A")
    }

    override fun work() {
       println("This is class B")
    }

    override fun star() {
        super<A>.star()
    }

}

fun main(arg: Array<String>){

    var kim=C()
    kim.show()
    kim.star()
    kim.work()


}