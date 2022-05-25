/**
* Unit tests for the BasicVend class.
*
* @author Christine Reilly
* @author <ENTER YOUR NAME>
*/
public class BasicVendTest {

  /**
  * The accessor methods should return the values set by the constructor.
  */
  public void testAccessors() {
    BasicProduct p1 = new BasicProduct("pencil", 0.65);
    BasicProduct p2 = new BasicProduct("notebook", 3.78);
    BasicVend bv = new BasicVend(p1, 123, p2, 456);

    try {
      assert(bv.getProduct1() == p1);
      assert(bv.getProduct1Quant() == 123);
      assert(bv.getProduct2() == p2);
      assert(bv.getProduct2Quant() == 456);

    } catch(AssertionError e) {
      e.printStackTrace();
      System.out.println(bv);
    }
  } // end testAccessors method

  /**
  * Test that the vend method correctly vends product 1
  */
  public void testVendProd1() {
    BasicProduct p1 = new BasicProduct("pencil", 0.65);
    BasicProduct p2 = new BasicProduct("notebook", 3.78);
    BasicVend bv = new BasicVend(p1, 123, p2, 456);

    boolean ret = bv.vend(new String("pencil"));

    try {
      assert (ret == true);
      assert(bv.getProduct1() == p1);
      assert(bv.getProduct1Quant() == 122);
      assert(bv.getProduct2() == p2);
      assert(bv.getProduct2Quant() == 456);

    } catch(AssertionError e) {
      e.printStackTrace();
      System.out.println(bv);
    }
  } // end testVendProd1 method

    /**
    * Test that the vend method correctly vends product 2
    */
    public void testVendProd2() {
      BasicProduct p1 = new BasicProduct("pencil", 0.65);
      BasicProduct p2 = new BasicProduct("notebook", 3.78);
      BasicVend bv = new BasicVend(p1, 123, p2, 456);

      boolean ret = bv.vend("notebook");

      try {
        assert (ret == true);
        assert(bv.getProduct1() == p1);
        assert(bv.getProduct1Quant() == 123);
        assert(bv.getProduct2() == p2);
        assert(bv.getProduct2Quant() == 455);

      } catch(AssertionError e) {
        e.printStackTrace();
        System.out.println(bv);
      }
  } // end testVendProd2 method

  /**
  * Test that the vend method correctly behaves when incorrect product name given.
  */
  public void testVendWrongProd() {

    /*try{
      assert (bv.getName().equals(name));
    } catch(AssertionError y) {
      y.printStackTrace();
      System.out.println(bv);
    }*/

  } // end testVendWrongProd method

  /**
  * Test that the totalSalesPossible method returns a correct amount.
  */
  public void testTotalSalesPossible() {

    BasicProduct p1 = new BasicProduct("pencil", 0.65);
    BasicProduct p2 = new BasicProduct("notebook", 3.78);
    BasicVend bv = new BasicVend(p1, 123, p2, 456);

    try{
      assert(bv.totalSalesPossible() == (p1.getPrice()*bv.getProduct1Quant())+(p2.getPrice()*bv.getProduct2Quant()));
    }
    catch(AssertionError y) {
      y.printStackTrace();
      System.out.println("Expected total sales: "+(p1.getPrice()*bv.getProduct1Quant()+(p2.getPrice()*bv.getProduct2Quant()))+" Actual total sales: "+bv.totalSalesPossible());
    }


  } // end testTotalSalesPossible method

  /**
  * Test that the equals method returns true.
  */
  public void testEquals() {

    //////////////////////////////////////
    // Lab March 3
    // Write this method
    /////////////////////////////////////


  } // end testEquals method

  public static void main(String[] args) {

    // Create a BasicVendTest object
    BasicVendTest tbv = new BasicVendTest();

    // Call the methods to perform unit tests
    tbv.testAccessors();
    tbv.testVendProd1();
    tbv.testVendProd2();
    tbv.testVendWrongProd();
    tbv.testTotalSalesPossible();
    tbv.testEquals();

  } // end of main method

} // end of BasicVendTest class
