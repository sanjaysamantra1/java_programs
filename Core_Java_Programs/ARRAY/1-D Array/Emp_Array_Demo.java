class Emp_Array_Demo {
	public static void main(String s1[]) {
		Employee ob1 = new Employee(101, "sachin", 5600);
		Employee ob2 = new Employee(102, "Rahul", 7500);

		Employee[] arr = new Employee[10];
		arr[0] = ob1;
		arr[1] = ob2;
		arr[3] = new Employee(103, "Ramesh", 5400);
		// arr[4] = "Tata";

		for (Employee emp : arr)
			// System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());
			System.out.println(emp);
	}
}
