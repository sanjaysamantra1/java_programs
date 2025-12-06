class Account {
	private int accNo=12345;
	private int accBal=10000;

	public void disp() {
		System.out.println(accNo + "  " + accBal);
	}
	public void depositAmt(int amt)
	{
		if(amt<0)
		{
			System.out.println("invalid amount");
		}
		else
		  accBal = accBal+amt;
	}
}

class Demo_3 {
	public static void main(String args[]) {
		Account ob = new Account();
		//System.out.println("Balance: "+ob.accBal);
		ob.disp();

		ob.depositAmt(-500);
		ob.disp();

		ob.depositAmt(1000);
		ob.disp();
	}
}