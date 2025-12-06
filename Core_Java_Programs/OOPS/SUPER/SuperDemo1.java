class A{
		A(int x){
			System.out.println("A para constructor");
		}
		A()
		{
			System.out.println("A default constructor");
		}
}
class B extends A{
		B(){
			super(5);
			System.out.println("B constructor");
		}
}
class SuperDemo1{
	public static void main(String[] args) {
		//A ob = new A();
		B ob = new B();
	}
}






