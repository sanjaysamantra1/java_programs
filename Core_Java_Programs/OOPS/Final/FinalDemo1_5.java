class A{
	int x;
	final int y;

	A(int d)
	{
		y=d;
		y=7;
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