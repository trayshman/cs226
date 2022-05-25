import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
* A console application about geometry.
*
* @author Christine Reilly
*/
public class GeometryFileAppList {

  /**
  * Run the program that works with an array of Rectangle objects.
  *
  * @param filePath The pathname of the file containing Rectangle data
  */
  public void runRectangles(String filePath) throws FileNotFoundException {

    // Open the input file
    Scanner inFile = new Scanner(new File(filePath));

    // Create the list
    // Using ShapeFile as the type of object contained in the ArrayList
    // so we can pass this list as an argument to the averageArea method.
    ArrayList<ShapeFile> rectangles = new ArrayList<ShapeFile>();

    // Process data on each line of the file
    while(inFile.hasNextLine()) {
      String c = inFile.next(); // read the color
      int l = inFile.nextInt(); // read the length
      int w = inFile.nextInt(); // read the width

      // Read the junk on the rest of the line
      inFile.nextLine();

      // Create a Rectangle object using the data from this line of the file
      RectangleFile r = new RectangleFile(l, w, c);

      // Add the rectangle object to the list
      rectangles.add(r);

    } // end of loop through file

    // Close the Scanner object
    inFile.close();

    System.out.println("runRectangles created list of " + rectangles.size() + " rectangles");
    double a = this.averageArea(rectangles);
    System.out.println("Average area of the rectangles is: " + a);

  } // end of runRectangle method

  /**
  * Run the program that works with an array of Shapes objects.
  *
  * @param filePath The pathname of the file containing Shapes data
  */
  public void runShapes(String filePath) throws FileNotFoundException {

    // Open the input file
    Scanner inFile = new Scanner(new File(filePath));

    // Create the list
    LinkedList<ShapeFile> shapes = new LinkedList<ShapeFile>();

    // Process data on each line of the file
    while(inFile.hasNextLine()) {

      // Read the line of the file
      String line = inFile.nextLine();

      ShapeFile s; // The shape created from this line of data

      // Based on the first string in the line, create the correct type of Shape object
      if(line.startsWith("Rectangle")) {
        s = new RectangleFile(line);
      } else if(line.startsWith("Circle")) {
        s = new CircleFile(line);
      } else {
        System.out.print("Not a vaild shape type: " + line);
        s = null;
      }

      // Add the shape to the list
      shapes.add(s);

    } // end of loop through file

    // Close the Scanner object
    inFile.close();

    System.out.println("runShapes created list of " + shapes.size() + " shapes");
    double a = this.averageArea(shapes);
    System.out.println("Average area of the shapes is: " + a);

  } // end of runShapes method


  /**
  * Finds the average area of the shapes in the parameter array.
  *
  * Notice how this method parameter type is List interface. The method is called
  * using an ArrayList or LinkedList as an argument, and works for either type
  * of List.
  *
  * @param s A list of shapes
  */
  private double averageArea(List<ShapeFile> s) {
    double sum = 0; // Sum of shapre areas

    // Loop through the array
    for(ShapeFile shape : s) {
      // Cast the ShapeFile object to Shape2d so we can call the area method
      // Notice the placement of parenthesis around the cast object due to
      // the order of precedence of casting and the dot operator.
      sum += ((Shape2d)shape).area();
    }

    double area = sum / s.size();
    return area;
  }

  /**
  * Main method starts the program. Input files are specified as command line
  * arguments. The first argument is the file containing rectangle data, the
  * second argument is the file containing shape data.
  *
  * @param args The two file names to use in this program (rectangle data and shape data)
  */
  public static void main(String[] args) throws FileNotFoundException {
    GeometryFileAppList gfa = new GeometryFileAppList();
    gfa.runRectangles(args[0]);
    System.out.println();
    gfa.runShapes(args[1]);
  }

} // end of GeometryFileApp class
