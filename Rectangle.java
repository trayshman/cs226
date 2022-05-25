/**
* Represents a rectangle.
*
* @author Christine Reilly
*/
public class Rectangle extends Shape implements Shape2d {

  /** The length of this rectangle */
  private int length;

  /** The width of this rectangle */
  private int width;

  /**
  * Constructs a rectangle object.
  *
  * @param l The length of this rectangle.
  * @param w The width of this rectangle.
  */
  public Rectangle(int l, int w) {
    this.length = l;
    this.width = w;
  }

  /**
  * Returns the length of this rectangle.
  *
  * @return The length of this rectangle.
  */
  public int getLength() {
    return this.length;
  }

  /**
  * Returns the width of this rectangle.
  *
  * @return The width of this rectangle.
  */
  public int getWidth() {
    return this.width;
  }

  /**
  * Sets the length of this rectangle.
  *
  * @param l The length of this rectangle.
  */
  public void setLength(int l) {
    this.length = l;
  }

  /**
  * Sets the width of this rectangle.
  *
  * @param w The width of this rectangle.
  */
  public void setWidth(int w) {
    this.width = w;
  }

  /**
  * Calculates the perimiter of this rectangle.
  *
  * @return The perimiter of this rectangle.
  */
  public double perimeter() {
    return (this.width * 2) + (this.length * 2);
  }

  /**
  * Calculates the area of this rectangle.
  *
  * @return The area of this rectangle.
  */
  public double area() {
    return this.width * this.length;
  }

  /**
  * Returns a description of this Rectangle.
  *
  * @return A description of this Rectangle.
  */
  @Override
  public String toString() {
    return "Rectangle: color = " + super.color + "; length = " + this.length + "; width = " + this.width;
  }


} // end of Rectangle class
