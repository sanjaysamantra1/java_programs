import java.util.*;
class myComparator implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		return e2.getSalary() - e1.getSalary();
	}
}

class TreeSetdemo3
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee(103,"aaaaa",5000);
		Employee e2 = new Employee(101,"bbb",7000);
		Employee e3 = new Employee(102,"ccc",6000);

		myComparator comp = new myComparator();
		TreeSet<Employee> ob = new TreeSet(comp);
		ob.add(e1);
		ob.add(e2);
		ob.add(e3);

		for(Employee ele : ob)
		System.out.println(ele);
	}
}
