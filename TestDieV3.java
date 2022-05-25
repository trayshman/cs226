import java.util.Random; // Import the Random class from the java.util package
import java.util.Scanner; // Import the Scanner class for user input

/**
* Program that tests the DieV3 class (toString and equals methods).
*
* Build command: javac Die.java TestDie.java
* Run command: java TestDie
*
* @author Christine Reilly
*/
public class TestDieV3 {
  public static void main(String[] args) {

    Random rand = new Random(); // Create a Random object for this program

    // Create three DieV3 objects
    DieV3 d1 = new DieV3(6, rand);
    DieV3 d2 = new DieV3(6, rand);
    DieV3 d3 = new DieV3(20, rand);

    // Demonstrate the toString method
    System.out.println("d1: " + d1.toString());
    

    // The toString method is automatically called when a string representation
    // of the object is needed
    System.out.println("d3: " + d3);

    // Print an empty line
    System.out.println();

    // Demonstrate the equals method
    System.out.println("d1 is equal to d2: " + d1.equals(d2));
    System.out.println("d1 == d2: " + (d1 == d2));
    System.out.println("d1 is equal to d3: " + d1.equals(d3));
    System.out.println("d2 is equal to rand: " + d2.equals(rand));


  }

}
