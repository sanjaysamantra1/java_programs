import java.util.*;

public class EnumerationDemo_1 {

    public static void main(String a[]){

        Vector<String> ob = new Vector<String>();
        ob.add("one");
        ob.add("two");
        ob.add("three");
        ob.add("four");

        Enumeration<String> enm = ob.elements();
        while(enm.hasMoreElements()){
            System.out.println(enm.nextElement());
        }
    }
}