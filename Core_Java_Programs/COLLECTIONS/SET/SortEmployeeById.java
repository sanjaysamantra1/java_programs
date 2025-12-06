import java.util.*;

class MyComparator implements Comparator<Employee>{
	public int compare(Employee e1 , Employee e2)
	{
		return e2.getSalary() - e1.getSalary();
	}
}

public class SortEmployeeById
{
	public static void main(String[] args)
     {
		MyComparator comp = new MyComparator();
		TreeSet ob = new TreeSet(comp);

		ob.add(new Employee(101,"sanjay",4500));
		ob.add(new Employee(103,"deepak",5300));
		ob.add(new Employee(104,"rajesh",6700));
		ob.add(new Employee(102,"manoj",8100));
		ob.add(new Employee(107,"ramesh",7500));

		Iterator<Employee> i=ob.iterator();
		while(i.hasNext())
		{
		  Employee e=i.next();
		  System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		}

	}
}






