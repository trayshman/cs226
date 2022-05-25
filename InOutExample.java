/**
* Examples of file input and output.
*
* @author Christine Reilly
*/
import java.io.*;
import java.util.Scanner;

public class InOutExample {

  /**
  * Demonstrates calling methods of a File object to get information about
  * the file.
  *
  * @param f A file object.
  */
  public void printFileInfo(File f) {

    System.out.println("Some information about the file object");
    System.out.println("Absolute path: " + f.getAbsolutePath());
    System.out.println("File exists: " + f.exists());
    System.out.println("File is readable: " + f.canRead());
    System.out.println("Is a directory: " + f.isDirectory());
    System.out.println("Is a file: " + f.isFile());
    System.out.println("File length (in bytes): " + f.length());
    System.out.println("Last modified time (milliseconds since epoch): "
                        + f.lastModified());
    System.out.println();

  }

  /**
  * Reads integers from a Scanner object and calculates the average of the values.
  *
  * @param s A Scanner object.
  * @return The average of the integer values read from the Scanner
  */
  public double averageFromInput(Scanner s) {
    int x; // integer read from file
    int sum = 0; // sum of integers in file
    int num = 0; // number of integers read from file
    double avg; // average of the integers in the file

    // Use the Scanner object to read integers from an input stream
    // Find the average of these integers
    while (s.hasNextInt()) { // loop through integers on the input stream
        x = s.nextInt(); // read integer from file
        sum += x; // add x to the sum
        num++; // increment the count of numbers read from the file
    }
    // Calculate the average
    avg = (double)sum / num;

    return avg;
  }

  public static void main(String[] args) throws FileNotFoundException {

    InOutExample ioe = new InOutExample();

    // Create a File object for the file called lotsOfInts.txt
    // Assumes that lotsOfInts.txt is in the same directory as this
    // Java code.
    File f1 = new File("lotsOfInts.txt");

    // Print information about the file
    ioe.printFileInfo(f1);

    // Create a Scanner object that reads from File object f1
    Scanner in1 = new Scanner(f1);

    // Find the average of the integers in the file
    double a = ioe.averageFromInput(in1); //takes scanner as the parameter

    // Print the result
    System.out.print("The average of the integers in the file is: ");
    System.out.println(a);

    // We are done reading the file, close the scanner
    in1.close();

    // Write the average to a file
    PrintStream output = new PrintStream(new File("myOutput.txt"));
    output.println("Average of integers read from file " + f1.getAbsolutePath());
    output.println(a);
    output.close();
  } // end of main method
}
