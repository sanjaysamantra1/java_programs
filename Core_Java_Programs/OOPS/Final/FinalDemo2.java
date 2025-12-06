class A{
	void disp()
	{
		System.out.println("A-class disp method");
	}
	final void show(){
		System.out.println("A-class show method");
	}
}
class B extends A{
	void disp(){
		System.out.println("B-class disp method");
	}

}

class FinalDemo2{
	public static void main(String[] args) {
		B ob=new B();
		ob.disp();
		ob.show();
	}
}





