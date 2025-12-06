import java.util.*;

class Vectordemo2
{
	public static void main(String[] args)
	{
		Vector<String> v1=new Vector<String>();
		v1.addElement("sanjay");
		v1.addElement("manoj");
		v1.addElement("manoj");
		v1.addElement("pradeep");
		v1.addElement("ajit");
		System.out.println(v1);
		System.out.println("size= "+v1.size());
		System.out.println();

		for(int i=0;i<v1.size();i++)
		{
		  String s1=v1.elementAt(i);
		  System.out.println("element at "+i+" is="+s1);
		}
		System.out.println();

		for(String s2:v1)  // enhanced for loop
		{
		  System.out.println(s2);
		}
	}
}
