
import java.util.*;

public class NoOccurance{

	public static void main(String[] args) {
		int[] intArray = { 10, 20, 20, 10, 2, 20 };
		Map map=new TreeMap();
		for (int i = 0; i < intArray.length; i++) {
			if(map.get(intArray[i])!=null){
				int value=(Integer) map.get(intArray[i]);
				map.put(intArray[i], ++value);
			}else{
				map.put(intArray[i], 1);
			}
		}
		System.out.println(map);
	}

}