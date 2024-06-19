package producerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
	
	public static void main(String[] args) {
		Queue<Integer> sharedQueue = new LinkedList<>();
		int size = 5;
		
		Thread producerThread = new Thread (new Producer(sharedQueue, size),"Prodcer");
		Thread consumerThread = new Thread (new Consumer(sharedQueue),"consumer");
		
		producerThread.start();
		consumerThread.start();
	}

}