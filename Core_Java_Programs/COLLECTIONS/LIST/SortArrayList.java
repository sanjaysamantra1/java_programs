import java.util.*;

class SortArrayList
{
	public static void main(String[] args)
	{
		ArrayList ob = new ArrayList();
		ob.add(20);
		ob.add(40);
		ob.add(10);
		ob.add(30);
		System.out.println("before Sort: "+ob);

		Collections.sort(ob);
		System.out.println("After Sort: "+ob);

		Collections.reverse(ob);
		System.out.println("After Reverse: "+ob);
	}
}
