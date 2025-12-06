import java.util.*;
public class DateMethods_1
{
   public static void main(String a[])
   {
     Date d = new Date();
	 System.out.println("Todays Date is: "+d);
	 System.out.println("Current Date: "+d.getDate());
	 System.out.println("Current Day: "+d.getDay());
	 System.out.println("Current Month: "+d.getMonth());
	 System.out.println("Current Month: "+(d.getMonth()+1));
	 System.out.println("Current Year: "+d.getYear()); //after 1900
	 System.out.println("Current Year: "+(d.getYear()+1900));
	 System.out.println("Current Hours: "+d.getHours());
	 System.out.println("Current Minutes: "+d.getMinutes());
	 System.out.println("Current Seconds: "+d.getSeconds());

   }
}