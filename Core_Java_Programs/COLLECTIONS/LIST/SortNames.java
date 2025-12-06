import java.util.*;

class SortNames
{
	public static void main(String[] args)
	{
		ArrayList ob = new ArrayList();
		ob.add("chennai");
		ob.add("hyd");
		ob.add("bang");
		ob.add("pune");
		System.out.println("Before Sort: "+ob);

		Collections.sort(ob);
		System.out.println("After Sort: "+ob);

		Collections.reverse(ob);
		System.out.println("After Reverse: "+ob);
	}
}
