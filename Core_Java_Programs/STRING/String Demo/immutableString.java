//string objects are immutable(not modifiable)
class immutableString
{
 public static void main(String args[])
 {
   String s1 = "Sachin";
   String s2 = " Tendulkar";
   s1 = s1.concat(s2);
   System.out.println(s1);
   }
}

