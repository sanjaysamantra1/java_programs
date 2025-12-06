import java.util.*;

class Emp_Set_Demo_1
{
	public static void main(String[] args)
	{
		Emp emp1 = new Emp(101,"sachin",18000);
		Emp emp2 = new Emp(102,"rahul",13000);
		Emp emp3 = new Emp(101,"sachin",18000);
		Emp emp4 = new Emp(104,"Ajay",13000);

		HashSet<Emp> ob = new HashSet();
		ob.add(emp1);
		ob.add(emp2);
		ob.add(emp3);
		ob.add(emp4);


		Iterator<Emp> itr = ob.iterator();
		while(itr.hasNext())
		{
			Emp emp=itr.next();
			System.out.println(emp.getId()+"  "+emp.getName()+"  "+emp.getSalary());
		}
	}
}
