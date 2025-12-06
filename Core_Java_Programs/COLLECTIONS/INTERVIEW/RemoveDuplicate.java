import java.util.*;

class RemoveDuplicate{
    public static void main(String[] args){

		ArrayList<String> a= new ArrayList();
		a.add("abb");
		a.add("xyx");
		a.add("pqr");
		a.add("abb");

		HashMap<Integer,String> b =new HashMap();
		b.put(1,"abc");
		b.put(2,"xyz");
		b.put(3,"def");
		b.put(3,"pqr");

	System.out.println(b);
	Set<Integer> s= b.keySet();
	System.out.println(s);
	Collection<String> v = b.values();
	System.out.println(v);

	Iterator<Integer> itr = s.iterator();
	while(itr.hasNext())
	{
		Integer key = itr.next();
		String val = b.get(key);
		System.out.println(key+"   "+val);
	}





  }
}
