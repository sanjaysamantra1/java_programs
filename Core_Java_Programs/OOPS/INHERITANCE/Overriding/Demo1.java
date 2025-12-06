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
public class Demo1
{
  public static void main(String args[])
  {
	 A ob=new A();
	 System.out.println(ob.x);
	 ob.disp();
	 System.out.println();

	 B ob2=new B();
	 System.out.println(ob2.x);
	 ob2.disp();
	 System.out.println();
   }
}








