class MyThread extends Thread
{	
}
class ThreadDemo2
{
	public final static void main(String args[])
	{
		MyThread ob=new MyThread(); // instantiating the thread
		ob.start(); //starting the thread
		for(int i=1;i<=10;i++)
			System.out.println("main Thread: "+i);
	}
}
// Thread class run() will be executed which doesnt have any logic