import java.util.*;

public class Main {
    public static void main(String[] args) {
        Comparator<Integer> com=new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                if(x%10>y%10)
                return 1;
                else
                    return -1;
            }


        };
        List<Integer> nums=new ArrayList<>();
        nums.add(44);
        nums.add(27);
        nums.add(33);
        nums.add(49);
        nums.add(5);
        nums.add(10);

        Collections.sort(nums);
        Collections.sort(nums, com);

        System.out.print(nums);

    }
}