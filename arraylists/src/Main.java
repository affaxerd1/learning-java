import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> nums=new ArrayList<Integer>();
        nums.add(5);
        nums.add(7);
        nums.add(9);
        nums.add(4);
        nums.add(5);

        System.out.print(nums);
        /*cannot allow use of index of method. Iterating though the arraylist you have to use the forloop
        */
        List<Integer> num=new ArrayList<Integer>();
        num.add(5);
        num.add(7);
        num.add(9);
        num.add(4);
        num.add(5);


        System.out.print(num.indexOf(9));

    }
}