/**
* Represents a cylinder.
*
* @author Christine Reilly
*/
public class Cylinder extends Shape implements Shape3d {

  /** The base of this cylinder */
  private Circle base;

  /** The height of this cylinder */
  private int height;

  /**
  * Constructs a Cylinder object.
  *
  * @param r The radius of the base of this cylinder.
  * @param h The height of this cylinder.
  */
  public Cylinder(int r, int h) {
    this.base = new Circle(r);
    this.height = h;
  }

  /**
  * Returns the radius of the base of this cylinder.
  *
  * @return The radius of the base of this cylinder.
  */
  public int getRadius() {
    return this.base.getRadius();
  }

  /**
  * Returns the height of this cylinder.
  *
  * @return The height of this cylinder.
  */
  public int getHeight() {
    return this.height;
  }

  /**
  * Sets the radius of the base of this cylinder.
  *
  * @param r The radius of the base of this cylinder.
  */
  public void setRadius(int r) {
    this.base.setRadius(r);
  }

  /**
  * Sets the height of this cylinder.
  *
  * @param h The height of this cylinder.
  */
  public void setHeight(int h) {
    this.height = h;
  }

  /**
  * Calculates the surface area of this cylinder.
  *
  * @return The surface area of this cylinder.
  */
  public double surfaceArea() {
    double sideArea = this.base.perimeter() * this.height;
    return (2 * this.base.area()) + sideArea;
  }

  /**
  * Calculates the volume of this cylinder.
  *
  * @return The volume of this cylinder.
  */
  public double volume() {
    return this.base.area() * this.height;
  }

  /**
  * Returns a description of this cylinder.
  *
  * @return A description of this cylinder.
  */
  @Override
  public String toString() {
    return "Cylinder: color = " + super.color + "; radius = " + this.base.getRadius()
            + "; height = " + this.height;
  }

} // end of Box class
