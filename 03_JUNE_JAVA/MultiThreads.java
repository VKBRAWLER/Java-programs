public class MultiThreads {
  public static void main(String[] args) {
    // Create two threads with specified names
    Thread csThread = new Thread(new CustomRunnable("CSthread"), "CSthread");
    Thread itThread = new Thread(new CustomRunnable("ITthread"), "ITthread");
    // Start both threads
    csThread.start();
    itThread.start();
  }
}

class CustomRunnable implements Runnable {
  private final String threadName;
  private int executionCount = 0;

  public CustomRunnable(String threadName) {
    this.threadName = threadName;
  }

  public void run() {
  try {
  // Loop to repeatedly execute the thread
  while (executionCount < 8) {
  // Increment the execution count
  executionCount++;
  // Display the thread's name and execution count
  System.out.println(threadName + " executed " + executionCount + " times.");
  // Sleep for 500  milliseconds
  Thread.sleep(500);
  }
  } catch (InterruptedException e) {
  System.err.println(threadName + " interrupted.");
  }
  }
}
