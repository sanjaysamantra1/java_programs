class A{
	int x;
	final int y=3;

	A(int d)
	{
		y=d;
	}
}

class FinalDemo1_4
{
	public static void main(String[] args) {
		A ob=new A(5);
		System.out.println("x: "+ob.x);
		System.out.println("y: "+ob.y);

	}
}