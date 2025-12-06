import java.util.*;


class StringOccurance
{
	public static void main(String[] args) {
		String array[]={"ram","sanjay","raju","ram"};
		
		List list = Arrays.asList(array);
		Set<String> mySet = new HashSet<String>(list);
		for(String s: mySet){

		 System.out.println(s + " " +Collections.frequency(list,s));

		}
}
}