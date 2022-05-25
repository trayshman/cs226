/**
* Represents a product that is stocked in a warehouse, store, or other sales location.
*
* @author Christine Reilly
*/
public class BasicProduct {

  /** The name of this product */
  private String name;

  /** The price one item of this product sells for */
  private double price;

  /**
  * Constructor creates a BasicProduct object.
  *
  * @param n The name of this product.
  * @param p The price this product sells for.
  */
  public BasicProduct(String n, double p) {
    this.name = n;
    this.price = p;
  }

  /**
  * Sets the name of this product.
  *
  * @param n The name of this product.
  */
  public void setName(String n) {
    this.name = n;
  }

  /**
  * Sets the price of this product.
  *
  * @param p The price of this product.
  */
  public void setPrice(double p) {
    this.price = p;
  }

  /**
  * Returns the name of this product.
  *
  * @return The name of this product
  */
  public String getName() {
    return this.name;
  }

  /**
  * Returns the price of this product.
  *
  * @return The price of this product
  */
  public double getPrice() {
    return this.price;
  }

  /**
  * Returns a string representation of this product.
  *
  * @return A string representation of this product.
  */
  @Override
  public String toString() {
    return "Name: " + this.name + "; Price: $" + this.price;
  }

  /**
  * Returns true if the other object has the same name and price as this object.
  *
  * @return true if the other object has the same name and price as this object.
  */
  @Override
  public boolean equals(Object o) {
    if(o == this) {
      // parameter is this object
      return true;

    } else if( !(o instanceof BasicProduct) ) {
      // parameter is not a BasicProduct object
      return false;

    } else {
      // Cast parameter to BasicProduct
      BasicProduct other = (BasicProduct)o;

      // Compare the name and price of this and other
      if(this.getName() == other.getName() && this.getPrice() == other.getPrice()) {
        // The BasicProduct objects are equal
        return true;
      } else {
        // The BasicProduct objects are not equal
        return false;
      }
    }
  } // end of equals method

} // end of Product class
