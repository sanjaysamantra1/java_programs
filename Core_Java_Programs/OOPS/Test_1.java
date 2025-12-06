class Student
{
	int roll=101;
	String name="hari";
	String add="bangalore";

	public void disp()
	{
		System.out.println(roll+" "+name+" "+add);
	}
}
class Test_1{
	public static void main(String args[])
	  {
         new Student().disp();
         Student s1=new Student();
         s1.disp();
  	  }
}







