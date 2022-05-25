import java.util.concurrent.locks.*;

/**
* A class that adds to a counter instance variable, using threads for concurrency.
* Demonstrates the problem of non-determininsm
*
* @author Christine Reilly
*/
public class BigAdder implements Runnable {

  /** A counter class variable */
  private static int counter = 0;

  /** A lock we can use to protect the critical section */
  private static Lock lock = new ReentrantLock();


  /** A constant for the number of times to run a loop */
  private static final int NUM_TIMES = 10000;

  /**
  * Returns the value of the counter.
  */
  public static int getCounter() {
    return counter;
  }

  /**
  * The Runnable interface requires the run method. This is where the thread
  * starts its work.
  */
  @Override
  public void run() {
    // Increment the counter many times
    for(int i = 0; i < NUM_TIMES; i++) {
      lock.lock();
      counter++;
      System.out.println(counter);
      lock.unlock();
    }
  } // end of run method

} // end of BigAdder class
