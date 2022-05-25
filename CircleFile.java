import java.util.Scanner;

/**
* Represents a circle.
*
* @author Christine Reilly
*/
public class CircleFile extends ShapeFile implements Shape2d {

  /** The radius of this circle */
  private int radius;

  /**
  * Constructs a circle object.
  *
  * @param r The radius of this circle.
  */
  public CircleFile(int r) {
    this.radius = r;
  }

  /**
  * Constructs a circle object.
  *
  * @param r The radius of this circle.
  * @param c The color of this circle.
  */
  public CircleFile(int r, String c) {
    super(c); // call ShapeFile constructor to set color
    this.radius = r;
  }

  /**
  * Constructs a circle object.
  *
  * @param s The string containing circle data. Color is second token, radius is third token
  */
  public CircleFile(String s) {
    Scanner tokens = new Scanner(s);

    // Ignore the first token
    tokens.next();

    // Set color of this Circle object
    super.setColor(tokens.next());

    // Set radius of this Circle object
    this.radius = tokens.nextInt();
  }

  /**
  * Sets the radius of this circle.
  *
  * @param r The radius of this circle.
  */
  public void setRadius(int r) {
    this.radius = r;
  }

  /**
  * Returns the radius of this circle.
  *
  * @return The radius of this circle.
  */
  public int getRadius() {
    return this.radius;
  }

  /**
  * Calculates the perimiter (circumference) of this circle.
  *
  * @return The perimiter (circumference) of this circle.
  */
  public double perimeter() {
    // Perimiter of a circle is 2 x r x PI
    return 2 * radius * Math.PI;
  }

  /**
  * Calculates the area of this circle.
  *
  * @return The area of this circle.
  */
  public double area() {
    // Area of a circle is PI x r^2
    return Math.PI * radius * radius;
  }

  /**
  * Returns a description of this Circle.
  *
  * @return A description of this Circle.
  */
  @Override
  public String toString() {
    return super.color + " " + this.radius;
  }

} // end of Circle class
