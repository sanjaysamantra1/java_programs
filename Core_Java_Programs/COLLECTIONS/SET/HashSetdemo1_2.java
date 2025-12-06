import java.util.*;

class HashSetdemo1_2
{
	public static void main(String[] args)
	{
		ArrayList<Integer> ob1 = new ArrayList();
		ob1.add(10);
		ob1.add(20);
		ob1.add(10);
		ob1.add(30);
		ob1.add(20);
		System.out.println("ob1: "+ob1);

		HashSet ob2 = new HashSet();

		for(Integer i : ob1)
		 ob2.add(i);

		System.out.println("ob2: "+ob2);
	}
}
