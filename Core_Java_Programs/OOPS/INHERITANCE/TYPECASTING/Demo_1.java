class Person{
	protected int age = 25;
	protected String name = "sanjay";
	protected String address = "bangalore";
}
class Employee extends Person{
	int empId = 1101;
	int sal = 15000;
}
class Demo_1{
	public static void main(String[] args)	{
		Person p1 = new Person();
		Employee e1 = new Employee();

		Person p2 = new Employee();
		//yes - upcasting

		//Employee e2 = new Person();
		//No

		Employee e3 = (Employee)p2;
		//Yes- downcasting
	}
}























