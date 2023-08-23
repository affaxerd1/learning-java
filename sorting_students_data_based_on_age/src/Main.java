import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name=name;
    }

    public String toString(){
        System.out.print("student[age=" + age +", name="+ name+";]");
        return null;
    };
}
public class Main {
    public static void main(String[] args) {

        Comparator<Student> com=new Comparator<Student>() {

            public int compare(Student x, Student y) {
                if(x.age>y.age)
                    return 1;
                else
                    return -1;
            }
        };
        List<Student> stud=new ArrayList<>();
        stud.add(new Student(23, "Affaxerd"));
        stud.add(new Student(25, "Ian"));
        stud.add(new Student(30, "Allan"));
        stud.add(new Student(3, "Ammon"));

        Collections.sort(stud, com);
        for (Student s: stud){
            System.out.println(s);
        }



    }
}