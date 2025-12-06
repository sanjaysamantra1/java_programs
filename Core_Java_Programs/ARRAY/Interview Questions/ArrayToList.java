import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayToList {

	public static void main(String[] args) {

		Integer[] arr=new Integer[]{10,20,30};
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println(list);

		int[] arr2=new int[]{11,22,33};
		//List<Integer> list2=new ArrayList<Integer>(Arrays.asList(arr2));
		List<Integer> list2=new ArrayList(Arrays.asList(arr2));
		System.out.println(list2);

		int[] arr3=new int[]{11,22,33};
		List<Integer> list3=new ArrayList<Integer>();

		for (int i = 0; i < arr3.length; i++) {
			list3.add(arr3[i]);
		}
		System.out.println(list3);

	}

}
