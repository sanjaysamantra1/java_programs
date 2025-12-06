class Wdemo5 
{
    void fun1(Integer i1)
    {
       System.out.println("i1= "+i1);
       i1=i1+1;
	   System.out.println("i1= "+i1);
       System.out.println("End of fun1()"); 
	}  
	public static void main(String[] args) 
	{
	   Wdemo5 d5=new Wdemo5();
	   d5.fun1(5);
       System.out.println();
       d5.fun1(new Integer(3));
	   d5.fun1(3);
	}
}
