package For_Testing;

public class MultiTasking extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiTasking t1=new MultiTasking();  
		t1.start();
	}
	
	public void run() {
		System.out.println("thread is running...");
	}
}
