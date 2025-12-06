import java.util.*;

class Hashmap1
{
	public static void main(String[] args)
	{
		//ArrayList<String> ob = new ArrayList();
		HashMap<Integer,String> ob = new HashMap();
		ob.put(5,"ajay");
		ob.put(3,"deepak");
		ob.put(7,"ramesh");
		ob.put(4,"hari");
		ob.put(9,"deepak");
		ob.put(7,"abcdef");
		ob.put(null,"value-1");
		ob.put(10,null);
		ob.put(null,null);

		System.out.println(ob);
		String val = ob.get(4);
		System.out.println(val);

		Set<Integer> allKeys = ob.keySet();
		System.out.println(allKeys);

		Collection<String> allValues = ob.values();
		System.out.println(allValues);
	}
}




