package Anon_inner_class;

public class Java {
    public static void main(String[] args) {
        class Anon {
            public void anon() {
                System.out.print("you probably wont ever see me");
            }
        }

        Anon obj = new Anon()   //this is  class initialization, no comma
        {

            public void anon()
                {
                    System.out.println("Hahaa, jokes on who");
                }

        };
        obj.anon();
    }

}