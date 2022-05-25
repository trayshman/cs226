/**
* Represents a box.
*
* @author Christine Reilly
*/
public class Box extends Shape implements Shape3d {

  /** The base of this box */
  private Rectangle base;

  /** The height of this box */
  private int height;

  /**
  * Constructs a Box object.
  *
  * @param l The length of the base of this box.
  * @param w The width of the base of this box.
  * @param h The height of this box.
  */
  public Box(int l, int w, int h) {
    this.base = new Rectangle(l, w);
    this.height = h;
  }

  /**
  * Returns the length of the base of this box.
  *
  * @return The length of the base of this box.
  */
  public int getLength() {
    return this.base.getLength();
  }

  /**
  * Returns the width of the base of this box.
  *
  * @return The width of the base of this box.
  */
  public int getWidth() {
    return this.base.getWidth();
  }

  /**
  * Returns the height of this box.
  *
  * @return The height of this box.
  */
  public int getHeight() {
    return this.height;
  }

  /**
  * Sets the length of the base of this box.
  *
  * @param l The length of the base of this box.
  */
  public void setLength(int l) {
    this.base.setLength(l);
  }

  /**
  * Sets the width of the base of this box.
  *
  * @param w The width of the base of this box.
  */
  public void setWidth(int w) {
    this.base.setWidth(w);
  }

  /**
  * Sets the height of this box.
  *
  * @param h The height of this box.
  */
  public void setHeight(int h) {
    this.height = h;
  }

  /**
  * Calculates the surface area of this box.
  *
  * @return The surface area of this box.
  */
  public double surfaceArea() {
    int sideArea1 = this.height * this.base.getLength();
    int sideArea2 = this.height * this.base.getWidth();
    return (2 * this.base.area()) + (2 * sideArea1) + (2 * sideArea2);
  }

  /**
  * Calculates the volume of this box.
  *
  * @return The volume of this box.
  */
  public double volume() {
    return this.base.area() * this.height;
  }

  /**
  * Returns a description of this box.
  *
  * @return A description of this box.
  */
  @Override
  public String toString() {
    return "Box: color = " + super.color + "; length = " + this.base.getLength()
            + "; width = " + this.base.getWidth() + "; height = " + this.height;
  }

} // end of Box class
