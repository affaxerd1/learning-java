import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> students=new HashMap<String, Integer>();
        students.put("Affaxerd", 23);
        students.put("Bravin", 20);
        students.put("Youssef", 25);
        students.put("Jose", 17);

        System.out.print(students);
    }
}