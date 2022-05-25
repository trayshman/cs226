/**
* Examples of working with Arrays
*
* @author Christine Reilly
*/
import java.util.Arrays;

public class ArrayPlay {

  // Writing all code in the main method.
  // This program demonstrates the Arrays class and other array concepts.

  public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 4, 5}; // Initialize array with 5 numbers
    int[] nums2 = new int[5]; // Array with room for 5 integers
    int[] nums3 = {1, 2, 3, 4, 5}; // Initialize array with 5 numbers

    // Java automatically initializes integer array elements to zero.
    // Use the Arrays class toString method for String representation
    // of the array.
    System.out.print("nums1 elements initialized to specified values: ");
    System.out.println(Arrays.toString(nums1));
    System.out.print("nums2 elements automatically initalized to zero: ");
    System.out.println(Arrays.toString(nums2));

    // Use the fill method from the Arrays class to set every element
    // of nums3 to the value 123.
    Arrays.fill(nums2, 123);
    System.out.print("Set every element of nums2 to value 123: ");
    System.out.println(Arrays.toString(nums2));
    System.out.println();

    // The arrays nums1 and nums4 have the same values, they are equal.
    // Demonstrate that == operator does not work for array equality.
    // Show how equals method from Arrays class works.
    if(nums1 == nums3) {
      System.out.println("Arrays nums1 and nums3 are equal (using ==)");
    } else {
      System.out.println("Arrays nums1 and nums3 are not equal (using ==)");
    }

    if(Arrays.equals(nums1, nums3)) {
      System.out.println("Arrays nums1 and nums3 are equal (using Arrays.equals)");
    } else {
      System.out.println("Arrays nums1 and nums3 are not equal (using Arrays.equals)");
    }

    // Use a For-Each loop to print the array in a different format
    // than the Arrays class toString method
    System.out.println();
    System.out.println("Printing nums1: ");
    for(int n : nums1) {
      System.out.print(n + " ");
    }
    System.out.println();
    System.out.println();

    System.out.println("Demonstration that the For-Each loop cannot be used "
                        + "to change value of array elements:");
    System.out.println("Array nums1 initial values: " + Arrays.toString(nums1));
    System.out.println("Printing double of each element using For-Each loop: ");
    for(int n : nums1) {
      n = n * 2;
      System.out.print(n + " ");
    }
    System.out.println();
    System.out.println("Array nums1 values after For-Each loop: "
                        + Arrays.toString(nums1));
    System.out.println();

    System.out.println("Using regular for loop to double array elements: ");
    for(int i = 0; i < nums1.length; i++) {
      nums1[i] = nums1[i] * 2;
      System.out.print(nums1[i] + " ");
    }
    System.out.println();
    System.out.println("Array nums1 values after regular for loop: "
                        + Arrays.toString(nums1));

  }
}
