package producerConsumer;


import java.util.Queue;

public class Consumer implements Runnable{

  private final Queue<Integer> sharedQueue;

  public Consumer(Queue<Integer> sharedQueue) {
    super();
    this.sharedQueue = sharedQueue;
  }

  @Override
  public void run() {
    while ( true ) {
      try {
         consume();
      }catch(InterruptedException e) {
        e.printStackTrace();
      }

    }

  }

  private void consume() throws InterruptedException{
    synchronized (sharedQueue) {
      while ( sharedQueue.isEmpty()) {
        System.out.println("Queue is empty , consumer thread is "
            + "waiting for producer to put something in queue");
        sharedQueue.wait();
      }

      Thread.sleep(1000);
      int item = sharedQueue.poll();
      System.out.println("Consumed : " + item);
      sharedQueue.notifyAll();
    }
  }

}

