public class Main {
    public static void main(String[] args) {
        // abstract classes

        abstract class A{
            int a;

            public abstract void drive();

            public void playMusic(){
                System.out.print("Music playing");
            }


        }

        class B extends A{
            public void drive(){
                System.out.print("driving..");
            }

        }

        A obj=new B();
        obj.drive();
        obj.playMusic();

    }
}