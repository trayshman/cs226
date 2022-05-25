import java.io.*;
import java.util.Scanner;

/**
* A console application about geometry.
*
* @author Christine Reilly
*/
public class GeometryFileApp {

  /**
  * Run the program that works with an array of Rectangle objects.
  *
  * @param filePath The pathname of the file containing Rectangle data
  */
  public void runRectangles(String filePath) throws FileNotFoundException {

    // Open the input file
    Scanner inFile = new Scanner(new File(filePath));

    // The first integer in the file is the number of Retangles
    int numRectangles = inFile.nextInt();

    // Create the array
    RectangleFile[] rectangles = new RectangleFile[numRectangles];

    // Process data on each line of the file
    int i = 0; // array index
    while(inFile.hasNextLine()) {
      String c = inFile.next(); // read the color
      int l = inFile.nextInt(); // read the length
      int w = inFile.nextInt(); // read the width

      // Read the junk on the rest of the line
      inFile.nextLine();

      // Create a Rectangle object using the data from this line of the file
      RectangleFile r = new RectangleFile(l, w, c);

      // Add the rectangle object to the array
      rectangles[i] = r;

      // increment the array index
      i++;

    } // end of loop through file

    // Close the Scanner object
    inFile.close();

    System.out.println("runRectangles created array of " + rectangles.length + " rectangles");
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

    // The first line in the file contains the number of shapes
    int numShapes = Integer.parseInt(inFile.nextLine());

    // Create the array
    ShapeFile[] shapes = new ShapeFile[numShapes];

    // Process data on each line of the file
    int i = 0; // array index
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

      // Add the shape to the array
      shapes[i] = s;

      // increment the array counter
      i++;

    } // end of loop through file

    // Close the Scanner object
    inFile.close();

    System.out.println("runShapes created array of " + shapes.length + " shapes");
    double a = this.averageArea(shapes);
    System.out.println("Average area of the shapes is: " + a);

  } // end of runShapes method


  /**
  * Finds the average area of the shapes in the parameter array.
  *
  * @param s An array of shapes
  */
  private double averageArea(ShapeFile[] s) {
    double sum = 0; // Sum of shapre areas

    // Loop through the array
    for(int i = 0; i < s.length; i++) {
      // Cast the ShapeFile object to Shape2d so we can call the area method
      // Notice the placement of parenthesis around the cast object due to
      // the order of precedence of casting and the dot operator.
      sum += ((Shape2d)s[i]).area();
    }

    double area = sum / s.length;
    return area;
  }

  public static void main(String[] args) throws FileNotFoundException {
    GeometryFileApp gfa = new GeometryFileApp();
    gfa.runRectangles("rectangleData.txt");
    System.out.println();
    gfa.runShapes("shapeData.txt");
  }

} // end of GeometryFileApp class
