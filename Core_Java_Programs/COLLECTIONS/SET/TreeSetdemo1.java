import java.util.*;

class TreeSetdemo1
{
	public static void main(String[] args)
	{
		TreeSet<Integer> ob = new TreeSet();
        ob.add(55); //[55]
        ob.add(15); //[15,55]
        ob.add(35); //[15, 35, 55]
        ob.add(30); //[15, 30 , 35, 55]
        ob.add(40); //[15,30,35,40,55]
        System.out.println(ob);


		Iterator<Integer> i1=ob.iterator();
		while(i1.hasNext())
		{
			int x=i1.next();
			System.out.println(x);
		}
		System.out.println();

		Iterator<Integer> i2=ob.descendingIterator();
		while(i2.hasNext())
		{
			int y=i2.next();
			System.out.println(y);
		}

System.out.println(ob);
	}
}
