import java.util.*;

class SysnchronizedArrayList
{
	public static void main(String[] args)
	{
		ArrayList list1= new ArrayList();
		list1.add("sanjay");
		list1.add("ajit");

		ArrayList list2=  Collections.synchronizedList(list1);
		System.out.println(list2);
	}
}
