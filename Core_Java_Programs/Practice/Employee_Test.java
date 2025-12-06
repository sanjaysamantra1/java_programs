class Address{
	String street;
	String city;
	String state;
	public Address(String street, String city, String state) {
		this.street = street;
		this.city = city;
		this.state = state;
	}
}
class Employee{
	int empId;
	String name;
	double sal;
	Address add;
	public Employee(int empId, String name, double sal, Address add) {
		this.empId = empId;
		this.name = name;
		this.sal = sal;
		this.add = add;
	}
	public void disp()
	{
		System.out.println(empId+" "+name+" "+sal+" "+add.street+" "+add.city+" "+add.state);
	}

}
public class Employee_Test {
	public static void main(String[] args) {
		Address add1=new Address("marathalli","bangalore","karnataka");
		Employee emp1=new Employee(101, "sachin", 10000, add1);
		emp1.disp();
	}

}
