class MyThread extends Thread {
	public void run() {
		System.out.println("Thread started:::"+Thread.currentThread().getName());
		try{
		     Thread.sleep(4000);
		    }
	    catch(InterruptedException e) {
		    e.printStackTrace();
          }
		System.out.println("Thread Ended:::"+Thread.currentThread().getName());
	}
}
class joinDemo2 {
	public final static void main(String args[]) {
		MyThread ob1 = new MyThread();
		MyThread ob2 = new MyThread();
		MyThread ob3 = new MyThread();
		ob1.start();
		ob2.start();
		try{ob2.join();}
		catch(Exception e){}
		ob3.start();
	}
}