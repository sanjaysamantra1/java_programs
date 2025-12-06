class A {
	int x=2,y=3;
	public String toString2(){
		return "x:"+x+"y:"+y;
	}
}

class ToStringDemo{
  public static void main(String args[])
  {
	A ob1 = new A();
	String ob2=new String("hello");

	System.out.println(ob2);
   	System.out.println(ob1);

   	System.out.println(ob2.toString());
   	System.out.println(ob1.toString());
  }
}
