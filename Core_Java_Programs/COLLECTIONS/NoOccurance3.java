import java.util.*;

class NoOccurance3 {

		public static void main(String[] args) {
			int arr[]={10,2,20,5,10,2,10};

			Set<Integer> mySet=new HashSet<Integer>();

			for (int i = 0; i < arr.length; i++) {
				mySet.add(arr[i]);
			}

			for (Integer no : mySet) {
				int count=0;
				for (int i = 0; i < arr.length; i++) {

					if(no==arr[i])
						count++;
				}
				System.out.println(no+" repeated for::"+count);
			}


		}

	}
