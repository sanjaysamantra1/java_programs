import java.util.Calendar;
public class CalendarExample
{
   public static void main(String[] args)
   {
   		Calendar calendar = Calendar.getInstance();

   		System.out.println("At present Calendar's Year: " + calendar.get(Calendar.YEAR));
   		System.out.println();

   		System.out.println("At present Calendar's Day: " + calendar.get(Calendar.DATE));
   		System.out.println();

   		System.out.println("The current date is : " + calendar.getTime());
		System.out.println();

   		calendar.add(Calendar.DATE, -15);
   		System.out.println("15 days ago: " + calendar.getTime());
   		System.out.println();

   		calendar.add(Calendar.MONTH, 4);
   		System.out.println("4 months later: " + calendar.getTime());
   		System.out.println();

   		calendar.add(Calendar.YEAR, 2);
   		System.out.println("2 years later: " + calendar.getTime());
   		System.out.println();
   }
}