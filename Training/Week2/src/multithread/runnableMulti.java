package multithread;

public class runnableMulti implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running ");
		for(int i =0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		
	}
	public static void main(String []agrs) {
		
		runnableMulti threading = new runnableMulti();
		Thread a1 = new Thread(threading);
		Thread a2 = new Thread(threading);

		a1.start();
		a2.start();
		try {
			a1.join();
		}
		catch(InterruptedException e){
			System.out.println(a1.getStackTrace());
		}
		try {
			a2.join();
		}
		catch(InterruptedException e){
			System.out.println(a2.getStackTrace());
		}
		
	}
	

}
