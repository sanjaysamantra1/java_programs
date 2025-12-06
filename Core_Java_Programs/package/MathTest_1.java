import java1.lang1.Math1;
import java.util.Scanner;

public class MathTest_1
{
  public static void main(String ar[])
    {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number");
		int a=sc.nextInt();

		System.out.println("Enter another number");
		int b=sc.nextInt();

		int x=Math1.add(a,b);
        System.out.println("Addition is= "+x);

        int y=Math1.sub(a,b);
        System.out.println("subtraction is= "+y);

        Math1 ob=new Math1();
        int z=ob.mul(a,b);
        System.out.println("multiplication is= "+z);
    }

   }
