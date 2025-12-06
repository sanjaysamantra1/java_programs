class A{
	int x = 5;
	public void show(){
		System.out.println("A class show");
	}
}
class B extends A{
	int x = 6; //x=5
	public void show(){
			System.out.println("B class show");
	}

	public void disp(){
		System.out.println("x= "+x);
		System.out.println("x= "+this.x);
		System.out.println("x= "+super.x);

		show();
		this.show();
		super.show();
	}
}

class SuperDemo2
{	public static void main(String[] args)
	{
		B ob = new B();
		ob.disp();
	}
}