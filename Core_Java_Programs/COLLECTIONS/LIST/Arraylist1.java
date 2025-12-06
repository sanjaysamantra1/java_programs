import java.util.*;
class A{}

class Arraylist1
{
	public static void main(String[] args)
	{
		LinkedList ob = new LinkedList();
		ob.add(10);//ob.add(new Integer(10));
		ob.add(4.5);
		ob.add("sachin");
		ob.add("dvs");
		ob.add(new A());
		ob.add("dvs");
		ob.add(null);
		ob.add(1,20);

		System.out.println(ob.size());
		System.out.println(ob);
		System.out.println(ob.get(2));
	}
}
