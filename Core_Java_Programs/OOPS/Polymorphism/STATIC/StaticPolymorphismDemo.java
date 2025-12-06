class Account
{
	public void accDetails(int accNo,int roi, String accType)
	{
		System.out.println("account No:"+accNo);
		System.out.println("Rate Of Interest:"+roi);
		System.out.println("account Type:"+accType);
	}
	public void accDetails(int accNo,int roi, String accType,int DOM)
	{
		System.out.println("account No:"+accNo);
		System.out.println("Rate Of Interest:"+roi);
		System.out.println("account Type:"+accType);
		System.out.println("maturity Date:"+DOM);
	}
	public void accDetails(int accNo,String accType)
	{
	}
}
class SavingAccount
{
	public static void main(String[] args)
	{
		Account acc1=new Account();
		acc1.accDetails(11111,7,"Saving Account");
	}
}
class DepositeAccount
{
	public static void main(String[] args)
	{
		Account acc1=new Account();
		acc1.accDetails(22222,9,"Deposite Account",2020);
	}
}

