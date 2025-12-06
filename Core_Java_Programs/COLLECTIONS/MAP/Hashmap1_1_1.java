import java.util.*;

class Hashmap1_1_1
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> ob=new HashMap<Integer,String>();
		ob.put(5,"sanjay");
		ob.put(6,"manoj");
		ob.put(8,"ajit");
		ob.put(9,"surendra");
		ob.put(7,"pradeep");
		System.out.println("Map: "+ob);

		Set allEntries = ob.entrySet();

		System.out.println("Entries: "+allEntries);

		System.out.println();

		Iterator itr=allEntries.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
