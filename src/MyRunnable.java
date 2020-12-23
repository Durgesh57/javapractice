package javapractice;

class MyRun implements Runnable {
	public void run() {
		go();
	}
	public void go() {
		doMore();
	}
	public void doMore() {
		System.out.println("top o’ the stack");
	}
} 
class MyRunnable {
	public static void main (String[] args) {
		Runnable threadJob = new MyRun();
		Thread myThread = new Thread(threadJob);
		
		myThread .start();
		System.out.println("back in main");
	}
}