import java.util.Random; // Import the Random class from the java.util package
import java.util.Scanner; // Import the Scanner class for user input

/**
* Program that tests the Die class.
*
* Build command: javac Die.java TestDie.java
* Run command: java TestDie
*
* @author Christine Reilly
*/
public class TestDieV2 {
  public static void main(String[] args) {
    int myRoll;
    int numRolls = 10;
    int i; // a counter variable

    Random rand = new Random(); // Create a Random object for this program

    // Create a Die object with default constructor, then roll it a few times.
    DieV2 d = new DieV2();

    // Use while loop to roll the die numRolls times
    i = 0; // initialize loop control variable
    while(i < numRolls) { // loop condition
      myRoll = d.roll();
      System.out.println("Rolled " + d.getSides() + "-sided die: " + myRoll);

      i += 1; // update the loop control variable
    }

    System.out.println(); // Print a blank line

    // Create a Die object with 20 sides, then roll it until a specific number is rolled.
    DieV2 d20 = new DieV2(20, rand);

    // Initialize loop control variables.
    int specNum = 15; // Keep rolling until we roll this number
    myRoll = -1; // Initialize myRoll to a value that ensures loop body will execute at least once.

    while(myRoll != specNum) { // loop condition
      myRoll = d20.roll(); // update the loop control variable
      System.out.println("Rolled 20-sided die: " + myRoll);
    }

  }
}
