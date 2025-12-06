import java.util.*;

class ReverseNumber
{
   public static void main(String args[])
   {
      int n, sum = 0, r;

      Scanner s = new Scanner(System.in);
      System.out.println("Enter a number: ");
      n = s.nextInt();

   	  while(n!=0)
	  {
	  r=n%10;
	  n=n/10;
	  sum=sum*10+r;
	  }

	  System.out.println("the number in reverse is= "+sum);
	  }
}