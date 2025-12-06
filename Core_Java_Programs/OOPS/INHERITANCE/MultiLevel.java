class Person{
	protected int age=25;
	protected String name="sanjay";

	void display_person()
	{
		System.out.println(age);
		System.out.println(name);
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
class Permanent extends Employee
{
	int bonus;

}

class MultiLevel
{
	public static void main(String[] args)
	{

	}

}





