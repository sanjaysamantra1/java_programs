class A{
	A(){
		System.out.println("A constructor");
	}
}
class B extends A{
	B(){
		super();
		System.out.println("B constructor");
	}
}

class SuperDemo1_1
{
	public static void main(String[] args) {
	B ob2=new B();
	}
}