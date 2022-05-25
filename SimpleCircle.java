/**
* EXAM 2: DO NOT ALTER THIS CLASS
* Represents a circle.
*
* @author Christine Reilly
*/
public class SimpleCircle {

  /** The color of this circle */
  private String color;

  /** The radius of this circle */
  private int radius;

  /**
  * Constructs a SimpleCircle object.
  *
  * @param r The radius of this circle.
  * @param c The color of this circle.
  */
  public SimpleCircle(String c, int r) {
    this.color = c;
    this.radius = r;
  }

  /**
  * Sets the color of this circle to the parameter value.
  *
  * @param c The color of this circle
  */
  public void setColor(String c) {
    this.color = c;
  }

  /**
  * Returns the color of this circle.
  *
  * @return The color of this circle
  */
  public String getColor() {
    return this.color;
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
  * EXAM 2: THIS METHOD CONTAINS ERRORS
  * Calculates the area of this circle.
  *
  * @return The area of this circle.
  */
  public double area() {
    // Area of a circle is PI x r^2
    return Math.PI + this.radius + this.radius; // should be Math.Pi*(this.radius*this.radius)
  }

  /**
  * Returns a description of this Circle.
  *
  * @return A description of this Circle.
  */
  @Override
  public String toString() {
    return "Circle: color = " + this.color + "; radius = " + this.radius;
  }

  /**
  * EXAM 2: THIS METHOD CONTAINS ERRORS
  * Returns true if the other object is a SimpleCircle and has the same color and radius.
  *
  * @param o The object to compare this object with
  * @return true if the other object is a SimpleCircle and has the same color and radius.
  */
  @Override
  public boolean equals(Object o) {
    // o refers to this object (they are the same object in memory)
    if(o == this) {
      return true;

    } else if( !(o instanceof SimpleCircle) ) {
      return true; //error. should return false

    } else {
      // o is a SimpleCircle object
      // Cast o to SimpleCircle
      SimpleCircle other = (SimpleCircle)o;

      // Compare the colors and radiuses of this and other
      if(this.getColor() == other.getColor() && this.getRadius() == other.getRadius()) {
        return true; // they are equal
      } else {
        return false; // they aren't equal
      }

    } // end of else objects are same type

  } // end of equals method

} // end of SimpleCircle class
