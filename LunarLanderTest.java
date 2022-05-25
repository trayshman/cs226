/**
* Unit tests for the LunarLander class.
*
* Build command: javac LunarLander.java LunarLanderTest.java
* Run command: java -ea LunarLanderTest
*
* @author Christine Reilly
*/
public class LunarLanderTest {

  /**
  * The accessor methods should return the values set by the constructor.
  */
  public void testAccessors() {
    LunarLander l = new LunarLander(100, 50, 30, 3, 4, 10);

    try {
      assert(l.getVelocity() == 50);
      assert(l.getAltitude() == 100);
      assert(l.getFuel() == 30);
      assert(l.getSafeLanding() == 10);

    } catch(AssertionError e) {
      e.printStackTrace();
      this.printLander(l);
    }
  }

  /**
  * The thrust method should not alter the values returned by accessor methods.
  */
  public void thrustDoesNotAlterValues() {
    LunarLander l = new LunarLander(100, 50, 30, 3, 4, 10);

    l.thrust();

    try {
      assert(l.getVelocity() == 50);
      assert(l.getAltitude() == 100);
      assert(l.getFuel() == 30);
      assert(l.getSafeLanding() == 10);
    } catch(AssertionError e) {
      e.printStackTrace();
      this.printLander(l);
    }
  }

  /**
  * When the thrust method has not been called, the tick method should result in:
  * velocity = velocity + gravitationalAcceleration
  * altitude = altitude - velocity
  * no change in fuel or safe landing
  */
  public void tickNoThrust() {
    LunarLander l = new LunarLander(100, 50, 30, 3, 4, 10);

    l.tick();

    try {
      assert(l.getVelocity() == 53);
      assert(l.getAltitude() == 47);
      assert(l.getFuel() == 30);
      assert(l.getSafeLanding() == 10);
    } catch(AssertionError e) {
      e.printStackTrace();
      this.printLander(l);
    }

  }

  /**
  * When the thrust method has been called once then the tick method is called,
  * the result should be:
  * velocity = velocity + gravitationalAcceleration - thrustAcceleration
  * altitude = altitude - velocity
  * fuel = fuel - 1
  * no change in safe landing
  */
  public void thrustThenTick() {
    LunarLander l = new LunarLander(100, 50, 30, 3, 4, 10);

    l.thrust();
    l.tick();

    try {
      assert(l.getVelocity() == 49);
      assert(l.getAltitude() == 51);
      assert(l.getFuel() == 29);
      assert(l.getSafeLanding() == 10);
    } catch(AssertionError e) {
      e.printStackTrace();
      this.printLander(l);
    }
  }

  /**
  * Make sure thrust counter is reset after each tick.
  */
  public void thrustCountIsReset() {
    LunarLander l = new LunarLander(100, 50, 30, 3, 4, 10);

    l.thrust();
    l.tick();
    l.thrust();
    l.tick();

    try {
      assert(l.getVelocity() == 48);
      assert(l.getAltitude() == 3);
      assert(l.getFuel() == 28);
      assert(l.getSafeLanding() == 10);
    } catch(AssertionError e) {
      e.printStackTrace();
      this.printLander(l);
    }

  }

  /**
  * Make sure to not use more fuel than available.
  * Fuel is third paramteter to the constructor.
  */
  public void useAllFuel() {
    LunarLander l = new LunarLander(100, 50, 3, 3, 4, 10);

    // Lander has 3 units of fuel
    // Call the thrust method 4 times
    l.thrust();
    l.thrust();
    l.thrust();
    l.thrust();

    // Call the tick method
    l.tick();

    // Check the LunarLander's state

    try {
      // fuel should be 0
      assert(l.getFuel() == 0);

      // Velocity should have had 3 engine thrusts applied
      // velocity = velocity + gravitationalAcceleration - (3*thrustAcceleration)
      // = 50 + 3 - (3 * 4)
      assert(l.getVelocity() == 41);

      // Altitude should be 100 - 41
      assert(l.getAltitude() == 59);

      // safe landing should not change
      assert(l.getSafeLanding() == 10);
    } catch(AssertionError e) {
      e.printStackTrace();
      this.printLander(l);
    }
  }

  /**
  * Altitude should not be negative after a tick.
  */
  public void altitudeNotNegative() {
    LunarLander l = new LunarLander(50, 100, 30, 3, 4, 10);

    l.tick();

    try {
      assert(l.getVelocity() == 103);
      assert(l.getAltitude() == 0);
      assert(l.getFuel() == 30);
      assert(l.getSafeLanding() == 10);
    } catch(AssertionError e) {
      e.printStackTrace();
      this.printLander(l);
    }
  }

  /**
  * Prints information about a LunarLander object.
  *
  * @param l The LunarLander object to print.
  */
  public void printLander(LunarLander l) {
    System.out.println("Lander Info: ");
    System.out.println("Velocity: " + l.getVelocity());
    System.out.println("Altitude: " + l.getAltitude());
    System.out.println("Fuel: " + l.getFuel());
    System.out.println("Safe Landing: " + l.getSafeLanding());
    System.out.println();
  }

  /**
  * Main method. Command line arguments are not used.
  */
  public static void main(String[] args) {

    // Create a LunarLanderTest object
    LunarLanderTest lt = new LunarLanderTest();

    // Call the methods to do unit tests
    lt.testAccessors();
    lt.thrustDoesNotAlterValues();
    lt.tickNoThrust();
    lt.thrustThenTick();
    lt.thrustCountIsReset();
    lt.useAllFuel();
    lt.altitudeNotNegative();
  }
}
