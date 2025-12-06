class A
{
	int x=10;
	int y=20;
	public void disp(){
		System.out.println(x+"   "+y);
			}
}
class B extends A
{
	int z=30;
		public void disp(){
			System.out.println(x+" "+y+" "+z);
			}

}
public class OverridingDemo2 {
	public static void main(String[] args) {
		B ob = new B();
		ob.disp();
	}

}
