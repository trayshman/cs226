/**
* Thrown when two arrays should have the same length, but have different lengths.
*
* @author Christine Reilly
*/
public class ArrayLengthDifferentException extends Exception {

  /**
  * Creates an ArrayLengthDifferentException object.
  *
  * @param len1 The length of the first array
  * @param len2 The length of the second array
  */
  public ArrayLengthDifferentException(int len1, int len2) {
    // The Exception class constructor has a String parameter
    // Use this super class's instance variables and methods (don't repeat work!)
    super("Arrays should have same length but lengths are " + len1 + " and " + len2);
  }

}
