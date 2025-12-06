import java.util.*;
import java.text.*;

public class CurrentDateTime
{
  public static void main(String a[])throws Exception
  {
	   Date ob = new Date();

	   System.out.println(ob);

	   SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
	   String str=dateFormat.format(ob);
	   System.out.println(str);
   }
}