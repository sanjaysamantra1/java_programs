class Student
{
	int roll;
	String name;

	Student(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}
	public boolean equals(Object obj)
	{
		try
		{
		int roll1=this.roll;
		String name1=this.name;

		Student s2=(Student)obj;

		int roll2=s2.roll;
		String name2=s2.name;

		if(roll1==roll2 && name1.equals(name2))
			return true;
		else
		   return false;
	    }
	    catch(ClassCastException c)
	    {
			return false;
		}
		catch(NullPointerException e)
		{
			return false;
		}

     }

}

class equalsDemo
{
	public static void main(String arg[])
	{
		Student s1=new Student(101,"sanjay");
		Student s2=new Student(102,"ajit");
		Student s3=new Student(102,"ajit");

		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(null));
	}
}
