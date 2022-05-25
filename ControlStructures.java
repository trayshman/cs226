import java.util.Scanner;
import java.util.Random;

/**
* Example code demonstrating use of various control structures.
*
* @author Christine Reilly
*/
public class ControlStructures {

  public static void main(String[] args) {
    Scanner keyIn = new Scanner(System.in); // Keyboard input

    /********** Example 1: for loop **********/
    System.out.println("***** Example 1: for loop *****");

    for(int i = 1; i <= 10; i++) {
      System.out.print(i + " ");
    }
    System.out.println();


    /********** Example 2: do ... while loop **********/
    System.out.println("\n\n***** Example 2: do ... while loop *****");

    Random rand = new Random();

    int j = 5;
    int randNum; // do not need to initialize before the loop

    do {
      randNum = rand.nextInt(10) + 1;
      System.out.println("Random number: " + randNum);
    } while(j != randNum);

    System.out.println("\ndo ... while vs. while");
    System.out.println("Output of while loop:");
    int k = 10;
    while(k < 10) {
      System.out.println("k = " + k);
      k++;
    }

    System.out.println("Output of do...while loop:");
    int m = 10;
    do {
      System.out.println("m = " + m);
      m++;
    } while (k < 10);


    /********** Example 3: switch day of week **********/
    System.out.println("\n\n***** Example 3: switch day of week *****");

    // Get a number from user input
    int day;
    String dayName;

    System.out.print("Enter an integer 1 through 7: ");
    day = keyIn.nextInt();

    // Use a switch structure to print the day that corresponds with the number
    switch(day) {
      case 1:
        dayName = "Sunday";
        break;
      case 2:
        dayName = "Monday";
        break;
      case 3:
        dayName = "Tuesday";
        break;
      case 4:
        dayName = "Wednesday";
        break;
      case 5:
        dayName = "Thursday";
        break;
      case 6:
        dayName = "Friday";
        break;
      case 7:
        dayName = "Saturday";
        break;
      default:
        dayName = "Unknown";
    }
    System.out.println("Day Name: " + dayName);

    // Clean up any junk left on the console input
    if(keyIn.hasNextLine()) {
      keyIn.nextLine();
    }

    /********** Example 4: switch zip code **********/
    System.out.println("\n\n***** Example 4: switch zip code *****");

    System.out.print("Enter a zip code: ");
    String zip = keyIn.nextLine();

    // Get the first character from the zip code
    char firstCh = zip.charAt(0);

    switch(firstCh) {
      case '0':
      case '1':
      case '2':
      case '3':
        System.out.println(zip + " is on the East Coast");
        break;
      case '4':
      case '5':
      case '6':
        System.out.println(zip + " is in the Central Plains");
        break;
      case '7':
        System.out.println(zip + " is in the South");
        break;
      case '8':
      case '9':
        System.out.println(zip + " is in the West");
        break;
      default:
        System.out.println(zip + " is not a valid zip code");
    }


  } // end of main method

} // end of class
