import java.util.*;

public class RemoveDuplicate3 {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,4,2,4,3,5,7,3,5);
		
		System.out.println(numbers);
		
		Set<Integer> distinct=new HashSet<>();
		distinct.addAll(numbers);
		
		Iterator iterator=distinct.iterator();
		
		while(iterator.hasNext()){
			System.out.print(iterator.next()+"  ");
		}
		

	}

}
