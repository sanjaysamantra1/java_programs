import java.util.*;

class GDemo3
{
	public static void main(String[] args)
	{
		List<String> list1 = new ArrayList<String>(); // Before java 7
		list1.add("hello");
		list1.add("hi");
		String a=list1.get(0);
		System.out.println(a);

		List<String> list2 = new ArrayList(); // After java 7
		list2.add("welcome");
		list2.add("Java");
		String b = list2.get(0);
		System.out.println(b);

		List list3 = new ArrayList<String>(); //no
		list3.add("abc");
		list3.add("xyz");
		String c = (String) list3.get(0);
		System.out.println(c);
	}
}


