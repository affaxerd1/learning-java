import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Comparator<String> com=new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                int l1=x.length();
                int l2=y.length();

                if (l1>l2) {
                    return 1;
                }
                    else{
                        return -1;
                }

            }

        };
        List<String> students=new ArrayList<String>();
        students.add("Affaxerd");
        students.add("Brian");
        students.add("Ian");
        students.add("Lamech");
        students.add("Prakash");

        Collections.sort(students, com);

        System.out.print(students);


    }
}