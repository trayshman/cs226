import java.util.Scanner;

/**
* A console application about geometry.
*
* @author Christine Reilly
*/
public class GeometryApp {

  /** A Scanner object for console input */
  private Scanner keyboardIn;

  /** The shape used by this application */
  private Shape shape;

  // NOTE: These "static final" variables are class constants. The value
  // cannot be changed. The naming convention for class constants is to use
  // all capital letters with underscore separating the words.

  /** The integer that corresponds to a Rectangle */
  private static final int RECTANGLE_CHOICE = 1;

  /** The integer that corresponds to a Square */
  private static final int SQUARE_CHOICE = 2;

  /** The integer that corresponds to a Circle */
  private static final int CIRCLE_CHOICE = 3;

  /** The integer that corresponds to a Box */
  private static final int BOX_CHOICE = 4;

  /** The integer that corresponds to a Cylinder */
  private static final int CYLINDER_CHOICE = 5;

  /** The integer that corresponds to perimeter */
  private static final int PERIMETER_CHOICE = 1;

  /** The integer that corresponds to area */
  private static final int AREA_CHOICE = 2;

  /** The integer that corresponds to surface area */
  private static final int SURFACE_AREA_CHOICE = 1;

  /** The integer that corresponds to volume */
  private static final int VOLUME_CHOICE = 2;

  /**
  * Constructor for the GeometryApp. Gets user input for the type of shape.
  */
  public GeometryApp() {
    keyboardIn = new Scanner(System.in);
    createShape();

    System.out.println("Your shape: " + shape);
    System.out.println();
  } // end of constructor

  private void createShape() {

    // Notice how we use the class constants for two purposes:
    // 1) To make sure our integers match in the menu we print to the user
    //    and in the switch structure.
    // 2) To make the switch structure easier to read. The name of the class
    //    constant allows us to write self documenting code.

    System.out.println("What type of shape would you like to use? ");
    System.out.println("Enter one of the following choices...");
    System.out.println("    " + RECTANGLE_CHOICE + " for Rectangle");
    System.out.println("    " + SQUARE_CHOICE + " for Square");
    System.out.println("    " + CIRCLE_CHOICE + " for Circle");
    System.out.println("    " + BOX_CHOICE + " for Box");
    System.out.println("    " + CYLINDER_CHOICE + " for Cylinder");
    System.out.print("... Your choice: ");
    int choice = keyboardIn.nextInt();
    System.out.println();

    switch(choice) {
      case RECTANGLE_CHOICE:
        // Rectangle
        System.out.print("Enter the length: ");
        int length = keyboardIn.nextInt();
        System.out.print("Enter the width: ");
        int width = keyboardIn.nextInt();
        shape = new Rectangle(length, width);
        System.out.println();
        break;

      case SQUARE_CHOICE:
        // Square
        System.out.print("Enter the length of a side: ");
        int side = keyboardIn.nextInt();
        shape = new Square(side);
        System.out.println();
        break;

      case CIRCLE_CHOICE:
        // Circle
        System.out.print("Enter the radius: ");
        int radius = keyboardIn.nextInt();
        shape = new Circle(radius);
        System.out.println();
        break;

      case BOX_CHOICE:
        // Box
        System.out.print("Enter the length: ");
        int bl = keyboardIn.nextInt();
        System.out.print("Enter the width: ");
        int bw = keyboardIn.nextInt();
        System.out.print("Enter the height: ");
        int bh = keyboardIn.nextInt();
        shape = new Box(bl, bw, bh);
        break;

      case CYLINDER_CHOICE:
        // Cylinder
        System.out.print("Enter the radius: ");
        int rad = keyboardIn.nextInt();
        System.out.print("Enter the height: ");
        int ch = keyboardIn.nextInt();
        shape = new Cylinder(rad, ch);
        System.out.println();
        break;

      default:
        System.out.println("Choice not valid, ending program");
        System.exit(1);
    }
  } // end of createShape method

