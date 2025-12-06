import java.util.*;

class EmployeeList1
{
	public static void main(String[] args)
	{
		Employee ob1=new Employee(103,"sanjay",50000);
		Employee ob2=new Employee(101,"ajit",43656);
		Employee ob3=new Employee(102,"pradeep",1676265);

		ArrayList ob = new ArrayList();
		ob.add(ob1);//ob.add(new Employee(101,"sanjay",50000));
		ob.add(ob2);
		ob.add(ob3);

		System.out.println(ob);
		//Collections.sort(ob);//RE
		System.out.println(ob);

	}
}
