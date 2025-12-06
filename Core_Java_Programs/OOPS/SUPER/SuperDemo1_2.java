class A {
	A(int x,int y){
		System.out.println("A constructor");
	}
}
class B extends A{
	B(){
		super(2,3);
		System.out.println("B constructor");
	}
}
class SuperDemo1_2
{
	public static void main(String[] args) {
	B ob = new B();
	}
}