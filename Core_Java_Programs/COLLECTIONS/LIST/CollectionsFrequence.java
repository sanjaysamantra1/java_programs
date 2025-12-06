import java.util.*;

class CollectionsFrequence
{
	public static void main(String[] args)
	{
		ArrayList ob=new ArrayList();
		ob.add("sanjay");
		ob.add("Ajit");
		ob.add("dinesh");
		ob.add("sanjay");
		ob.add("pradeep");
		System.out.println(ob);
		System.out.println(Collections.frequency(ob,"sanjay"));
	}
}
