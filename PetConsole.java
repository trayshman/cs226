import java.util.Scanner;

/**
* An interface for interacting with a pet, as a pet owner.
*
* @author Ryan Jones
*/
public class PetConsole {
  /** The scanner for keyboard input */
  private Scanner keyboardIn;

  /** The Rock pet */
  private Rock pet;

  /** The Rock owner */
  private RockOwner me;

  /**
  * Constructs the pet console, keyboard input, gets pet name from user, constructs rock pet
  * using the name, and starting parameters of 0 for hunger and erosion, and 10 for mood.
  * Also constructs rock owner who starts with 10 mineral, food, and time points, as well as the owner's pet.
  */
  public PetConsole(){
    keyboardIn = new Scanner(System.in);


    String petname=this.askForName();
    pet = new Rock(petname,0,10,0);

    me = new RockOwner(10,10,10,pet);
  }

  /**
  * Asks the user to enter a pet name.
  *
  * @return The name of the pet the user entered.
  */
  public String askForName() {
    System.out.print("What is your pet's name: ");
    String s = keyboardIn.nextLine();
     return s;
    }


    /**
    * Asks the user to choose an actio between feed, play, and prevent erosion.
    *
    * @return The user's choice in interacting with the pet.
    */
  public int getAction(){
    System.out.println("What would you like to do with "+pet.getName()+"?");
    System.out.println("1 = feed;  2 = play;  3 = prevent erosion ---- Enter your choice: ");
    int choice = keyboardIn.nextInt();
    return choice;
  }

  /**
  * When this method is called, depending on the choice the user made, they will be prompted to enter
  * an amount of points for that specific activity that they want to use. The corresponding pet level
  * will be changed based on the number of points the owner wants to use.
  * The updated pet stats regarding that specific activity will then be displayed, as well as the updated point inventory
  * the user has of points toward that activity. In the event the player enters an invalid number such as 4, prevent erosion will automatically be chosen, but assume user enters valid choice.
  * It will also print a message if the owner chooses to use more points than they have, letting them know the program will be using all of their available points instead.
  * @param choice The action choice the user made.
  */
  public void doAction(int choice){
    if(choice==1){
      System.out.println("How much food do you want to give to "+pet.getName()+"?: ");
      int amount = keyboardIn.nextInt();
      if(amount>me.getFoodLevel()){
        System.out.println("You don't have that much food, using maximum amount instead");
      }
      me.feedPet(amount);
      System.out.println("updated pet hunger: "+ pet.getHunger());
      System.out.println("updated food amount: "+me.getFoodLevel());
    }
    else if(choice==2){
      System.out.println("How much time do you want to spend playing with "+pet.getName()+"?: ");
      int amount = keyboardIn.nextInt();
      if(amount>me.getTimeLevel()){
        System.out.println("You don't have that much time, using maximum amount instead");
      }
      me.giveAttention(amount);
      System.out.println("updated pet mood: "+ pet.getMood());
      System.out.println("updated time amount: "+me.getTimeLevel());
    }
    else{
      System.out.println("How much minerals do you want to give to "+pet.getName()+"?: ");
      int amount = keyboardIn.nextInt();
      if(amount>me.getMineralLevel()){
        System.out.println("You don't have that much minerals, using maximum amount instead");
      }
      me.giveMinerals(amount);
      System.out.println("updated pet erosion: "+ pet.getErosion());
      System.out.println("updated mineral amount: "+me.getMineralLevel());
    }
  }

  /**
  * The run method. When it is called, the user will enter a while = true loop, and be given the pet's stats
  * as well as the amount of various points they have to interact with their pet. The
  * pet's health will display as either good or poor, and the user will be prompted to choose an action.
  * After interacting with the pet, the tick methods for both the user and the pet will be called,
  * and owner points as well as pet stats may be updated. The user will be given an option to exit the loop and end the game,
  * or stay in the loop and play another round. The program will say bye to the player if they choose to exit the game.
  */
  public void run(){
    boolean keepPlaying = true;
    while(keepPlaying){
      System.out.println("-----------------------");

      System.out.println("Mood = "+pet.getMood()+"\n");
      System.out.println("Hunger = "+pet.getHunger()+"\n");
      System.out.println("Erosion levels = "+pet.getErosion()+"\n");

      System.out.println("you have: "+ me.getFoodLevel()+" food points, "+ me.getTimeLevel()+" time points, and "+me.getMineralLevel()+" mineral points");
      boolean health = pet.getHealth();
      if(health == true){
        System.out.println(pet.getName()+" is in good health");
      }
      else{
        System.out.println(pet.getName()+" is in poor health");
      }
      int choose = getAction();

      doAction(choose);

      me.tick();
      pet.tick();

      System.out.println("Do you want keep playing? (1 for yes / 2 for no): ");
      int response = keyboardIn.nextInt();
      if(response == 2){
        System.out.println("bye");
        keepPlaying = false;
      }
    }
  }









    /**
    * Main method. Creates a PetConsole object, then runs run method.
    */
    public static void main(String[] args) {

      // Create a PetConsole object
      PetConsole petApp = new PetConsole();
      petApp.run();
    }
  }
