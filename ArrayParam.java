/**
* Examples of working with Arrays, including passing Arrays to methods
*
* @author Christine Reilly
*/
import java.util.Arrays;
import java.util.Random;

public class ArrayParam {

  /** A random number object */
  private Random rand;

  /**
  * Constructor. Initializes a Random object for use by this object.
  */
  public ArrayParam() {
    rand = new Random();
  }

  /**
  * Demonstrates how Java stores arrays and other reference types.
  */
  public void arraysInMemory() {
    int[] list1 = new int[5]; // An array of integers
    int[] list2 = new int[5]; // Another array of integers

    for(int i = 0; i < list1.length; i++) {
      list1[i] = i;
      list2[i] = i;
    }

    int[] list3 = list2; // list3 and list2 refer to the same array in memory

    System.out.println("\nExamples of comparing arrays.....");
    System.out.println("list1 == list2: " + (list1 == list2));
    System.out.println("list2 == list3: " + (list2 == list3));

    System.out.println("Arrays.equals(list1,list2): " + Arrays.equals(list1,list2));
    System.out.println("Arrays.equals(list2,list3): " + Arrays.equals(list2,list3));

    System.out.println("\nExample of changing value in array with two variables referring to it.....");
    System.out.println("Before change:");
    System.out.println("    Contents of list2: " + Arrays.toString(list2));
    System.out.println("    Contents of list3: " + Arrays.toString(list3));

    list2[2] = 123; // Change third element of list2, also changes list3 since variables refer to same object

    System.out.println("After change:");
    System.out.println("    Contents of list2: " + Arrays.toString(list2));
    System.out.println("    Contents of list3: " + Arrays.toString(list3));

    System.out.println("\nExample of NullPonterException (must remove comment from code).....");
    list2 = null; // Variable list2 refers to nothing
    // Remove the comment from the next line to cause the NullPointerException
    // list2[0] = 987;

    System.out.println("\nExample of ArrayIndexOutOfBoundsException (must remove comment from code).....");
    // Remove the comment from the next line to cause the ArrayIndexOutOfBoundsException
    // list1[5] = 987;

  } // end of arraysInMemory method

  /**
  * Prints the contents of the parameter array, one value per line.
  *
  * @param nums The array of values to print
  */
  public void print(int[] nums) {
    for(int n: nums) {
      System.out.println(n);
    }
  }

  /**
  * Demonstrates that changes a method makes to a reference type parameter
  * also change the object referred to by the variable in the calling method.
  *
  * @param nums The array of values to alter
  */
  public void changeArray(int[] nums) {

    // Make sure to use loop with index when we want to change values in the array
    for(int i = 0; i < nums.length; i++) {
      nums[i] *= 2; // multiply array element by 2
    }
  }

  /**
  * Demonstrates array of objects.
  */
  public void objectArray() {

    // Create an array of Die objects
    Die[] dice = new Die[3];

    // Initialize the array by creating an object for each array element
    dice[0] = new Die(6, rand);
    dice[1] = new Die(10, rand);
    dice[2] = new Die(20, rand);

    // Roll all the dice a few times
    for(int i = 0; i < 5; i++) {
      System.out.println("\nRound " + (i + 1));

      for(int j = 0; j < dice.length; j++) {
        System.out.println(".... Rolling dice " + j + ": " + dice[j].roll());
      }
    }
  }

  public static void main(String[] args) {
    ArrayParam ap = new ArrayParam();

    System.out.println("Calling arraysInMemory method");
    ap.arraysInMemory();

    System.out.println("\n\nCalling print method");
    int[] myNums = {9, 8, 7, 6, 5};
    ap.print(myNums);

    System.out.println("\n\nCalling changeArray method");
    ap.changeArray(myNums);
    ap.print(myNums);

    System.out.println("\n\nCalling objectArray method");

    ap.objectArray();

  }

}
