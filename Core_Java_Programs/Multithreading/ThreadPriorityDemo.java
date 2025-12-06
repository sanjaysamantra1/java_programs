class MyThread extends Thread
{
	public void run(){
		System.out.println("hello");
	}
}
class ThreadPriorityDemo
{
	public final static void main(String args[])
	{
		MyThread ob=new MyThread();
		System.out.println("Priority: "+ob.getPriority());
		ob.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Priority: "+ob.getPriority());
		ob.setPriority(8);
		System.out.println("Priority: "+ob.getPriority());
		//ob.setPriority(11);//IllegalArgumentException
		//ob.setPriority(-2);//IllegalArgumentException
	}
}