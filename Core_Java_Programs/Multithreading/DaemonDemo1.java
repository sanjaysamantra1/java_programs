class MyThread implements Runnable
{
	public void run(){
		for(int i=1;i<=10;i++)
			System.out.println("My Thread: "+i);
	}	
}
class DaemonDemo1
{	public final static void main(String args[])
	{
		MyThread mt=new MyThread(); 
		Thread ob=new Thread(mt);
		System.out.println(ob.isDaemon());
		ob.setDaemon(true);
		System.out.println(ob.isDaemon());
		ob.start();	
		
	}
}