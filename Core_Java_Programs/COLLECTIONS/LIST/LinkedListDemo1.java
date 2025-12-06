import java.util.*;

class LinkedListDemo1
{
	public static void main(String[] args)
	{
		LinkedList<Integer> ob = new LinkedList<Integer>();
		ob.add(10);
		ob.add(20);
		ob.add(30);
		ob.add(40);
		ob.add(50);
		ob.add(1,15);
		System.out.println(ob);
		System.out.println();

		System.out.println("get index1: "+ob.get(1));

		Iterator<Integer> i1=ob.iterator();
		while(i1.hasNext())
		{
		  int x=i1.next();
		  System.out.println(x);
		}

	}
}
