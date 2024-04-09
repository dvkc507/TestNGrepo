package prob;

public class TestingThread extends Thread{
	
	public void run() {
		System.out.println("Inside run method, run started");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestingThread thread = new TestingThread();
		thread.start();
		System.out.println("After start");

	}

}
