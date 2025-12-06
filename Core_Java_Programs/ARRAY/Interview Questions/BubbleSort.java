public class BubbleSort {

	public static void main(String[] args) {

		int arr1[] = { 12, 14, 8, 22, 17, 5, 36, 7 };
		
		System.out.println("before sorting");
		for (int i : arr1) {
			System.out.print(i + "  ");
		}
		
		int arr2[] = DoBubbleSort(arr1);

		System.out.println("\nAfter sorting");
		for (int i : arr2) {
			System.out.print(i + "  ");
		}

	}

	public static int[] DoBubbleSort(int a[]) {

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		return a;
	}
}
