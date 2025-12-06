class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name){
		this.d=d;
		this.name=name;
	}
	public void run(){
		for(int i=1;i<=10;i++)
		d.wish(name);
	}

}
class Display{
	public void wish(String name){
			System.out.println("Hi "+name);
	}
}
class SynchronizedDemo1
{	public final static void main(String args[])
	{
		Display d1=new Display();
		Display d2=new Display();
		MyThread ob1=new MyThread(d1,"Bangalore");
		MyThread ob2=new MyThread(d1,"Chennai");
		ob1.start();
		ob2.start();

	}
}