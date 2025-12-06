//class which does not extend any class that extends Object class
/*toString fun belongs to Object class still 
   it is working because Test1 is extending Object class */

class  Test1
{
  public static void main(String args[]) 
  {
    A a1=new A();
	String s1=a1.toString();  //non-static method of Object class
	Test1 t1=new Test1();
	String s2=t1.toString(); 
	System.out.println("S1= "+s1);
	System.out.println("a1= "+a1);
  }
}
