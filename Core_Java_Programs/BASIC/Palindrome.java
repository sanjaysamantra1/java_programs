import java.util.*;

class Palindrome
{
   public static void main(String args[])
   {
      int n, sum = 0, num, r;

      Scanner s = new Scanner(System.in);
      System.out.println("Enter a number to check if it is an armstrong number");
      n = s.nextInt();

      num= n;


	  while(n!=0)
	  {
	  r=n%10;
	  n=n/10;
	  sum=sum*10+r;
	  }
	  if(num==sum)
	  System.out.print("It is a Palindrom number");
	  else
	  System.out.print("It is not a Palindrome number");
	  }
}