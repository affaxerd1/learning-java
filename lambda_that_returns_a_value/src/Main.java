@FunctionalInterface
interface A{
    int sum(int a, int b);
}
public class Main {
    public static void main(String[] args) {
        A add= (a,  b) -> a + b;

        int z=add.sum(3,5);
        System.out.print(z);






    }
}