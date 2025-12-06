import java.util.*;

class Perfect
{

 public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);

	  int n,i,sum=0;

	  System.out.println("enter a number");
	  n=s.nextInt();

	  for(i=1;i<n;i++)
	  {
	    if(n%i==0)
	    sum=sum+i;
	  }

	  if(n==sum)
	    System.out.println("it is perfect no");
	  else
	    System.out.println("it is not perfect");

   }
}