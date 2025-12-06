import java.util.*;

class IteratorDemo {
    public static void main(String a[]){
		ArrayList<Integer> ob = new ArrayList<>();
		ob.add(10);
		ob.add(40);
		ob.add(10);
		ob.add(50);
		ob.add(20);

		for(int ele : ob)
		System.out.println(ele);

		System.out.println("*****************");

		Iterator itr = ob.iterator();
		while(itr.hasNext())
		{
			//Integer val = (Integer)itr.next();
			System.out.println(itr.next());
		}
    }
}



