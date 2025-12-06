class A{
	int x;
	final int y;

	A(){
		y = 7;
	}
}

class FinalDemo1_2
{
	public static void main(String[] args) {
		A ob = new A();
		System.out.println("x: "+ob.x);
		System.out.println("y: "+ob.y);

	}
}