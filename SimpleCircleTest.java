/**
* CS226 Spring 2022 Exam 2
* Unit tests for the SimpleCircle class.
*
* @author Ryan Jones
*/
public class SimpleCircleTest {

  /**
  * Test that the area method is correctly implemented.
  */
  public void testArea() {
    System.out.println("\nStarting testArea");

    SimpleCircle l = new SimpleCircle("Brown",6);

    try {
      assert(l.area() == Math.PI*(l.getRadius()*l.getRadius()));

    } catch(AssertionError e) {
      e.printStackTrace();
      System.out.println("Correct area: "+ Math.PI*(l.getRadius()*l.getRadius())+ " method returned: "+l.area());
    }

    System.out.println("Finished testArea");
  } // end of testArea method

  /**
  * Tests for one possible error in the equals method.
  */
  public void testEquals1() {
    System.out.println("\nStarting testEquals1");

    SimpleCircle l = new SimpleCircle("Brown",6);
    SimpleCircle p = new SimpleCircle("Gold",6);
    try {
      assert(l.equals(p))==false;

    } catch(AssertionError e) {
      e.printStackTrace();
      System.out.println("testEquals1 = "+l.equals(p)+" it should be false");
      //I couldn't find the second error in the equals method, I commented next to every line in the equals method in SimpleCircle to show my thought process, please take a look at it.
    }

    System.out.println("Finished testEquals1");
  }

  /**
  * Tests for one possible error in the equals method, a different error than
  * tested for by testEquals1
  */
  public void testEquals2() {
    System.out.println("\nStarting testEquals2");

    SimpleCircle l = new SimpleCircle("Brown",6);
    String p = new String("Brown,6");
    try {
      assert(l.equals(p))==false;

    } catch(AssertionError e) {
      e.printStackTrace();
      System.out.println("testEquals2 = "+l.equals(p)+" it should be false");
    }


    System.out.println("Finished testEquals2");
  }


  /**
  * EXAM 2: DO NOT ALTER THIS METHOD
  * main method creates and uses a SimpleCircleTest object.
  */
  public static void main(String[] args) {

    SimpleCircleTest sct = new SimpleCircleTest();

    // Call the methods to perform unit tests
    sct.testArea();
    sct.testEquals1();
    sct.testEquals2();

  } // end of main method

} // end SimpleCircleTest class
