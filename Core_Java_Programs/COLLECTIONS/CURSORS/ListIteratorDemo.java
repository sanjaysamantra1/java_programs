import java.util.*;

public class ListIteratorDemo {
    public static void main(String a[]){
        List<Integer> li = new ArrayList();
        li.add(23);
        li.add(98);
        li.add(29);
        li.add(71);
        li.add(5);

        ListIterator<Integer> ob = li.listIterator();

        System.out.println("Elements in forward directiton");
        while(ob.hasNext()){
            System.out.println(ob.next());
        }

        System.out.println("Elements in backward directiton");
        while(ob.hasPrevious()){
            System.out.println(ob.previous());
        }
    }
}
