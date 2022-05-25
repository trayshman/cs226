/**
* A simple Object Oriented Java program.
*
* @author Christine Reilly
*/
public class HelloWorld { // The class name must be the same as the file name (minus .java extension)

  /** The message */
  private String greeting = "Hello World!";

  /**
  * Print the greeting message
  */
  public void greet() {

    // Call the println method of the System.out object to print the greeting
    // followed by an end of line
    System.out.println(greeting);

  } // end of greet method

  /**
  * Program execution starts at the main method.
  * The main method must always have exactly this header.
  */
  public static void main(String[] args) {

    // Create a HelloWorld object
    HelloWorld hw = new HelloWorld();

    // Call the object's greet method
    hw.greet();

  } // end of main method

} // end of HelloWorld class
