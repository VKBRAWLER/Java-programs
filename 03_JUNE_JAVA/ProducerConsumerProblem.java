class SharedBuffer {
  private int value;
  private boolean hasValue = false;

  public synchronized void produce(int newValue) throws InterruptedException {
    while (hasValue) {
      wait();
    }
    value = newValue;
    hasValue = true;
    System.out.println("Produced: " + value);
    notify();
  }

  public synchronized void consume() throws InterruptedException {
    while (!hasValue) {
      wait();
    }
    System.out.println("Consumed: " + value);
    hasValue = false;
    notify();
  }
}

class Producer implements Runnable {
  private SharedBuffer buffer;

  public Producer(SharedBuffer buffer) {
    this.buffer = buffer;
  }

  public void run() {
    int i = 0;
    while (true) {
      try {
        buffer.produce(i++);
        Thread.sleep(500); // Simulate time taken to produce
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class Consumer implements Runnable {
  private SharedBuffer buffer;

  public Consumer(SharedBuffer buffer) {
    this.buffer = buffer;
  }

  public void run() {
    while (true) {
      try {
        buffer.consume();
        Thread.sleep(500); // Simulate time taken to consume
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class ProducerConsumerProblem {
  public static void main(String[] args) {
    SharedBuffer buffer = new SharedBuffer();
    Thread producerThread = new Thread(new Producer(buffer));
    Thread consumerThread = new Thread(new Consumer(buffer));
    producerThread.start();
    consumerThread.start();
  }
}