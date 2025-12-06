import java.util.*;

class Hashmap2
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		h1.put(5,"sanjay");
		h1.put(6,"manoj");
		h1.put(3,"ajit");
		h1.put(9,"surendra");
		h1.put(7,"pradeep");
		System.out.println(h1);
		System.out.println();

		System.out.println(h1.keySet());
		System.out.println(h1.values());
		System.out.println(h1.entrySet());


	}
}
