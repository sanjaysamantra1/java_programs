
import java.util.*;

public class HashMapDemo3 {
	public static void main(String[] args) {

		Employee e1 = new Employee(101,"ajay",5000);
		Employee e2 = new Employee(102,"deepak",6500);
		Employee e3 = new Employee(101,"ajay",5000);

		HashMap<Employee,String> ob = new HashMap();
		ob.put(e1,"Ajay");
		ob.put(e2,"deepak");
		ob.put(e3,"Duplicate Ajay");

		for(Employee e : ob.keySet())
		{
		 System.out.println(ob.get(e));
		}

	}
}
