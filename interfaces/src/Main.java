interface Computer{

    void code();


}
class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile, run faster");
    }
}
class Developer{
    public void devApp(Computer lap){
        lap.code();
        System.out.println("coding...");
    }
}
public class Main {
    public static void main(String[] args){
        Computer hp=new Desktop();
        Computer mac=new Laptop();

        Developer Affaxerd = new Developer();
        Affaxerd.devApp(hp);




    }


}