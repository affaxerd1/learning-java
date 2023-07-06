class Student{
    String name;
    String school;
    int age;
}
public class Main {
    public static void main(String[] args) {

        Student s1=new Student();
        s1.name="Cinthia";
        s1.school="Egerton";
        s1.age=22;

        Student s2=new Student();
        s2.name="abby";
        s2.school="MMUST";
        s2.age=22;

        Student arr[]=new Student[2];
        arr[0]=s1;
        arr[1]=s2;

        for(Student stud: arr){
            System.out.print(stud.name + " "+ stud.school+ " "+ stud.age);
        }

    }
}