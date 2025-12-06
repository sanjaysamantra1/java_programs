// static property is shared to all objects. it saves memory
// college refers to the common property of all objects

class Student{
	int roll;
	String name;
	static String clgName="New Horizon";

	public void disp()
	{
		System.out.println(roll+" "+name+" "+clgName);
	}
}

class Demo_1{
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.roll = 111; s1.name = "AAA";
		s1.disp();

		Student.clgName="Horizon-changed";

		Student s2 = new Student();
		s2.roll = 222; s2.name = "BBB";
		s2.disp();


		Student s3 = new Student();
		s3.roll=333; s3.name="CCC";
		s3.disp();

		s3.roll=333333;
		s3.disp();
	}
}






