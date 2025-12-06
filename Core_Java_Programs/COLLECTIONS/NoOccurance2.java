import java.util.*;

class NoOccurance2 {
	public static void main(String[] args) {
		Integer array[] = { 10, 2, 20, 2, 10 };

		List<Integer> list=Arrays.asList(array);
		Set<Integer> mySet = new HashSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			mySet.add(array[i]);
		}
		System.out.println(mySet);
		for (Integer s : mySet) {
				System.out.println(Collections.frequency(list, s));
			}

	}
}