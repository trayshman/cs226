/**
* Unit tests for the ArrayVend class (focusing on methods completed for Lab on March 24).
*
* @author Christine Reilly
*/
public class ArrayVendTest {

  /**
  * Test that the vend method correctly vends product at index 0
  */
  public void testVendProd0() {
    System.out.println("\nStarting testVendProd0 method");
    BasicProduct[] products = new BasicProduct[5];
    products[0] = new BasicProduct("pencil", 0.56);
    products[1] = new BasicProduct("notebook", 3.45);
    products[2] = new BasicProduct("calculator", 15.87);
    products[3] = new BasicProduct("pen", 3.89);
    products[4] = new BasicProduct("ruler", 5.31);

    int[] quantities = {30, 8, 15, 45, 22};

    ArrayVend av = new ArrayVend(products, quantities);

    boolean ret = av.vend(new String("pencil"));

    try {
      assert (ret == true);
      assert(av.getQuant(0) == 29);
    } catch(AssertionError e) {
      e.printStackTrace();
      System.out.println(av);
    }
    System.out.println("Finished testVendProd0 method");
  } // end of testVendProd0 method

  /**
  * Test that the vend method correctly vends product at index 3
  */
  public void testVendProd3() {
    System.out.println("\nStarting testVendProd3 method");

    BasicProduct[] products = new BasicProduct[5];
    products[0] = new BasicProduct("pencil", 0.56);
    products[1] = new BasicProduct("notebook", 3.45);
    products[2] = new BasicProduct("calculator", 15.87);
    products[3] = new BasicProduct("pen", 3.89);
    products[4] = new BasicProduct("ruler", 5.31);

    int[] quantities = {30, 8, 15, 45, 22};

    ArrayVend av = new ArrayVend(products, quantities);

    boolean ret = av.vend(new String("pen"));

    try {
      assert (ret == true);
      assert(av.getQuant(3) == 44);
    } catch(AssertionError e) {
      e.printStackTrace();
      System.out.println(av);
    }
    System.out.println("Finished testVendProd3 method");
  } // end of testVendProd3 method

  /**
  * Test that the vend method correctly behaves when product quantity reaches 0
  */
  public void testVendAll() {
    System.out.println("\nStarting testVendAll method");
    BasicProduct[] products = new BasicProduct[5];
    products[0] = new BasicProduct("pencil", 0.56);
    products[1] = new BasicProduct("notebook", 3.45);
    products[2] = new BasicProduct("calculator", 15.87);
    products[3] = new BasicProduct("pen", 3.89);
    products[4] = new BasicProduct("ruler", 5.31);

    int[] quantities = {30, 2, 15, 45, 22};

    ArrayVend av = new ArrayVend(products, quantities);

    // Vend one notebook; new quantity should be 1
    boolean ret = av.vend(new String("notebook"));
    try {
      assert (ret == true);
      assert(av.getQuant(1) == 1);
    } catch(AssertionError e) {
      e.printStackTrace();
      System.out.println(av);
    }

    // Vend one notebook; new quantity should be 0
    ret = av.vend(new String("notebook"));
    try {
      assert (ret == true);
      assert(av.getQuant(1) == 0);
    } catch(AssertionError e) {
      e.printStackTrace();
      System.out.println(av);
    }

    // vend method should return false when no more of the product is available
    // quantity should remain 0
    ret = av.vend(new String("notebook"));
    try {
      assert (ret == false);
      assert(av.getQuant(1) == 0);
    } catch(AssertionError e) {
      e.printStackTrace();
      System.out.println(av);
    }
    System.out.println("Finished testVendAll method");
  } // end of testVendAll method


  /**
  * Test that the vend method correctly behaves when incorrect product name given.
  */
  public void testVendWrongProd() {
    System.out.println("\nStarting testVendWrongProd method");
    BasicProduct[] products = new BasicProduct[5];
    products[0] = new BasicProduct("pencil", 0.56);
    products[1] = new BasicProduct("notebook", 3.45);
    products[2] = new BasicProduct("calculator", 15.87);
    products[3] = new BasicProduct("pen", 3.89);
    products[4] = new BasicProduct("ruler", 5.31);

    int[] quantities = {30, 8, 15, 45, 22};

    ArrayVend av = new ArrayVend(products, quantities);

    boolean ret = av.vend("eraser");

    try {
      assert (ret == false);
      assert(av.getQuant(0) == 30);
      assert(av.getQuant(1) == 8);
      assert(av.getQuant(2) == 15);
      assert(av.getQuant(3) == 45);
      assert(av.getQuant(4) == 22);
    } catch(AssertionError e) {
      e.printStackTrace();
      System.out.println(av);
    }
    System.out.println("Finished testVendWrongProd method");
  } // end testVendWrongProd method


  /**
  * Test that the totalSalesPossible method returns a correct amount.
  */
  public void testTotalSalesPossible() {
    System.out.println("\nStarting testTotalSalesPossible method");

    BasicProduct[] products = new BasicProduct[5];
    products[0] = new BasicProduct("pencil", 0.56);
    products[1] = new BasicProduct("notebook", 3.45);
    products[2] = new BasicProduct("calculator", 15.87);
    products[3] = new BasicProduct("pen", 3.89);
    products[4] = new BasicProduct("ruler", 5.31);

    int[] quantities = {30, 8, 15, 45, 22};

    ArrayVend av = new ArrayVend(products, quantities);

    double correct = (0.56 * 30) + (3.45 * 8) + (15.87 * 15) + (3.89 * 45) + (5.31 * 22);

    try {
      assert(correct == av.totalSalesPossible());

    } catch(AssertionError e) {
      System.out.println();
      e.printStackTrace();
      System.out.println("Expected total sales = " + correct + "; actual total sales = " + av.totalSalesPossible());
    }
    System.out.println("Finished testTotalSalesPossible method");
  } // end of testTotalSalesPossible method

  public static void main(String[] args) {

    // Create a BasicVendTest object
    ArrayVendTest avt = new ArrayVendTest();

    // Call the methods to perform unit tests
    avt.testTotalSalesPossible();
    avt.testVendProd0();
    avt.testVendProd3();
    avt.testVendAll();
    avt.testVendWrongProd();

  } // end of main method

} // end of BasicVendTest class
