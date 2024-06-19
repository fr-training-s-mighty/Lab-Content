package multithread;

public class synchRunner {
	
	public static void main(String[] args) throws InterruptedException {
		synch counter = new synch();
		Thread lamb = new Thread(() ->  {
			for(int i =0;i<1000;i++) {
				counter.incremenet();
			}
		});
		
		Thread lamb2 = new Thread(() ->  {
			for(int i =0;i<1000;i++) {
				counter.incremenet();
			}
		});		
		
		lamb.start();
		lamb2.start();
		
		lamb.join();
		lamb2.join();
		
		System.out.println(counter.getCount());
		
	}

}

class synch {
	
	private int count = 0;
	
	public synchronized void incremenet() {
		this.count++;
	}
	public int getCount() {
		return this.count;
	}

}