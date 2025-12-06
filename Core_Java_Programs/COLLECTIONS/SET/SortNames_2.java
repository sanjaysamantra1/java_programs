import java.util.*;

class MyComparator implements Comparator
{
	public int compare(Object ob1,Object ob2)
	{
		String s1=(String)ob1;
		String s2=(String)ob2;

		return s2.compareTo(s1);
	}
}


public class SortNames
{
	public static void main(String[] args)
     {
		//TreeSet s=new TreeSet(new MyComparator()); //descending oredr
		TreeSet s=new TreeSet(); //default sorting(ascending)
		s.add("chiru");
		s.add("akash");
		s.add("deepak");
		s.add("santosh");
		s.add("rajesh");

		System.out.println(s);

	}
}
