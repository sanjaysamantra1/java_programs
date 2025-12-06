class A{//class A extends Object
	int x=5;
	int y=6;

	void m1(){
		System.out.println("I am M1");
	}
}
 class Demo_1{
  public static void main(String args[])  {

	 A ob1 = new A();
	 System.out.println(ob1);

	 ob1.m1();

	 System.out.println(ob1.toString());
	 System.out.println(ob1.hashCode());
	 //System.out.println(ob1.toDring());

   }
}





