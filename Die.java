import java.util.Random; // Import the Random class from the java.util package

/**
* An n-sided die with integer values 1 through n. The integer values are
* returned via nextRoll() with uniform probability.
*
* @author Christine Reilly
*/

public class Die {

  /** Number of sides of this die */
  private int sides;

  /** The Random object for generating random numbers */
  private Random rand;


  /**
  * Creates a new Die instance with the specified number of sides.
  *
  * @param sides The number of sides for this Die.
  * @param r The Random object to be used by this Die.
  */
  public Die(int numSides, Random r) {

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
    return rand.nextInt(this.sides) + 1;
  }

}
