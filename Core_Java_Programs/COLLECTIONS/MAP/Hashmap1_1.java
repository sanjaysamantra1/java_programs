import java.util.*;

class Hashmap1_1
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		h1.put(5,"sanjay");
		h1.put(6,"manoj");
		h1.put(8,"ajit");
		h1.put(9,"surendra");
		h1.put(7,"pradeep");
		System.out.println(h1);
		System.out.println();

		String s = h1.get(6);
		System.out.println(s);
		System.out.println();

		Set<Integer> keys=h1.keySet();
		Iterator<Integer> i1=keys.iterator();
		while(i1.hasNext())
		{
			int key=i1.next();
			String value=h1.get(key);
			System.out.println(key+"-----"+value);
		}
		System.out.println();


		Set<Integer> keys2 = h1.keySet();
		for(Integer key : keys2)
		{
			String value = h1.get(key);
			System.out.println(key+"-----"+value);
		}
	}
}
