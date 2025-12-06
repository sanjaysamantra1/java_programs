import java.util.*;
import java.text.*;

public class DateToString
{
  public static void main(String a[])
  {
	Date d = new Date();
	System.out.println(d);

	SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");
	String s = sdf.format(d);
	System.out.println(s); //29-nov-18

  }
}