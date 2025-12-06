import java.util.*;

class MyComparator implements Comparator
{
	public int compare(Object ob1,Object ob2)
	{
		Employee e1=(Employee)ob1;
		Employee e2=(Employee)ob2;

		return e1.getName().compareTo(e2.getName());
	}
}

public class SortEmployeeByName
{
	public static void main(String[] args)
     {
		TreeSet s=new TreeSet(new MyComparator());

		s.add(new Employee(101,"sanjay",4500));
		s.add(new Employee(103,"deepak",5300));
		s.add(new Employee(104,"rajesh",6700));
		s.add(new Employee(102,"manoj",8100));

		System.out.println(s);

	}
}
