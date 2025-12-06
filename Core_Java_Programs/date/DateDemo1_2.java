import java.util.*;
public class DateDemo1_2
{
   public static void main(String a[])
   {
     Date ob = new Date();
     System.out.println(ob);

     int hour = ob.getHours();
     int minute = ob.getMinutes();
     int second = ob.getSeconds();
     System.out.println(hour+"-"+minute+"-"+second);
   }
}