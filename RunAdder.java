/**
* Class that demonstrates problem with non-determinism when running multiple threads.
*
* @author Christine Reilly
*/
public class RunAdder {
  /**
  * Main method runs the program by creating multiple threads.
  */
  public static void main(String[] args) {

    // Create a BigAdder object and a thread, then start the thread
    BigAdder a1 = new BigAdder();
    Thread at1 = new Thread(a1);
    at1.start();

    // Create another BigAdder object and a thread, then start the thread
    BigAdder a2 = new BigAdder();
    Thread at2 = new Thread(a1);
    at2.start();

    // Wait for the threads to finish
    try {
      at1.join();
      at2.join();
    } catch(InterruptedException e) {
      // don't do anything in case of the exception
    }

    // Print out the value of the class variable
    System.out.println("After running adder threads, counter = " + BigAdder.getCounter());

  } // end of main method
}
