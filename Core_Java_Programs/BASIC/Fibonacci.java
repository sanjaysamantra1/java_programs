

class Fibonacci
{
   public static void main(String args[])
   {

	  int a=1,b=1,c=0,i;

	 System.out.print(a+"  "+b);
	  for(i=0;i<=10;i++)
	  {
	  c=a+b;
	  if(c<100)
	  {
	 System.out.print(" "+c);
	  }
	  a=b;
	  b=c;
	 }
	 System.out.println();
  }
}
