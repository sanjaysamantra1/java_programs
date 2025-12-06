class A{
	private int x=5;
	protected int y=6;
	public int z=7;

	private void m1(){System.out.println("A m1");}
	protected void m2(){System.out.println("A m2");}
	public void m3(){System.out.println("A m3");}
}
class B extends A{
	int p = 10;
}

class InhDemo1
{
	public static void main(String[] args) {
		B ob = new B();
		System.out.println(ob.p);
		//System.out.println(ob.x);
		System.out.println(ob.y);
		System.out.println(ob.z);

		//ob.m1();
		ob.m2();
		ob.m3();
	}

};