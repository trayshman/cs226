import java.util.Random;

/**
* Represents a geometric shape.
*
* @author Christine Reilly
*/
public abstract class ShapeFile {

  // protected access: sub-classes can use this instance variable

  /** The color of this shape */
  protected String color;

  /**
  * Constructs a Shape object; randomly sets its color.
  */
  public ShapeFile() {
    setColor();
  }

  /**
  * Constructs a Shape object; sets its color to the parameter value.
  *
  * @param c The color of this Shape object
  */
  public ShapeFile(String c) {
    setColor(c);
  }

  /**
  * Sets the color of this shape to a randomly chosen color.
  */
  public void setColor() {
    Random r = new Random();

    int randNum = r.nextInt(6);

    switch(randNum) {
      case 0:
        this.color = "red";
        break;
      case 1:
        this.color = "orange";
        break;
      case 2:
        this.color = "yellow";
        break;
      case 3:
        this.color = "green";
        break;
      case 4:
        this.color = "blue";
      case 5:
        this.color = "purple";
    }
  } // end of setColor class

  /**
  * Sets the color of this shape to the parameter value.
  *
  * @param c The color of this Shape object
  */
  public void setColor(String c) {
    this.color = c;
  }

  /**
  * Returns the color of this shape.
  *
  * @return The color of this shape
  */
  public String getColor() {
    return this.color;
  }

}
