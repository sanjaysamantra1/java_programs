class A{
	int x = 5;
	final int y = 6;
}

class FinalDemo1{
	public static void main(String[] args) {
		A ob = new A();
		System.out.println("x: "+ob.x); //5
		System.out.println("y: "+ob.y); //6
		ob.x = 10;
		System.out.println("x: "+ob.x); //10
		//ob.y = 8;
		System.out.println("y: "+ob.y);
	}
}








