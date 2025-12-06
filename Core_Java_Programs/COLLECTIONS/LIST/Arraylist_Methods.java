import java.util.*;
class A{

}

class Arraylist_Methods
{
	public static void main(String[] args)
	{
		ArrayList ob = new ArrayList();

		ob.add(10);
		ob.add("dvs");
		ob.add(10.5);
		ob.add(null);
		ob.add("dvs");
		//A obj = new A();
		//ob.add(obj);
		ob.add(new A());
		ob.add(1,"hadoop");

		System.out.println(ob);
		System.out.println(ob.size());
		System.out.println(ob.isEmpty());

		System.out.println(ob.contains("dvs"));
		System.out.println(ob.indexOf("dvs"));
		System.out.println(ob.lastIndexOf("dvs"));
		System.out.println(ob.get(1));

		ob.remove(1);
		System.out.println(ob);

		ob.clear();
		System.out.println(ob);
	}
}
