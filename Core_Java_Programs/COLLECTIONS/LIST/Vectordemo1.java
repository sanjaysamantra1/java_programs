import java.util.*;

class Vectordemo1
{
	public static void main(String[] args)throws Exception
	{
		Vector v1 = new Vector();
		v1.add(new A());
		v1.addElement("example");
		v1.addElement(new Integer(5));
		//v1.addElement(new B());
		System.out.println(v1);

		Object o=v1.elementAt(1);
		String s1=(String)o;
		System.out.println("s1= "+s1);
		System.out.println("length of s1= "+s1.length());

		System.out.println();
		Object o1=v1.elementAt(2);
		int x=(Integer)o1;
		System.out.println("x= "+x);
	}
}
