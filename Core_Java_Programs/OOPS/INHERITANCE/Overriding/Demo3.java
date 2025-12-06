class Person{
	protected int age=25;
	protected String name="sanjay";

	void display()	{
		System.out.println(age);
		System.out.println(name);
	}
}
class Employee extends Person{
	int empId=1101;
	int sal=15000;

	void display()	{
			System.out.println(age);
			System.out.println(name);
			System.out.println(empId);
			System.out.println(sal);
	}
}

class Demo3{
	public static void main(String[] args)	{
		Employee e=new Employee();
		e.display();
	}

}





