import java.util.*;
public class DateDemo1_1
{
   public static void main(String a[])
   {
     Date ob = new Date();
     System.out.println(ob);

     int date = ob.getDate();
     int month = ob.getMonth()+1;
     int year = ob.getYear()+1900;
     System.out.println(date+"-"+month+"-"+year);
   }
}





