public class EvenOddThread extends Thread {
	volatile static int i = 1;
	Object lock;

	EvenOddThread(Object lock) {
		this.lock = lock;
	}

	public static void main(String ar[]) {
		Object obj = new Object();
		// This constructor is required for the identification of wait/notify
		// communication
		EvenOddThread odd = new EvenOddThread(obj);
		EvenOddThread even = new EvenOddThread(obj);
		odd.setName("Odd");
		even.setName("Even");
		odd.start();
		even.start();
	}

	@Override
	public void run() {
		while (i <= 20) {
			if (i % 2 == 0 && Thread.currentThread().getName().equals("Even")) {
				synchronized (lock) {
					System.out.println(Thread.currentThread().getName() + " - " + i);
					i++;
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			if (i % 2 == 1 && Thread.currentThread().getName().equals("Odd")) {
				synchronized (lock) {
					System.out.println(Thread.currentThread().getName() + " - " + i);
					i++;
					lock.notify();
				}
			}
		}
	}
}