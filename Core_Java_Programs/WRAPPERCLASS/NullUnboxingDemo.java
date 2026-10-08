public class NullUnboxingDemo {
	public static void main(String[] args) {
		Integer number = null;

		if (number != null) {
			int value = number;
			System.out.println(value);
		} else {
			System.out.println("Number is not available");
		}
	}
}