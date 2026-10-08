import java.util.*;

class Array_Reverse_1 {
	public static void main(String s1[]) {
		int[] numbers = { 10, 20, 30, 40, 50 };

		int left = 0;
		int right = numbers.length - 1;

		while (left < right) {
			int temp = numbers[left];
			numbers[left] = numbers[right];
			numbers[right] = temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(numbers));
	}
}
