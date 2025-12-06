class MyThread1 extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("MyThred-1: "+i);
		}
	}
}
class MyThread2 extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("MyThred-2: "+i);
		}
	}
}
class MyThread3 extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("MyThred-3: "+i);
		}
	}
}
class joinDemo1 {
	public final static void main(String args[]) {
		MyThread1 ob1 = new MyThread1();
		MyThread2 ob2 = new MyThread2();
		MyThread3 ob3 = new MyThread3();
		ob1.start();
		try{ob1.join();}
		catch(Exception e){}
		ob2.start();
		//try{ob2.join();}
		//catch(Exception e){}
		ob3.start();

	}
}