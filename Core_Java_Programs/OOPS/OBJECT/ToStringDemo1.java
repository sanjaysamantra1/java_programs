/* toString() of "Object" class returns 
   address of submost object with which
   we are calling ToString() */

class  ToStringDemo1
{
	public static void main(String[] args) 
	{
		A a1=new A();
		String s1=a1.toString();
		System.out.println("s1= "+s1); // address of A
		System.out.println("a1= "+a1); // address of A

		Object o=a1;
		String s2=o.toString();
		System.out.println("s2= "+s2); // address of A
	}
}
