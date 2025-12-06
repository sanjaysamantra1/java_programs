// A static method belongs to the class rather than object of a class.
// A static method can be invoked without the need for creating an instance of a class.
// static method can access static data member and can change the value of it.

class Test
{
	static void cube(int x){
	  System.out.println(x*x*x);
 	 }
  	void square(int x)
  	{
	  System.out.println(x*x);
  	}
}

class StaticDemo2 {
  public static void main(String args[]){
		Test.cube(2);
		//Test.cube(2);
		Test ob=new Test();
		ob.square(3);
  }
}