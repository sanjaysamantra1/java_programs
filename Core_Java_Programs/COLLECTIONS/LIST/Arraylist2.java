import java.util.*;

class Arraylist2
{
	public static void main(String[] args)
	{
		ArrayList<String> ob = new ArrayList();
		ob.add("tata");
		ob.add("maruti");
		ob.add("honda");
		ob.add("suzuki");
		//ob.add(10);

		String x = ob.get(1);
		System.out.println(x);

		for(String ele:ob)
		System.out.println(ele);
	}
}
