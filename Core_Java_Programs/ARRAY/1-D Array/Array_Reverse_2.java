import java.util.*;

class Array_Reverse_1 {
	public static void main(String s1[]) {
		int[] numbers = { 10, 20, 30, 40, 50 };
		int[] reversed = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			reversed[i] = numbers[numbers.length - 1 - i];
		}

		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(reversed));
	}
}


// Create a reversed copy without changing the original