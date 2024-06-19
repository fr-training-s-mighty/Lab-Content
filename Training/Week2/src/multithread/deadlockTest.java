package multithread;

public class deadlockTest {

	private static void acquiredResInOrder(Resource res1, Resource res2) {
		// TODO Auto-generated method stub
		Resource firstResource, secondRes;
		if(res1.getName().compareTo(res2.getName())>0) {
			firstResource = res2;
			secondRes = res1;
		}
		else {
			firstResource = res1;
			secondRes = res2;
			
		}
		synchronized(firstResource) {
			
			System.out.println(Thread.currentThread().getName()+" locked "+firstResource.getName());
			try {
				Thread.sleep(50);
				
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
//		}
			synchronized (secondRes) {
				System.out.println(Thread.currentThread().getName()+" locked "+secondRes.getName());
				try {
					Thread.sleep(50);
					
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		final Resource res1 = new Resource("R1");
		final Resource res2 = new Resource("R2");
		
		Thread th1 = new Thread(() -> {
			acquiredResInOrder(res1,res2);
		},"Thread1");
		
//		Thread th2 = new Thread(() -> {
//			acquiredResInOrder(res1,res2);
//		},"Thread2");
		Thread th2 = new Thread(() -> {
			acquiredResInOrder(res2,res1);
		},"Thread2");

		th1.start();
		th2.start();
		
		th1.join();
		th2.join();
	}


}

class Resource{
	
	private final String name;
	
	public Resource(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public synchronized void acquire(Resource other) {
		System.out.println(Thread.currentThread().getName()+" acquired "+this.getName()+" waiting to acquire "+other.getName());
		other.access();
	}
	private synchronized void access() {
		System.out.println(Thread.currentThread().getName() + " accessing "+ this.getName());
	}
	
}