class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("Available Balance " + this.amount);
		System.out.println("going to withdraw..."+amount);

		if (this.amount < amount) {
			System.out.println("Insufficient balance; waiting for deposit...");
			try {
				wait();
			}
			catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("Detected amaount: " + amount);
		System.out.println("withdraw completed...");
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("Available Balance " + this.amount);
		System.out.println("deposit completed... ");
		notify();
	}
}
class WithdrawThread extends Thread
{
	Customer c;
	WithdrawThread(Customer c)
	{
		this.c=c;
	}
	public void run()
	{
		c.withdraw(15000);
	}
}
class DepositThread extends Thread
{
	Customer c;
	DepositThread(Customer c)
	{
		this.c=c;
	}
	public void run()
	{
		c.deposit(10000);
	}
}

class InterThreadDemo2 {
	public static void main(String args[]) {
		final Customer c = new Customer();

		WithdrawThread wt=new WithdrawThread(c);
		DepositThread dt=new DepositThread(c);

		wt.start();
		dt.start();

	}
}