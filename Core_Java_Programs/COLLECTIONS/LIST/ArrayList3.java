import java.util.*;

class ArrayList3
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();

		for(int i=1;i<=10;i++){
			list.add(i);
		}

		Iterator i=list.iterator();
		while(i.hasNext())
		{
		  System.out.println(i.next());
		}

	}
}
