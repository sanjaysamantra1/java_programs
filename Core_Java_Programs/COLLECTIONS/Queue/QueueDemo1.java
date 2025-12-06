import java.util.*;

public class QueueDemo1
{
  public static void main(String args[])
  {
	  PriorityQueue<String> ob=new PriorityQueue<>();
	  ob.add("banana");
	  ob.add("pear");
	  ob.add("apple");
	  System.out.println(ob.poll()+"  "+ob.peek());
   }
}