import java.lang.annotation.ElementType;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(2,5,3,6,5,3,8,4,9,0,5);
        Stream<Integer> s1=num.stream();
        Stream<Integer> s3=s1.filter(n-> n%2==0);
        Stream<Integer> s4=s3.map(n->n*2);
        int element=s4.reduce(0, (e, i)-> e+i);
        System.out.print(element);

//        this can be written inshort in one line like

        List<Integer> nex= Arrays.asList(2,5,3,6,5,3,8,4,9,0,5);
        Stream<Integer> s5=nex.stream();
        int no=s5.filter(n->n%2==0)
                 .map(n->n*2)
                 .reduce(0,(i,e) ->i+e);
        System.out.print(no);


        /*s3.forEach(n -> System.out.print(n));*/

    }
}