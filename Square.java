/**
* Represents a square.
*
* @author Christine Reilly
*/
public class Square extends Rectangle {

  /**
  * Constructs a Square object.
  *
  * @param side The length of one side of this square
  */
  public Square(int side) {
    // Call the superclass (Rectangle) constructor
    super(side, side); // A square is a rectangle where length == width
  }

  /**
  * Returns the length of a side of this square.
  *
  * @return The length of a side of this square.
  */
  public int getSide() {
    return super.getLength();
  }

  /**
  * Sets the length of a side of this square.
  *
  * @param s The length of a side of this square.
  */
  public void setSide(int s) {
    super.setLength(s);
    super.setWidth(s);
  }


  /**
  * Returns a description of this Square.
  *
  * @return A description of this Square.
  */
  @Override
  public String toString() {
    return "Square: color = " + super.color + "; side = " + super.getLength();
  }

} // end of Square class
