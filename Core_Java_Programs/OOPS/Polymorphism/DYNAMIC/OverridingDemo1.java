class A{
	int x=10;
	int y=20;
	public void disp(){
		System.out.println("I am Disp() from A class");
			}
}
class B extends A{
	int z=30;
	public void disp(){
			System.out.println("I am Disp() from B class");
			}
}
public class OverridingDemo1 {
	public static void main(String[] args) {
	B ob = new B();
	ob.disp();
	}

}
