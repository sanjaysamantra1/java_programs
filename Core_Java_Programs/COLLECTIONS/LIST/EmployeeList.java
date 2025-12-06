import java.util.*;

class EmployeeList
{
	public static void main(String[] args)
	{
		Employee emp1 = new Employee(111,"deepak",5000);
		Employee emp2 = new Employee(333,"sanjay",6000);
		Employee emp3 = new Employee(222,"ramesh",7000);

       ArrayList<Employee> ob = new ArrayList();
       ob.add(emp1);
       ob.add(emp2);
       ob.add(emp3);

	   Employee val = ob.get(1);
	   System.out.println(val);
	   System.out.println("----------------");

       for(Employee ele : ob)
       	System.out.println(ele);

	}
}







