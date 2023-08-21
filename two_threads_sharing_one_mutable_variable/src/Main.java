class Counter{

    int count;
    public synchronized void increment(){
        count++;
    }

}

public class Main {
    public static void main(String[] args) {

        Counter c=new Counter();
        Runnable obj1= ()->
        {
            for(int i=1; i<=10; i++){
                System.out.print("hi");
                c.increment();
            }
        };
        Runnable obj2= () ->
        {
            for(int i=1; i<=10; i++){
                System.out.print("hello");
            }
        };

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();

        System.out.println(c.count);

    }

}