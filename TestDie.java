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
public class TestDie {
  public static void main(String[] args) {
    int myRoll;

    Random rand = new Random(); // Create a Random object for this program

    // Create a Die object with 6 sides, then roll it a few times.
    Die d6 = new Die(6, rand);

    myRoll = d6.roll();
    System.out.println("Rolled 6-sided die: " + myRoll);

    myRoll = d6.roll();
    System.out.println("Rolled 6-sided die: " + myRoll);

    myRoll = d6.roll();
    System.out.println("Rolled 6-sided die: " + myRoll);

    System.out.println(); // Print a blank line

    // Create a Die object with 20 sides, then roll it a few times.
    Die d20 = new Die(20, rand);

    myRoll = d20.roll();
    System.out.println("Rolled 20-sided die: " + myRoll);

    myRoll = d20.roll();
    System.out.println("Rolled 20-sided die: " + myRoll);

    myRoll = d20.roll();
    System.out.println("Rolled 20-sided die: " + myRoll);

    System.out.println(); // Print a blank line

    // Get user input for the number of sides.

    // Create a Scanner object that reads from the System.in object.
    // System.in is keyboard input.
    Scanner keyIn = new Scanner(System.in);

    // Print a prompt to tell the user what input is expected.
    System.out.print("Enter an integer for number of sides of the die: ");

    // Read an integer from keyboard input.
    int userSides = keyIn.nextInt();

    // Create a Die with the user specifed number of sides, then roll it a few times.
    Die userDie = new Die(userSides, rand);

    myRoll = userDie.roll();
    System.out.println("Rolled " + userSides + "-sided die: " + myRoll);

    myRoll = userDie.roll();
    System.out.println("Rolled " + userSides + "-sided die: " + myRoll);

    myRoll = userDie.roll();
    System.out.println("Rolled " + userSides + "-sided die: " + myRoll);

  }
}
