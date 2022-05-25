/**
* A class that prints a counter, using threads for concurrency.
*
* @author Christine Reilly
*/
public class Counter implements Runnable {

  /** A constant for the number of times to run a loop */
  private static final int NUM_TIMES = 5;

  /** A name for this thread */
  private String threadName;

  /**
  * Constructor sets the name for this thread.
  */
  public Counter(String n) {
    this.threadName = n;
  }

  /**
  * The Runnable interface requires the run method. This is where the thread
  * starts its work.
  */
  @Override
  public void run() {
    for(int i = 0; i < NUM_TIMES; i++) {
      System.out.println(this.threadName + ": " + i);
    }
  } // end of run method



} // end of Counter class
