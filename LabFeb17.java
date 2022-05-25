import java.util.Scanner;
import java.util.Random;

/**
* Code for lab problems on February 17.
*
*/
public class LabFeb17 {

  private static Scanner keyIn;

  /**
  * Problem 1: complete this method by writing a for loop that prints integers
  * from the starting number to the stopping number.
  */
  private static void problem1() {
    System.out.println("***** Problem 1 *****");

    int start, stop;

    // Get values from user input for the starting number and stopping number
    // Assume the user enters integers, and stop is larger than start.
    System.out.print("Enter an integer for the starting point: ");
    start = keyIn.nextInt();

    System.out.print("Enter an integer for the stopping point: ");
    stop = keyIn.nextInt();

    // Clean up the console
    if(keyIn.hasNextLine()) {
      keyIn.nextLine();
    }

    System.out.println("\nPrinting integers from " + start + " to " + stop + "......");

    ////////////////////////////////////////////////////////////
    // Write your code here for Problem 1.
    // Write a for loop that prints integers from start to stop
    for (int i = start; i <= stop; i++){
      System.out.print(i+"\n");
    }



    // End of your code for Problem 1.
    ////////////////////////////////////////////////////////////

  } // end of problem1 method

  /**
  * Problem 2: complete this method by writing a switch structure that prints
  * one of the Fortune Teller answers based on the random number.
  */
  private static void problem2() {
    System.out.println("\n\n***** Problem 2 *****");

    Random rand = new Random();

    // Variables with the possible answers from the Fortune Teller
    String a1 = "Yes";
    String a2 = "Maybe";
    String a3 = "No";
    String a4 = "Ask again later";
    String a5 = "I don't know";

    boolean keepPlaying = true;

    while(keepPlaying) {
      System.out.print("Ask the Fortune Teller a question: ");
      keyIn.nextLine(); // We don't use the question so we don't need to save it.

      // Generate a random number to select one of the Fortune Teller answers
      int r = rand.nextInt(5);

      ////////////////////////////////////////////////////////////
      // Write your code here for Problem 2.
      // Write a switch structure that prints one of the answers (using the
      // variables a1, a2, a3, a4, and a5) based on the value of the random
      // number (variable r).



      // End of your code for Problem 2.
      ////////////////////////////////////////////////////////////

      // If the user is done, stop the loop
      System.out.print("Would you like to ask another question? (y/n) ");
      String again = keyIn.nextLine();
      if(again.charAt(0) == 'n') {
        keepPlaying = false;
      }

    } // end of loop to keep playing
  } // end of problem2 method

  private static void problem3() {
    System.out.println("\n\n***** Problem 3 *****");

    ////////////////////////////////////////////////////////////
    // Your task for Problem 3 is to add a toString method to the
    // SimpleLander class.
    // Do not make any changes to this problem3 method.
    ////////////////////////////////////////////////////////////

    // Create a SimpleLander object
    SimpleLander lander = new SimpleLander(226, 18, 40);

    // Call the lander object's toString method
    System.out.println(lander);


  } // end of problem3 method



  public static void main(String[] args) {

    // Create a scanner object for keyboard input
    keyIn = new Scanner(System.in);

    problem1();

    problem2();

    problem3();

  }
}
