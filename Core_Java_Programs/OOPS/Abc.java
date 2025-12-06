class Student
{
	int roll = 101;
	String name = "aaaaa";

	public String toString()
	{
		return "roll: "+roll+" name: "+name;
	}
}
class Abc{
	public static void main(String args[])
	  {
	    Student s1=new Student();
	    System.out.println(s1);
	    System.out.println(s1.toString());
  }
}







