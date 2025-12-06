class Wdemo2 
{
	public static void main(String[] args) 
	{
      String s1="123";
	  Integer i1=new Integer(s1);    // passing string obj to Integer class constructor
      System.out.println(i1);
	  int x=i1.intValue();          //unboxing
	  x=x+1;
	  System.out.println("x= "+x);
	  System.out.println();
      
      String s2="45 ";   
	  Integer y=Integer.parseInt(s2.trim());  // trim() ignores the space
	  System.out.println("y= "+y);
	}
}
