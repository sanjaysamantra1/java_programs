class MyThread1 extends Thread {
	public void run() {

		for (int i = 1; i <= 50; i++) {
			System.out.println("MyThred-1: "+i);
		}
	}
}
class MyThread2 extends Thread {
	public void run() {
      Thread.yield();
		for (int i = 1; i <= 50; i++) {
			System.out.println("MyThred-2: "+i);
		}
	}
}
class yieldDemo1 {
	public final static void main(String args[]) {
		MyThread1 ob1 = new MyThread1();
		MyThread2 ob2 = new MyThread2();
		ob1.start();
		ob2.start();
	}
}