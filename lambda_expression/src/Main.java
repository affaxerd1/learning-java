@FunctionalInterface
interface A{
    void show(int time);
}

public class Main{
    public static void main(String[] args){
        A movie=(int time) -> System.out.print("Tuduuum, Netflix" + time);



        movie.show(5);
    }
}