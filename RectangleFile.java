import java.util.Scanner;

/**
* Represents a rectangle.
*
* @author Christine Reilly
*/
public class RectangleFile extends ShapeFile implements Shape2d {

  /** The length of this rectangle */
  private int length;

  /** The width of this rectangle */
  private int width;

  /**
  * Constructs a rectangle object with a random color.
  *
  * @param l The length of this rectangle.
  * @param w The width of this rectangle.
  */
  public RectangleFile(int l, int w) {
    this.length = l;
    this.width = w;
  }

  /**
  * Constructs a rectangle object.
  *
  * @param l The length of this rectangle.
  * @param w The width of this rectangle.
  * @param c The color of this rectangle.
  */
  public RectangleFile(int l, int w, String c) {
    super(c); // call ShapeFile constructor to set color
    this.length = l;
    this.width = w;
  }

  /**
  * Constructs a rectangle object.
  *
  * @param s The string containing rectangle data. Color is second token, length is third token, width is fourth token
  */
  public RectangleFile(String s) {
    Scanner tokens = new Scanner(s);

    // Ignore the first token
    tokens.next();

    // Set color of this Rectangle object
    super.setColor(tokens.next());

    // Set length and width of this Rectangle object
    this.length = tokens.nextInt();
    this.width = tokens.nextInt();
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
    return super.color + " " + this.length + " " + this.width;
  }

} // end of Rectangle class
