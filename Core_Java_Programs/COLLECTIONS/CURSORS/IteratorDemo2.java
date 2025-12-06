import java.util.*;

class IteratorDemo2 {

    public static void main(String a[]){

        ArrayList al = new ArrayList();
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(40);

		System.out.println(al);

		Iterator itr = al.iterator();
		while (itr.hasNext())
		{
		Integer i = (Integer)itr.next();
		 if((i%2) == 0)
			System.out.println(i);
		else
			itr.remove();
		}

		System.out.println(al);
    }
}