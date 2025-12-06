class Person{
	protected int age=25;
	protected String name="sanjay";
	protected String address="bangalore";

	void display_person()
	{
		System.out.println(age);
		System.out.println(name);
		System.out.println(address);
	}

}
class Employee extends Person{
	int empId=1101;
	int sal=15000;

	void display_employee()
	{
		display_person();
		System.out.println(empId);
		System.out.println(sal);
	}
}
class Student extends Person
{
	int rollNo=101;
	String clgName="dvs";

	void display_student()
	{
		display_person();
		System.out.println(rollNo);
		System.out.println(clgName);
	}
}

class InhDemo2
{
	public static void main(String[] args)
	{
		Employee e = new Employee();
		e.display_employee();

		System.out.println("-----------------");

		Student s = new Student();
		s.display_student();
	}

}





