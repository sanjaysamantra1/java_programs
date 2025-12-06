class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println("hello");
				Thread.sleep(5000);
			} catch (Exception e) {
			}
		}
	}
}

class sleepDemo1 {
	public final static void main(String args[]) {
		MyThread ob = new MyThread();
		ob.start();
	}
}