/*Create a regular expression for phone number validation */

import java.util.Scanner;

public class Test_3
{
  	public static boolean validatePhone(String phone)
  	{
      return phone.matches("[0-9]{10}");
  	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	  	System.out.print("Enter Phone Number: ");
	    String phone = input.nextLine();

        while(validatePhone(phone) != true)
        {
          	System.out.print("Invalid PhoneNumber!");
            System.out.println();
            System.out.print("Enter Phone Number: ");
            phone = input.nextLine();
        }
        System.out.println("Correct telephone number");

	}//main
}