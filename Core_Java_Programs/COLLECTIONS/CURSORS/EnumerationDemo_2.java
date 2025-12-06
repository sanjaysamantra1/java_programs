import java.util.*;

public class EnumerationDemo_2 {

    public static void main(String a[]){

        List<String> ls = new ArrayList<String>();
        ls.add("one");
        ls.add("two");
        ls.add("three");
        ls.add("four");

        Enumeration<String> enm = Collections.enumeration(ls);
        while(enm.hasMoreElements()){
            System.out.println(enm.nextElement());
        }
    }
}