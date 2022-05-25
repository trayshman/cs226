import java.util.Random; // Import the Random class from the java.util package

/**
* An n-sided die with integer values 1 through n. The integer values are
* returned via nextRoll() with uniform probability.
*
* @author Christine Reilly
*/

public class DieV2 {

  /** Number of sides of this die */
  private int sides;

  /** The Random object for generating random numbers */
  private Random rand;

  /**
  * Default constructor creates a Die instance with 6 sides and a new Random object.
  */
  public DieV2() {

    // Create a new random object
    Random r = new Random();

    // Initialize the instance variables
    sides = 6;
    rand = r;

    //NOTE: The preferred style for initializing the instance variables is
    // to call a parameterized constructor, for example: this(6, r).
    // But Java requires the call to the other constructor to be the first
    // line of this constructor. Because we need to create a Random object,
    // we cannot call the parameterized constructor in the first line. So this
    // default constructor directly initializes the instance variables.

  }

  /**
  * Creates a new Die instance with the specified number of sides.
  *
  * @param sides The number of sides for this Die.
  * @param r The Random object to be used by this Die.
  */
  public DieV2(int numSides, Random r) {

    // Validate that numSides is a reasonable value (greater than zero).
    if(numSides <= 0) {
      System.out.println("Attempt to create Die with non-valid number of sides: " + numSides);
      System.out.println("Setting number of sides to 6");
      numSides = 6;
    }

    // Set the value of the numSides instance variable to the sides parameter
    this.sides = numSides;

    // Set this Die's Random object to refer to the r parameter object
    this.rand = r;

  }

  /**
  * Returns one of the die values at random.
  *
  * @return The die value rolled.
  */
  public int roll() {
    return this.rand.nextInt(sides) + 1;
  }

  /**
  * Returns the number of sides of this Die object.
  *
  * @return The number of sides of this Die object.
  */
  public int getSides() {
    return this.sides;
  }

}
