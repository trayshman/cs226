import java.util.Scanner;
import java.util.Random;
// Actions for Dice App:
// 1) get number of sides from user input
// 2) create two die objects
// 3) roll the two die as long as user wants to keep rolling
// ---> output values rolled
public class DiceAppConsole {
  // Scanner for getting keyboard input:
  private Scanner keyboardIn;

  private Die d1;

  private Die d2;
  // Constructor: get number of sides, create two die objects
  // parameter: Random object
  public DiceAppConsole(Random r){

    // Create Scanner Object:
    keyboardIn = new Scanner(System.in);

    // get number of sides
    int sides = this.askForSides();

    System.out.println("Creating two die with " + sides + " sides");

    // Create two die objects
    d1 = new Die(sides, r);
    d2 = new Die(sides, r);

  }
  // Does user input to get number of sides
  private int askForSides() {
    System.out.print("How many sides do the die have? ");
    int s = keyboardIn.nextInt(); //what does NextInt do

    // clear any extra junk entered by the user
    if(keyboardIn.hasNextLine()) {
      // read the junk, throw it away
      keyboardIn.nextLine();
    }

    return s;
  }


  // run method: keep rolling dice as long as user wants to continue
  public void run() {

    //keep rolling until user chooses to stop
    boolean keepRolling = true;

    while(keepRolling) {
      int roll1 = d1.roll();
      int roll2 = d2.roll();

      // Output the values Rolled
      System.out.println("Rolled a " + roll1 + " and a " + roll2);

      System.out.println("Do you want to roll again? (y/n) ");
      String response = keyboardIn.nextLine();
      if(response.charAt(0) == 'n') {
        keepRolling = false;
      }
    } // end of rolling while loop
    System.out.println("ok bye");
  }

  public static void main(String[] args) {

    // Create a random object
    Random rand = new Random();

    // Create a DiceAppConsole object
    DiceAppConsole diceApp = new DiceAppConsole(rand);
    diceApp.run();
  }
}
