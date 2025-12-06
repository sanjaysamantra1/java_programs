
class Employee{
	private int empId;
	private String name;
	private int sal;

	public Employee(int empId, String name, int sal) {
		this.empId = empId;
		this.name = name;
		this.sal = sal;
	}
	public void disp(){
		System.out.println(empId+" "+name+" "+sal);
	}

}
