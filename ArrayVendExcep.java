/**
* Represents a vending machine using an array to store the product information.
*
* @author Christine Reilly
*/
import java.util.Arrays;

public class ArrayVendExcep {

  /** The products contained in this vending machine */
  private BasicProduct[] prod;

  /** The quantity of each product available from this vending machine */
  private int[] quant;

  /**
  * Creates am ArrayVend object. Saves a copy of each array (a deep copy of the
  * array of BasicProduct objects) to the instance variables. By making a copy
  * of the arrays the constructor ensures the arrays and objects will not be
  * altered outside of this class.
  *
  * @param p The products contained in this vending machine.
  * @param q The quantity of each product.
  */
  public ArrayVendExcep(BasicProduct[] p, int[] q) throws ArrayLengthDifferentException {

    // If the parameter arrays have different lengths, throw a
    // ArrayLengthDifferentException
    if(p.length != q.length) {
      throw new ArrayLengthDifferentException(p.length, q.length);
    }

    // Create a deep copy of the array of BasicProduct objects.
    // A deep copy creates a copy of the array and a copy of each object in the array.
    this.prod = new BasicProduct[p.length];
    for(int i = 0; i < p.length; i++) {
      BasicProduct newP = new BasicProduct(p[i].getName(), p[i].getPrice());
      this.prod[i] = newP;
    }

    // Create a copy of the array of quantity of products
    // Because the quantity array contains a primitive type, we use the copyOf
    // method from the Arrays class.
    quant = Arrays.copyOf(q, q.length);
  }

  /**
  * Returns the ith product contained in this vending machine.
  *
  * @param i The index of the product
  * @return The ith product contained in this vending machine
  */
  public BasicProduct getProduct(int i) {
    return this.prod[i];
  }

  /**
  * Returns the quantity of the ith product available from this vending machine.
  *
  * @param i The index of the product (and its quantity)
  * @return The quantity of the ith product contained in this vending machine
  */
  public int getQuant(int i) {
    return this.quant[i];
  }

  /**
  * LAB 3/24: WRITE THIS METHOD
  *
  * Returns the total amount of sales possible from the current contents of
  * this vending machine.
  *
  * @return The total amount of sales possible from the current contents
  */
  public double totalSalesPossible() {

    double total = 0;

    for(int i = 0; i < this.prod.length; i++) {
      total += this.prod[i].getPrice() * this.quant[i];
    }

    return total;
  }

  /**
  * LAB 3/24: WRITE THIS METHOD
  *
  * Simulates the vending machine dispensing a product.
  *
  * @param name The name of the product to be dispensed.
  */
  public boolean vend(String name) {

    int index = -1; // The index of the product to be dispensed

    // Traverse the prod array to find the product to dispense
    // When the product is found, set the index variable to the array index
    // of the desired product.
    for(int i = 0; i < this.prod.length; i++) {
      if(this.prod[i].getName().equals(name)) {
        index = i;
      }
    }

    // If there is no product with the specified name name, return false
    if(index == -1) {
      return false;
    }

    // Simulate vending the product by reducing the quanttity of the product
    // Ensure the quantity is greater than zero before vending
    if(this.quant[index] > 0) {
      this.quant[index]--;
      return true;
    } else {
      // None of the product is available
      return false;
    }
  } // end of vend method

  /**
  * Returns a string representation of this vending machine.
  *
  * @return A string representation of this vending machine.
  */
  @Override
  public String toString() {
    String vend = ""; // initialize to empty string

    for(int i = 0; i < this.prod.length; i++) {
      vend += this.prod[i].getName() + " $" + this.prod[i].getPrice() + " ("
              + this.quant[i] + " available);\n";
    }

    return vend;
  }

} // end of ArrayVend class
