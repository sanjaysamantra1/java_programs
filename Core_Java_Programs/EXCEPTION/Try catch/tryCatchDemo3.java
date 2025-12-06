import java.util.*;

class tryCatchDemo3{
  public static void main(String args[]){
	  Scanner ob = new Scanner(System.in);
	  System.out.println("enter 2 numbers");
	  int a = ob.nextInt();
	  int b = ob.nextInt();
	  try{
		  System.out.println("result: "+a/b);
		}
	 catch(ArithmeticException ae){
		 System.out.println(ae);
		 System.out.println("enter 2 numbers");
		 int c = ob.nextInt();
	  	 int d = ob.nextInt();
	  	 System.out.println("result: "+c/d);
	 }
  }
}