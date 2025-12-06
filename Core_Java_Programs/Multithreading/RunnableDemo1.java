class MyThread implements Runnable
{
	public void run(){
		for(int i=1;i<=10;i++)
			System.out.println("My Thread: "+i);
	}
}
class RunnableDemo1
{	public  static void main(String args[])
	{
		MyThread mt=new MyThread(); // create obj for our class
		Thread ob=new Thread(mt);// pass our class obj to Thread class
		ob.start();

	}
}