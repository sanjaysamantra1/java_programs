class MyThread extends Thread
{
	public void run(){
		for(int i=1;i<=10;i++)
			System.out.println("My Thread: "+i);
	}
}
class ThreadNameDemo
{
	public final static void main(String args[])
	{
		MyThread ob=new MyThread();
		System.out.println(ob); //Thread[Thread-0,5,main]
		System.out.println(ob.getName()); //Thread-0
		ob.setName("DVS_THREAD");
		System.out.println(ob.getName());//MyThread-0
	}
}