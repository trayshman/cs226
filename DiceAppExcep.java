/**
* A console application that rolls two dice.
* This version of the program demonstrates handling exceptions.
*
* @author Christine Reilly
*/

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DiceAppExcep {

  /** Scanner object for reading keyboard input */
  private Scanner keyboardIn;

  /** A Die object to represent the first die */
  private DieExcep d1;

  /** A Die object to represent the second die */
  private DieExcep d2;

  /**
  * Creates a DiceAppConsole.
  *
  * @param r The random number generator to be used by the dice.
  */
  public DiceAppExcep(Random r) {
    this.keyboardIn = new Scanner(System.in);

    boolean done = false;

    while(!done) {
      // Use a try-catch structure to handle the IllegalArgumentException that could
      // be thrown by the DieExceptions constructor (by way of the setSides method)
      try {
        int sides = askForInt("How many sides do the die have? ");
        System.out.println("Creating two die with " + sides + " sides");
        // Create two die
        this.d1 = new DieExcep(sides, r);
        this.d2 = new DieExcep(sides, r);

        // If we reach this point, the die objects are successfully created
        done = true;

      } catch(IllegalArgumentException e) { // exception from setSides in DieExcep
        System.out.println(e.getMessage()); //gets message from the exception in DieExcep 
      }
    } // end of loop to create Die objects

  } // end of constructor

  /**
  * Get an integer from user input
  *
  * @return The number of sides
  */
  private int askForInt(String prompt) {
    boolean done = false; // loop control variable
    int value = 0; // need to initialize value outside of try block as well

    while(!done) {
      try { // try for catch exception (if there is an incorrect input entered)
        // Prompt the user
        System.out.print(prompt);
        value = keyboardIn.nextInt();

        // If we reach this point, the user successfuly entered an integer
        done = true;

      } catch(InputMismatchException e) {
        // The catch block only executes if an InputMismatchException was thrown
        System.out.println("You must enter an integer, try again....");

      } finally {
        // The finally block always executes (after the try or catch block is done), whether or not the exception occurred
        // Clear any junk left on input stream
        if(keyboardIn.hasNextLine()) { // if the scanner has a next line, call it
          keyboardIn.nextLine();
        }
      }
    }

    return value;
  } // end of askForInt method

  /**
  * Runs the program to roll dice.
  */
  public void run() {
    boolean keepRolling = true;

    // Roll the die until the user chooses to stop rolling
    while(keepRolling) {
      System.out.println("Rolled a " + d1.roll() + " and a " + d2.roll());
      System.out.print("Do you want to roll again? (y/n): ");
      String response = keyboardIn.nextLine();
      if(response.charAt(0) == 'n') {
        keepRolling = false;
      }
    }
    System.out.println("All done!");
  }

  public static void main(String[] args) {

    // Create a Random object
    Random rand = new Random();

    // Create a DiceAppConsole object
    DiceAppExcep diceApp = new DiceAppExcep(rand);

    // Run the user interface
    diceApp.run();
  }

}
