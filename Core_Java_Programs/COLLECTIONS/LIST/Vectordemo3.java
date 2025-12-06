import java.util.*;

class Vectordemo3
{
	public static void main(String[] args)
	{
		Vector<String> v1=new Vector<String>();
		v1.addElement("c");
		v1.addElement("c++");
		v1.addElement("java");
		v1.addElement("oracle");
		System.out.println(v1);

		Enumeration<String> e1=v1.elements();
		while(e1.hasMoreElements())
		{
		  String s1=e1.nextElement();
		  System.out.println(s1);
		}
	}
}