  /**
  * Run the console user interface program.
  */
  public void run() {
    boolean keepGoing = true;

    while(keepGoing) {

      // There are different actions depending on if the shape is two-dimensional
      // or three-dimensional. Use the instanceof operator to determine what
      // category the shape is. This is a benefit of creating an interface
      // for all shapes in a category. We can add more shapes to a category
      // and this code will not need to be updated!
      if(shape instanceof Shape2d) {
        do2dAction();
      } else if(shape instanceof Shape3d) {
        do3dAction();
      } else {
        System.out.println("Unknown shape type, ending program");
        System.exit(1);
      }


      // Clean up console input before getting string
      if(keyboardIn.hasNextLine()) {
        keyboardIn.nextLine();
      }

      // Ask the user if they want to keep going
      System.out.print("Do you want to keep going? (enter y/n) ");
      String response = keyboardIn.nextLine();
      System.out.println();
      if(response.charAt(0) == 'n') {
        keepGoing = false;
      }

    } // end of keep going loop

  } // end of run method

  /**
  * Actions for two-dimensional shapes
  */
  private void do2dAction() {

    int action = get2dAction();

    // Notice that we need to cast the Shape object to the Shape2d type so we
    // can use the methods that Shape2d types have.
    // Also notice the precedence of casting is lower than that of the dot
    // operator. Use parenthesis around the cast object so we can call a method
    // that belongs to the casted type.

    // Also notice the use of class constants in this method and in the get2dAction
    // method that was called above. Using class constants helps us avoid making
    // a silly error where we don't match the integers in the menu and the
    // switch structure. The names of the class constants also make our code
    // more readable.

    switch(action) {
      case PERIMETER_CHOICE:
        // Perimiter
        System.out.println("The perimeter is: " + ((Shape2d)shape).perimeter());
        System.out.println();
        break;

      case AREA_CHOICE:
        // Area
        System.out.println("The area is: " + ((Shape2d)shape).area());
        System.out.println();
        break;

      default:
        System.out.println("Choice not valid, ending program");
        System.exit(1);

    } // end of switch on action choice
  }

  /**
  * Gets user input for choice of two-dimensional shape action.
  *
  * @return The user's choice.
  */
  private int get2dAction() {
    System.out.println("What information would you like to print? ");
    System.out.println("Enter one of the following choices...");
    System.out.println("    " + PERIMETER_CHOICE + " for perimiter");
    System.out.println("    " + AREA_CHOICE + " for area");
    System.out.print("... Your choice: ");
    int choice = keyboardIn.nextInt();
    System.out.println();
    return choice;
  }

  /**
  * Actions for two-dimensional shapes
  */
  private void do3dAction() {

    int action = get3dAction();

    // Notice that we use casting the same way we did in the do2dAction method.
    // See the do2dAction method for an explanation.

    // Also notice how we are again using class constants to avoid making
    // silly errors and for code readabilty.

    switch(action) {
      case SURFACE_AREA_CHOICE:
        // Surface area
        System.out.println("The surface area is: " + ((Shape3d)shape).surfaceArea());
        System.out.println();
        break;

      case VOLUME_CHOICE:
        // Volume
        System.out.println("The volume is: " + ((Shape3d)shape).volume());
        System.out.println();
        break;

      default:
        System.out.println("Choice not valid, ending program");
        System.exit(1);

    } // end of switch on action choice
  }

  /**
  * Gets user input for choice of two-dimensional shape action.
  *
  * @return The user's choice.
  */
  private int get3dAction() {
    System.out.println("What information would you like to print? ");
    System.out.println("Enter one of the following choices...");
    System.out.println("    " + SURFACE_AREA_CHOICE + " for surface area");
    System.out.println("    " + VOLUME_CHOICE + " for volume");
    System.out.print("... Your choice: ");
    int choice = keyboardIn.nextInt();
    System.out.println();
    return choice;
  }

  public static void main(String[] args) {
    GeometryApp ga = new GeometryApp();
    ga.run();
  }

} // end of GeometryApp class
