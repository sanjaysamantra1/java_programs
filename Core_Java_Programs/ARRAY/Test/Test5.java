/* passing array of objects to a function as parameter */

class Ademo1 
{
  void fun1(int i[])   //receives array of objects of type int 
  {
   System.out.println(i);
   if(i!=null && i.length>0)
   System.out.println(i[i.length-1]);
   System.out.println("length is: "+i.length);
  }
}

class Test1 
{
  public static void main(String[] args) 
  {
    Ademo1 d1=new Ademo1();
	int i[]={2,4,6,8};
	d1.fun1(i);
	System.out.println();
	d1.fun1(new int[3]);

    System.out.println();
	d1.fun1(new int[0]);
    
    d1.fun1(null);
	}
}