import java.util.Random; // Import the Random class from the java.util package

/**
* An n-sided die with integer values 1 through n. The integer values are
* returned via nextRoll() with uniform probability.
*
* Version 3 of the Die class is DieV2 with toString and equals methods added.
*
* @author Christine Reilly
*/

public class DieV3 {

  /** Number of sides of this die */
  private int sides;

  /** The Random object for generating random numbers */
  private Random rand;

  /**
  * Default constructor creates a Die instance with 6 sides and a new Random object.
  */
  public DieV3() {

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
  public DieV3(int numSides, Random r) {

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

  /**
  * Returns a string representation of this Die object.
  * Overrides the toString method inherited from Object.
  *
  * @return A string representation of this Die object.
  */
  @Override
  public String toString() {
    return "A die with " + this.sides + " sides";
  }

  /**
  * Returns true if the parameter is a Die object and has the same number of
  * sides as this object.
  *
  * @param The object to compare this object with.
  * @return True if the parameter is a Die object and has the same number of
  * sides as this object.
  */
  @Override
  public boolean equals(Object other) {
    if(other == this) {
      // other refers to this object (they are the same object in memory)
      return true;

    } else if( !(other instanceof DieV3) ) {
      // parameter is not a DieV3 object
      return false;

    } else {
      // other is a DieV3 object
      // Cast other to DieV3
      DieV3 otherDie = (DieV3)other;

      // Compare the sides of this and otherDie
      if(this.getSides() == otherDie.getSides()) {
        // The DieV3 objects are equal
        return true;
      } else {
        // The DieV3 objects are not equal
        return false;
      }
    }
  }
}
