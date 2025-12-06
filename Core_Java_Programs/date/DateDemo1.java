import java.util.Date;

public class DateDemo1
{
   public static void main(String a[])
   {
      Date ob = new Date();
      System.out.println(ob);

System.out.println(ob.getDate()+"/"+ob.getMonth()+"/"+ob.getYear());
   }
}