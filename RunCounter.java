/**
* Class that demonstrates running multiple threads.
*
* @author Christine Reilly
*/
public class RunCounter {
  /**
  * Main method runs the program by creating multiple threads.
  */
  public static void main(String[] args) {

    // Create a Counter object and a thread, then start the thread
    Counter c1 = new Counter("one");
    Thread ct1 = new Thread(c1);
    ct1.start();

    // Create another Counter object and a thread, then start the thread
    Counter c2 = new Counter("two");
    Thread ct2 = new Thread(c2);
    ct2.start();

    // Wait for the threads to finish
    try {
      ct1.join();
      ct2.join();
    } catch(InterruptedException e) {
      // don't do anything in case of the exception
    }

    System.out.println("All done!");

  } // end of main method
}
