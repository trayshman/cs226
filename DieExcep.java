import java.util.Random; // Import the Random class from the java.util package

/**
* An n-sided die with integer values 1 through n. The integer values are
* returned via nextRoll() with uniform probability.
*
* @author Christine Reilly
*/

public class DieExcep {

  /** Number of sides of this die */
  private int sides;

  /** The Random object for generating random numbers */
  private Random rand;


  /**
  * Creates a new Die instance with the specified number of sides.
  *
  * @param numSides The number of sides for this Die.
  * @param r The Random object to be used by this Die.
  */
  public DieExcep(int numSides, Random r) {

    // Call the setSides method
    this.setSides(numSides);

    // Set this Die's Random object to refer to the r parameter object
    this.rand = r;

  }

  /**
  * Sets the sides instance variable.
  *
  * @param numSides The number of sides for this Die.
  * @throws IllegalArgumentException if numSides is less than 1
  */
  private void setSides(int numSides) {
    if(numSides < 1) {
      throw new IllegalArgumentException("number of sides must be greater than zero, numSides: " + numSides); //throws an exception that DiceApp will catch
    }

    // If the code reaches this point, numSides must be greater than 0
    this.sides = numSides;
  }


  /**
  * Returns one of the die values at random.
  *
  * @return The die value rolled.
  */
  public int roll() {
    return rand.nextInt(sides) + 1;
  }

}
