class MyThread extends Thread
{
	public void run(int x){
			System.out.println(" 1-arg run()");
	}
	public void run(){
		System.out.println(" 0-arg run()");
	}
}
class ThreadDemo6
{
	public final static void main(String args[])
	{
		MyThread ob=new MyThread();
		ob.start();
	}
}

