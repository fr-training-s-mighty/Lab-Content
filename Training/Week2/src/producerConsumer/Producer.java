package producerConsumer;


import java.util.Queue;

public class Producer implements Runnable {

  private final Queue<Integer> sharedQueue;
  private final int SIZE;

  public Producer(Queue<Integer> sharedQueue, int sIZE) {
    super();
    this.sharedQueue = sharedQueue;
    SIZE = sIZE;
  }

  @Override
  public void run() {
    int i = 0;
    while (true) {
      try {
        produce(i++);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

  }

  private void produce(int i) throws InterruptedException {
    synchronized (sharedQueue) {

      while (sharedQueue.size() == SIZE) {
        System.out.println(
            "Queue is full, producer thread waiting " + "for consumer to take something from queue");
      }

      Thread.sleep(1000);
      sharedQueue.add(i);
      System.out.println("Producer: " + i);
      sharedQueue.notifyAll();
    }

  }

}
