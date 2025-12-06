class Account {
	public int accNo = 12345;
	public int accBal = 10000;
}

class Demo_0 {
	public static void main(String args[]) {
		Account ob1 = new Account();
		System.out.println(ob1.accBal);

		ob1.accBal = -50000;
		System.out.println(ob1.accBal);
	}
}






