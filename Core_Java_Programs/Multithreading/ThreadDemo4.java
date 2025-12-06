class MyThread extends Thread
{
	public void run(){
		for(int i=1;i<=10;i++)
			System.out.println("My Thread: "+i);
	}	
}
class ThreadDemo4
{
	public final static void main(String args[])
	{
		MyThread ob=new MyThread(); 
		ob.start();
		ob.start();// IllegalThreadStateException(R.E)
		for(int i=1;i<=10;i++)
			System.out.println("main Thread: "+i);
	}
}