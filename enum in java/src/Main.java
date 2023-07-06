enum Status{
    Running, Pending, Downloading, Failed
        }

public class Main {
    public static void main(String[] args) {
       /*Status s= Status.Running;*/
       /* System.out.print();*/

        Status[] arr= Status.values();
        for(Status i: arr){
            System.out.println(i + " " +i.ordinal());
        }

    }
}