import java.util.*;
import java.text.*;

public class StringToDate
{
  public static void main(String a[])throws ParseException
  {
	String s = "30-11-2016 10:20:56";
	//System.out.println(s.getDate());

	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
	Date d = sdf.parse(s);
	System.out.println(d.getDate());
	System.out.println(d.getYear());
   }
}