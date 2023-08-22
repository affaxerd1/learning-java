import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
         Set<Integer> num= new HashSet<Integer>();
         num.add(4);
         num.add(6);
         num.add(9);
         num.add(7);
         num.add(2);
         num.add(9);

        System.out.print(num);

        Set<Integer> numb=new TreeSet<Integer>();
        numb.add(7);
        numb.add(5);
        numb.add(6);


        System.out.print(numb);



    }
}