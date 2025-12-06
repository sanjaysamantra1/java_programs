import java.util.Scanner;

public class Fahrenheit
{

    public static void main(String[] args)
    {

        double Celsius = 0;
        System.out.println("Enter a temperature in Fahrenheit: ");
        Scanner s=new Scanner(System.in);

        double f=s.nextDouble();

            Celsius =(f- 32)*5/9;

        System.out.println("The temperature in Celsius is: "+Celsius);

    }
}