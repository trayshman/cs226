import java.util.Scanner; //import scanner

public class BankAccountConsole { // class header

  private Scanner keyboardIn; // scanner object to read inputs

  private SimpleAccount account; // account object from SimpleAccount



  public BankAccountConsole(){ // constructor method
    keyboardIn = new Scanner(System.in); // input reader
    double money = initialBalance(); // object that will be initial balance (money), calls the initial balance method
    this.account = new SimpleAccount(money); // the initial balance is now a SimpleAccount object called account


  }

  private double initialBalance() { //initial balance is a double
    System.out.print("Enter your initial balance: $"); // prompts the user to enter the initial balance
    double bal = keyboardIn.nextDouble(); // reads the input and saves it to bal

    return bal; // and returns bal
  }


  private int doChoice() { // method for doChoice, its an int
    System.out.print("Choices: 1=Withdraw, 2=deposit, 3 = quit. Enter choice: "); // prompts user to choose
    int choice = keyboardIn.nextInt(); // reads their choice and saves it to choice

    return choice; // returns choice
  }

  private double doWithdraw() { //withdraw method
    System.out.print("Enter amount to withdraw: $"); // prompts user to enter amount to withdraw
    double withdraw = keyboardIn.nextDouble(); // reads input and saves to withdraw

    return withdraw; //returns it
  }
  private double doDeposit() { // deposit method
    System.out.print("Enter amount to deposit: $"); // prompts user to enter amount to deposit
    double deposit = keyboardIn.nextDouble(); // reads input and saves to deposit

    return deposit; // returns it
  }
public void run() { // run method
  boolean keepRunning = true; // is this considered a flag variable still in java
  while(keepRunning){ // while loop, while flag variable set to true
  int choice = this.doChoice(); // calls the do choice method and saves choice to choice
  if (choice==1){ // if the user chose 1
    double withdraw = this.doWithdraw(); // calls the doWithdraw method (gets user input for withdraw, etc)
    account.withdraw(withdraw); // calls the withdraw method from SimpleAccount to subtract account by the parameter (withdraw)

    System.out.print("Current balance: $" + account.getBalance()+"\n"); // prints out the new current balance, calling the method from SimpleAccount that returns balance
  }
  if (choice==2){ // if the choice was 2
    double deposit = this.doDeposit(); // calls the doDeposit method to get user input on how much to deposit
    account.deposit(deposit); // calls the deposit method in SimpleAccount to add to account by the parameter (deposit)
    System.out.print("Current balance: $" + account.getBalance()+"\n"); // prints out the new current balance
  }
  if (choice==3){ // if choice was 3
    keepRunning=false; // sets the flag to false so the loop ends
  }
  if (choice<1 || choice>3){ // if the user enters something other than 1, 2, or 3
    System.out.print("You did not enter a valid number\n"); //prints that they did not enter a valid number
  }
  }
}

  public static void main(String[] args) { //main method
    BankAccountConsole bankApp = new BankAccountConsole();
    bankApp.run(); // runs run method
}
}
