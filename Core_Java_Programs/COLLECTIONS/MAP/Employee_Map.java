import java.util.*;

class Employee_Map
{
	public static void main(String[] args)
	{
	  HashMap<Integer,Employee> ob = new HashMap();
	  Employee emp1 = new Employee(111,"Ajay",5000);
	  Employee emp2 = new Employee(222,"Deepak",6000);
	  Employee emp3 = new Employee(333,"Ramesh",7000);
	  Employee emp4 = new Employee(444,"Hari",8000);

	  ob.put(emp1.getId(),emp1);
	  ob.put(emp2.getId(),emp2);
	  ob.put(emp3.getId(),emp3);
	  ob.put(emp4.getId(),emp4);

	  Employee val222 = ob.get(222);
	  System.out.println(val222);

	  Set<Integer> allKeys = ob.keySet();
	  for(int key : allKeys)
	  {
		  System.out.println(ob.get(key));
	  }


	}
}
