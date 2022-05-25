/**
* Represents a circle.
*
* @author Christine Reilly
*/
public class Circle extends Shape implements Shape2d {

  /** The radius of this circle */
  private int radius;

  /**
  * Constructs a Circle object.
  *
  * @param r The radius of this circle.
  */
  public Circle(int r) {
    this.radius = r;
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
    return "Circle: color = " + super.color + "; radius = " + this.radius;
  }

} // end of Circle class
