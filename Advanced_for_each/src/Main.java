import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1, 2, 3, 4, 5, 6);
        num.forEach( n -> System.out.print(n) );
    }
}