import java.util.*;

class A{
	int x=5;
	public void disp(){
		System.out.println("parent Disp() ###");
	}
}
class B extends A{
	int x=6;

	public void disp(){
		System.out.println("child Disp() ####");
	}
}
public class Demo2
{
  public static void main(String args[])
  {
	 B ob = new B();
	 ob.disp();
   }
}