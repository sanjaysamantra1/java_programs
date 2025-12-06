class A{
	int x;
	final int y;

	A(int d)
	{
		y=d;
	}
}

class FinalDemo1_3
{
	public static void main(String[] args) {
		A ob=new A(5);
		System.out.println("x: "+ob.x);
		System.out.println("y: "+ob.y);

	}
}