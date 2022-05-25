/**
* Represents a product that is stocked in a warehouse, store, or other sales location.
* This is an enhanced version of the BasicProduct class that implements the
* Comparable interface.
*
* @author Christine Reilly
*/
public class CompProduct implements Comparable<CompProduct> {

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
  public CompProduct(String n, double p) {
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

    } else if( !(o instanceof CompProduct) ) {
      // parameter is not a BasicProduct object
      return false;

    } else {
      // Cast parameter to BasicProduct
      CompProduct other = (CompProduct)o;

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

  /**
  * Compares this CompProduct object with another CompProduct object. The instance
  * variables in this object are compared in the following order: name, price.
  * Because name is an object (String), we use that object's compareTo method
  * when comparing the two names.
  *
  * @param otherProd The other CompProduct object
  * @return A negative integer if this object is less than the parameter
  * object; A positive integer if this object is greater than the parameter
  * object; zero if this object is equal to the parameter object.
  */
  @Override
  public int compareTo(CompProduct otherProd) {
    // If the name instance variables are not equal, return the String compareTo
    // value
    if(this.name.compareTo(otherProd.getName()) != 0) { //0 means objects are equal
        return name.compareTo(otherProd.getName());
    }

    // If we reach this point, the names are equal

    // Next compare the price data members. Because price is a primitive type
    // use the ==, <, > operators for comparison
    if(this.price < otherProd.getPrice()) {
      // this object is less than the parameter object
      return -1; //-1 means less than the parameter object
    } else if(this.price > otherProd.getPrice()) {
      // this object is greater than the parameter object
      return 1; //1 means greater than the parameter object
    } else {
      // objects are equal
      return 0;
    }
  } // end of compareTo method

} // end of CompProduct class
