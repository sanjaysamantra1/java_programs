import java.util.*;

public class RemoveDuplicate3 {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,4,2,4,3,5,7,3,5);

		System.out.println(numbers);

		Set<Integer> set=new HashSet<>();
		set.addAll(numbers);

		Iterator iterator=set.iterator();

		while(iterator.hasNext()){
			System.out.print(iterator.next()+"  ");
		}


	}

}
