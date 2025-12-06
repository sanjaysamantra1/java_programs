import java.util.*;

class GDemo1_1
{
	public static void main(String[] args)
	{

      //generic Collection
      ArrayList<String> list = new ArrayList<String>();
	  list.add("hello");
	  list.add("hi");
	  String s = list.get(0);   // no casting required
	  System.out.println(s);
	}
}


