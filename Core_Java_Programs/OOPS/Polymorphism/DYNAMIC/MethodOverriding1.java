class A
{
	int x=5;
	protected void disp(){
		System.out.println("disp() of class-A");
	}
}
class B extends A
{
	int y=7;
	protected void disp(){
			System.out.println("disp() of class-B");
	}

}
class MethodOverriding1{
	public static void main(String[] args) {
		A ob1=new A();
		ob1.disp();

		B ob2=new B();
		ob2.disp();
	}
}