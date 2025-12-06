import java.util.*;

class CarList
{
	public static void main(String[] args)
	{
		ArrayList<String> ob = new ArrayList();
		ob.add("Tata");
		ob.add("Honda");
		ob.add("Maruti");
		ob.add("Hundai");
		ob.add("BMW");

		System.out.println(ob);

		for(String i : ob)
		 System.out.println(i);

		Collections.sort(ob);
		System.out.println(ob);

		Collections.reverse(ob);
		System.out.println(ob);
	}
}







