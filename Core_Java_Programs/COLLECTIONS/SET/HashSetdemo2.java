import java.util.*;

class HashSetdemo2
{
	public static void main(String[] args)
	{
		HashSet h1=new HashSet();
		h1.add(5);
		h1.add(15);
		h1.add(null);
		h1.add(25);
		h1.add("hello");
		h1.add(15);
		h1.add(null);

		System.out.println(h1);
		System.out.println();

		Iterator itr=h1.iterator();
		while(itr.hasNext())
		{
		  System.out.println(itr.next());
		}
	}
}
