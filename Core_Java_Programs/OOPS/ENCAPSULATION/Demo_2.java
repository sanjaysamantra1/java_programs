class Account {
	private int accNo=12345;
	private int accBal=10000;

	public void disp() {
		System.out.println(accNo + "  " + accBal);
	}
	public void depositAmt(int amt){
		accBal = accBal+amt;
	}
}

class Demo_2 {
	public static void main(String args[]) {
		Account ob = new Account();
		//System.out.println("Balance: "+ob.accBal);
		ob.disp();

		//ob.accBal=-5000;
		ob.depositAmt(-50000);

		ob.disp();
	}
}






