class Student{
	int roll;
	String name;

	public Student(int a, String b)
	{
		roll = a;
		name = b;
	}
}
class Cons_Demo1{

	public static  void main(String args[])
	{
		Student ob1 = new Student(101,"AAAA");
		Student ob2 = new Student(102,"BBBB");

		//ob1.Student(101,"AAAA");
		//ob2.Student(102,"BBBB");

		System.out.println(ob1.roll+"  "+ob1.name);
		System.out.println(ob2.roll+"  "+ob2.name);

	}
}
