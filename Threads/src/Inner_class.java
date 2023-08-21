public class Inner_class {
    public static void main(String[] args){
        class A{
            int a;
            class B{

                public void inner(){
                    System.out.print("This is an inner class");
                }


            }
        }

        A obj=new A();



        A.B cheru=obj.new B();
        cheru.inner();

    }

}
