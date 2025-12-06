import java.util.*;

class Emp_Set_Demo_2
{
	public static void main(String[] args)
	{
		Employee emp1 = new Employee(101,"sachin",18000);
		Employee emp2 = new Employee(102,"rahul",13000);
		Employee emp3 = new Employee(101,"sachin",18000);
		Employee emp4 = new Employee(104,"Ajay",13000);

		HashSet<Employee> ob=new HashSet();
		ob.add(emp1);
		ob.add(emp2);
		ob.add(emp3);
		ob.add(emp4);


		Iterator<Employee> itr=ob.iterator();
		while(itr.hasNext())
		{
			Employee emp=itr.next();
			System.out.println(emp.getId()+"  "+emp.getName()+"  "+emp.getSalary());
		}
	}
}
