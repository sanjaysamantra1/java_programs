/*This prog decides if the string is empty or not*/

class isEmpty
{
  public static void main(String args[])
  {
	String str1 = "hello java";
	boolean b1 = str1.isEmpty();
    System.out.println("String is empty?: "+b1);

    String str2 = "";
	boolean b2 = str2.isEmpty();
    System.out.println("String is empty?: "+b2);
  }
}

