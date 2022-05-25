/**
* Represents a basic vending machine that contains two types of products.
*
* @author Christine Reilly
*/
public class BasicVend {

  /** The first product contained in this vending machine */
  private BasicProduct p1;

  /** The quantity of the first product available from this vending machine */
  private int quantP1;

  /** The second product contained in this vending machine */
  private BasicProduct p2;

  /** The quantity of the second product available from this vending machine */
  private int quantP2;

  /**
  * Creates a BasicVend object with two products.
  *
  * @param prod1 The first product contained in this vending machine.
  * @param q1 The quantity of the first product.
  * @param prod2 The second product contained in this vending machine.
  * @param q2 The quantity of the second product.
  */
  public BasicVend(BasicProduct prod1, int q1,  BasicProduct prod2, int q2) {
    this.p1 = prod1;
    this.quantP1 = q1;
    this.p2 = prod2;
    this.quantP2 = q2;
  }

  /**
  * Returns the first product contained in this vending machine.
  *
  * @return The first product contained in this vending machine.
  */
  public BasicProduct getProduct1() {
    return this.p1;
  }

  /**
  * Returns the quantity of the first product available from this vending machine.
  */
  public int getProduct1Quant() {
    return this.quantP1;
  }

  /**
  * Returns the second product contained in this vending machine.
  *
  * @return The second product contained in this vending machine.
  */
  public BasicProduct getProduct2() {
    return this.p2;
  }

  /**
  * Returns the quantity of the second product available from this vending machine.
  */
  public int getProduct2Quant() {
    return this.quantP2;
  }

  /**
  * Simulates the vending machine dispensing a product.
  *
  * @param name The name of the product to be dispensed.
  */
  public boolean vend(String name) {

    // Find the product to dispense
    // could have an error with string comparison.
    if(this.p1.getName().equals(name)) {
      // Vend Product 1
      if(this.quantP1 > 0) {
        this.quantP1--;
        return true;
      } else {
        return false;
      }

    } else if(this.p2.getName().equals(name)) {
      // Vend Product 2
      if(this.quantP2 > 0) {
        this.quantP2--;
        return true;
      } else {
        return false;
      }
    } else {
      // Name does not match a product in this vending machine
      return false;
    }
  } // end of vend method

  /**
  * Returns the total amount of sales possible from the current contents of
  * this vending machine.
  *
  * @return The total amount of sales possible from the current contents
  */
  public double totalSalesPossible() {

    // Correct code
     //double salesP1 = this.p1.getPrice() * this.quantP1;
     //double salesP2 = this.p2.getPrice() * this.quantP2;

    // Code with errors
    double salesP1 = this.p1.getPrice() + this.quantP1;
    double salesP2 = this.p2.getPrice() + this.quantP2;

    return salesP1 + salesP2;
  }

  /**
  * Returns a string representation of this vending machine.
  *
  * @return A string representation of this vending machine.
  */
  @Override
  public String toString() {
    String vend = "Product 1 (" + this.quantP1 + " items) -- " + this.p1.toString();
    vend += "\nProduct 2 (" + this.quantP2 + " items) -- " + this.p2.toString();
    return vend;
  }

  /**
  * Returns true if the other object has equal BasicProduct objects with the same quantities.
  *
  * @return true if the other object has equal BasicProduct objects with the same quantities.
  */
  @Override
  public boolean equals(Object o) {
    if(o == this) {
      // parameter is this object
      return true;

    } else if( !(o instanceof BasicVend) ) {
      // parameter is not a BasicVend object
      return false;

    } else {
      // Cast parameter to BasicVend
      BasicVend other = (BasicVend)o;

      // Compare the BasicProduct objects
      // Allow products to be in swapped order

      // Correct comparision uses the BasicProduct equals method
      // if(this.getProduct1().equals(other.getProduct1()) && this.getProduct2().equals(other.getProduct2())) {

      // Incorrect comparision uses == to compare objects
      if(this.getProduct1() == other.getProduct1() && this.getProduct2() == other.getProduct2()) {
        // Both BasicVend objects have the same products, check the quantities
        if(this.getProduct1Quant() == other.getProduct1Quant() && this.getProduct2Quant() == other.getProduct2Quant()) {
          // both objects have same quantities
          return true;
        } else {
          // Objects have different quantities of the products
          return false;
        }
      } // end of if products same and in same order

      // Correct comparision uses the BasicProduct equals method
      // else if(this.getProduct1().equals(other.getProduct2()) && this.getProduct2().equals(other.getProduct1())) {

      // Incorrect comparision uses == to compare objects
      else if(this.getProduct1() == other.getProduct2() && this.getProduct2() == other.getProduct1()) {
        // Both BasicVend objects have the same products but in swapped order, check the quantities
        if(this.getProduct1Quant() == other.getProduct2Quant() && this.getProduct2Quant() == other.getProduct1Quant()) {
          // both objects have same quantities
          return true;
        } else {
          // Objects have different quantities of the products
          return false;
        }
      } // end of else if products same in swapped order
      else {
        // Products are not same
        return false;
      }
    } // end of else objects are same type

  } // end of equals method

} // end of BasicVend class
