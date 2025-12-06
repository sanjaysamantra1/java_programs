class MyThread extends Thread
{
	public void start(){
			System.out.println("this is start()");
	}
	public void run(){
		System.out.println("this is run()");
	}
}
class ThreadDemo5
{
	public final static void main(String args[])
	{
		MyThread ob=new MyThread();
		ob.start();
	}
}

