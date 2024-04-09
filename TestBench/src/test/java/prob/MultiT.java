package prob;

public class MultiT implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiT obj = new MultiT();
		Thread t = new Thread(obj);
		t.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run started");
	}

}
