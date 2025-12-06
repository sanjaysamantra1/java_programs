class MyThread extends Thread
{
	public void run(){
		for(int i=1;i<=10;i++)
			System.out.println("My Thread: "+i);
	}
}
class ThreadDemo1
{
	public final static void main(String args[])
	{
		MyThread ob=new MyThread(); // instantiating the thread
		ob.start(); //starting the thread
		for(int i=1;i<=10;i++)
			System.out.println("main Thread: "+i);
	}
}
/*
start()
1. registers the thread with thread scheduler
2. invokes run()
*/