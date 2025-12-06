/* "out" is one final variable of PrintStream 
   class so "out" cann't be modified */

class Fdemo4  
{
   public static final int x=12;
   public static final A a1=new A();
}

class Ftest2
{
  public static void main(String args[])
  {
 
	System.out.println("x= "+Fdemo4.x); // 12
	int n=Fdemo4.x+1;
	System.out.println("n= "+n); // 13
	System.out.println(Fdemo4.a1.i); // 0
	Fdemo4.a1.i=3;
	System.out.println(Fdemo4.a1.i); // 3
 //	Fdemo4.a1=null;
 //	Fdemo4.a1=new A();
 // System.out=null;
    System sanjay=null;   // possible

    System.out.println("Hello!");
  }
}
	