import java.util.*;

class Hashmap1_0
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> ob = new HashMap();
		ob.put(5,"ramesh");
		ob.put(4,"ajay");
		ob.put(3,"deepak");
		ob.put(5,"hari");
		ob.put(null,"ramesh");
		ob.put(7,"deepak");

		System.out.println(ob);
		System.out.println(ob.get(3));

		Set<Integer> allKeys = ob.keySet();
		System.out.println(allKeys);

		Collection<String> allValues =
				ob.values();
		System.out.println(allValues);

		for(Integer key : allKeys)
		System.out.println(key+"-----"+ob.get(key));
	}
}
