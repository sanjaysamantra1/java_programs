class X
{
	public int a=3;
}
class Y extends X
{
	public int a=5;
}

class Test6
{
	public static void main(String[] args)
	{
		X ob=new X();
		System.out.println(ob.a);

		Y ob2=new Y();
		System.out.println(ob2.a);

		X ob3=new Y();
		System.out.println(ob3.a);
	}
}
