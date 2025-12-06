import java.util.Scanner;

class ScannerDemo1{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);

		System.out.println("enter 2 no");
		double a = ob.nextDouble();
		//System.out.println("enter another no");
		int b = ob.nextInt();

		System.out.println("addition "+(a+b));
	}
}

