import java.util.Scanner;

public class CompoundInterest
{

    public static void main(String[] args)
    {

        double p,t,r,si,ci;

        Scanner s=new Scanner(System.in);

        System.out.println("Enter principal amount: ");
        p=s.nextDouble();

        System.out.println("Enter rate of interest: ");
        r=s.nextDouble();

        System.out.println("Enter Time(in year): ");
        t=s.nextDouble();

        si=(p*t*r)/100;
        System.out.println("Simple interest is= "+si);

		ci = p*Math.pow((1+r/100),t)- p;
        System.out.println("Compound interest is= "+ci);

    }
}