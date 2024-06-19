package multithread;

public class threadMulti extends Thread{
	
	static int s =0;
	
	@Override
	public void run() {
		System.out.println("Thread is running " +s++);
	}
	
	public static void main(String []agrs) {
		
		threadMulti threading = new threadMulti();
		
		threadMulti threading2 = new threadMulti();
		threading.start();

		threading2.start();
		
	}

}
