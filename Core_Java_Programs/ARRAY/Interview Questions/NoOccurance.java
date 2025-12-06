import java.util.*;


class NoOccurance
{
	public static void main(String[] args) {
			
		List list = Arrays.asList(3,8,5,7,3,5,9);
		Set<Integer> mySet = new HashSet<Integer>(list);
		
		for(Integer s: mySet){

		 System.out.println(s + " present " +Collections.frequency(list,s)+" times");

		}
}
}