import java.util.*;

class HashSetdemo1_1
{
	public static void main(String[] args)
	{
		HashSet<String> ob = new HashSet();
		ob.add("pune");
		ob.add("chennai");
		ob.add("hyd");
		ob.add("bang");
		ob.add("pune");
		ob.add("delhi");

		System.out.println(ob);

		Iterator<String> itr = ob.iterator();
		while(itr.hasNext())
		{
			String city = itr.next();
			System.out.println(city);
		}
	}
}
