///////////////////////////////////////////////////////////////////////////
//
// Author: Christine Reilly
//
// Program Name: Data And Expressions
// Program Description: Practice with data types, variables, and expressions.
//
///////////////////////////////////////////////////////////////////////////

// The class and file must have the same name
public class DataAndExpressions {
  public static void main(String[] args) {

    // This program is an example of a not-really-object-oriented Java program.
    // The class has one method, the main method.
    // This is more like the style of programming you probably saw in CS106.
    // We will not use this style of programming in CS226, but it is a quick
    // way to demonstrate the concepts about data types and expressions.

    // Variables can be declared anywhere in a program
    // For beginning programmers, I recommend declaring all variables
    // at the beginning of the method.

    int x, y, z;
    int a, b, c;
    double d;

      //////////////////////////////////////////////////////////////////////
    // Exercise: Precedence of Arithmetic Operators
    //////////////////////////////////////////////////////////////////////
    System.out.println("Example: Precedence of Arithmetic Operators");
    a = 13;
    b = 4;
    c = b + a % b * 6;
    d = a - a / b + b;

    // Print the values of the variables used in this exercise
    // When printing, the + is how we concatenate strings
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
    System.out.println("d = " + d);

    // Print a couple of blank lines before the next example
    System.out.println();
    System.out.println();

    //////////////////////////////////////////////////////////////////////
    // Examples: mixing types and casting
    //////////////////////////////////////////////////////////////////////
    x = 23;
    y = 34;
    d = 23 + 34;
    System.out.print("Add integers " + x + " + " + y + "; save result to ");
    System.out.println("double d = " + d);
    System.out.println();

    x = 5;
    y = 2;
    d = x / y;
    System.out.print("Divide integers " + x + " / " + y + "; save result ");
    System.out.println("to double d = " + d);
    System.out.println();

    d = (double)x / y;
    System.out.print("Cast " + x + " to double, then divide by " + y);
    System.out.println("; save result to double d = " + d);
    System.out.println();

    d = (double)(x/y);
    System.out.println("Example of logic error when casting:");
    System.out.print("Divide integers " + x + " / " + y);
    System.out.println("; then cast to double");
    System.out.println("Save result to double d = " + d);

    }// end of main method
} // end of DataAndExpressions class
