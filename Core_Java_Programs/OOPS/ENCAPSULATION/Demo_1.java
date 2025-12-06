class Account {
	private int accNo = 12345;
	private int accBal = 10000;
}

class Demo_1 {
	public static void main(String args[]) {
		Account ob1 = new Account();
		System.out.println(ob1.accBal);

		ob1.accBal = -50000000;
		System.out.println(ob1.accBal);
	}
}






