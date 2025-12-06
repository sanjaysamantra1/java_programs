/* println() designed to accept
   object of "Object class */

/* class A doesn't have toString() but
   class B has toString() */

class B
{
	int x,y;
	void funB()
	{
      System.out.println("funB() of class B");
	}
	public String toString()
	{
	  String s1="x="+x+" y="+y;
	  return s1;
	}
}

class C
{
	int i,j;
	void funC()
	{
      System.out.println("funC() of class C");
	}
	public String toString()
	{
	  String s1="This is object of class C";
	  return s1;
	}
}

class  ObjTest
{
	public static void main(String[] args) 
	{
		A a1=new A();
		System.out.println(a1); // address of A

		B b1=new B();
		System.out.println(b1); // x=0 y=0
		b1.x=6;
		b1.y=8;
		System.out.println(b1); // x=6 y=8

		C c1=new C();
		System.out.println(c1);

		Thread t1=new Thread();
		System.out.println(t1); // Thread[Thread-0,5,main]
	}
}
