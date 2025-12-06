import java.util.*;
public class ListToArray
{
  public static void main(String[] args)
  {
    List<Integer> arrayList=new ArrayList<Integer>();
    arrayList.add(10);
    arrayList.add(20);
    arrayList.add(30);    
    System.out.println(arrayList);
    
   Object[] arr = arrayList.toArray();

   for(Object ob:arr){	   
    System.out.println((Integer)ob);
	}
    
  }
}