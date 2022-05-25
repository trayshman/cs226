/**
* Represents an item you own.
*
* CS226 Independent Assignment 4: Student should not alter this class.
*
* @author Christine Reilly
*/
public abstract class PropertyItem {

  /** The name of this item */
  protected String name;

  /** The value of this item in dollars */
  protected double value;

  /**
  * Returns the name of this PropertyItem object.
  *
  * @return The name of this PropertyItem object.
  */
  public String getName() {
    return this.name;
  }

  /**
  * Returns the value of this PropertyItem object.
  *
  * @return The value of this PropertyItem object.
  */
  public double getValue() {
    return this.value;
  }

  /**
  * Sets the name of this PropertyItem object.
  *
  * @param n The name of this PropertyItem object.
  */
  public void setName(String n) {
    this.name = n;
  }

  /**
  * Sets the value of this PropertyItem object.
  *
  * @param v The value of this PropertyItem object.
  */
  public void setValue(double v) {
    this.value = v;
  }
}
