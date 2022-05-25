/**
* Test program for the ArrayVendExcep class
*
* @author Christine Reilly
*/
public class VendExcepTest {

  // Only using main method for quick test
  public static void main(String[] args) throws ArrayLengthDifferentException {

    BasicProduct[] products = new BasicProduct[5];
    products[0] = new BasicProduct("pencil", 0.56);
    products[1] = new BasicProduct("notebook", 3.45);
    products[2] = new BasicProduct("calculator", 15.87);
    products[3] = new BasicProduct("pen", 3.89);
    products[4] = new BasicProduct("ruler", 5.31);

    int[] quant1 = {30, 8, 15, 45, 22};
    int[] quant2 = {30, 8, 15, 45, 22, 33};

    // Test 1: create correct vending machine with equal size arrays
    // This test should not trigger any exceptions
    ArrayVendExcep av1 = new ArrayVendExcep(products, quant1);

    // Test 2: create incorrect vending machine with different size arrays
    // This test should cause an ArrayLengthDifferentException
    // This method throws the ArrayLengthDifferentException and allows the program
    // to crash when the exception occurs
    ArrayVendExcep av2 = new ArrayVendExcep(products, quant2);

  }
}
