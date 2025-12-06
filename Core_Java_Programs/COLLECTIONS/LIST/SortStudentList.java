import java.util.*;

class SortStudentList
{
	public static void main(String args[])
	{
		Student ob1=new Student(101,"deepak",67);
		Student ob2=new Student(102,"Ajay",82);
		Student ob3=new Student(103,"Manoj",78);

		ArrayList ob=new ArrayList();
		ob.add(ob1);
		ob.add(ob2);
		ob.add(ob3);

		Iterator itr = ob.iterator();
		while(itr.hasNext()){
			Student s=(Student)itr.next();
			System.out.println(s);
		}

	}
}