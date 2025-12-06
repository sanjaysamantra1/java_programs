import java.util.*;

class IteratorDemo3 {

    public static void main(String a[]){

        HashSet ob = new HashSet();
		ob.add(10);
		ob.add(15);
		ob.add(20);
		ob.add(40);

		System.out.println(ob);

		Iterator itr = ob.iterator();
		while (itr.hasNext())
		{
		Integer i = (Integer)itr.next();
		 System.out.println(i);
		}

    }
}