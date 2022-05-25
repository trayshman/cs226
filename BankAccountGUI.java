import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // import things necessary for GUI building

public class BankAccountGUI extends CloseableFrame implements ActionListener { // class header, closeable frame also necessary for gui building, action listener for detecting when buttons clicked
  private JTextField balField; //text box where u enter balance
  private JButton balButton; // submit ur balance by clicking this button
  private JTextArea balDisplay; // displays ur balance
  private SimpleAccount account; // account object with methods for withdrawing, depositting, etc
  private JButton withdrawButton; //button to click to withdraw
  private JButton depositButton; //button for depositting
  private JTextField transactionField; // text box where you enter ur transaction amount


  public BankAccountGUI() { // build the gui box

  this.buildGUI();

  super.setVisible(true);
}

private void buildGUI() { // constructor method
  super.setSize(500, 500); // size of gui box
  super.setTitle("Bank Account"); // title of the box

  Container contentPane = super.getContentPane();
  contentPane.setLayout(new BorderLayout());

  JLabel balPrompt = new JLabel("Enter the initial balance: "); //displays the prompt for the user
  this.balField = new JTextField(5); // size of the text box, initializes the textbox for balance
  this.balButton = new JButton("Click here to initialize balance"); // button to initialize balance
  this.balButton.addActionListener(this); //button can detect when its clicked on

  JPanel balPanel = new JPanel(); // the balance panel section of the GUI
  balPanel.add(balPrompt); // add the prompt to this panel
  balPanel.add(this.balField); // add the balance textbox to this panel
  balPanel.add(this.balButton); // add the balance button to this panel
  contentPane.add("North", balPanel); //panel in the north quadrant of the gui

  this.balDisplay = new JTextArea(20, 10); // display the balance
  contentPane.add("Center", this.balDisplay); // in the center of the gui

  JLabel transactionPrompt = new JLabel("Enter the transaction amount: "); // prompt the user to enter transaction amount
  this.transactionField = new JTextField(5); // in this textbox
  this.withdrawButton = new JButton("Withdraw"); // and click either the withdraw button
  this.depositButton = new JButton("Deposit"); // or the deposit button
  this.withdrawButton.addActionListener(this); //both of which will know when they are clicked
  this.depositButton.addActionListener(this);

  JPanel choicePanel = new JPanel(); // the choice panel section of the gui
  choicePanel.add(transactionPrompt); // adds the transaction prompt to this panel
  choicePanel.add(this.transactionField); //adds the textbox for transaction amount to this panel
  choicePanel.add(this.withdrawButton); //adds withdraw button to this panel
  choicePanel.add(this.depositButton); // adds deposit button
  contentPane.add("South", choicePanel); //panel placed in the south quadrant of the gui
  this.withdrawButton.setEnabled(false); //for now the transaction buttons are not enabled
  this.depositButton.setEnabled(false);
}
public void actionPerformed(ActionEvent e) { // action event, when...
  if(e.getSource() == this.balButton) { // the balance button is clicked...
    String balText = this.balField.getText(); // get the text that was entered into the balance textbox, initialize as balText

    // Convert String input into a double using the double wrapper class
    double currentBal = Double.parseDouble(balText); // convert it into a double

    // Display the current balance
    this.balDisplay.setText("Current balance: $" + currentBal); // and display it as the current balance

    // Create the balance object
    this.account = new SimpleAccount(currentBal); // and create a balance object with the current balance

    // Disable balButton so it can't be clicked again
    this.balButton.setEnabled(false);

    // Enable withdraw and deposit buttons
    this.withdrawButton.setEnabled(true);
    this.depositButton.setEnabled(true);
  }
  else if(e.getSource() == this.withdrawButton) { // when withdraw button clicked...
    String transText = this.transactionField.getText(); // get the text entered into the transaction box
    double transaction = Double.parseDouble(transText); // convert it to a double
    account.withdraw(transaction); //do the withdraw method from SimpleAccount
    this.balDisplay.setText("Current balance: $" + account.getBalance()); //and display the new current balance
}
  else if(e.getSource() == this.depositButton) { // when deposit button clicked..
    String transText = this.transactionField.getText(); // get the text entered into the transaction box
    double transaction = Double.parseDouble(transText); // convert it to a double
    account.deposit(transaction); //do the deposit method from SimpleAccount
    this.balDisplay.setText("Current balance: $" + account.getBalance()); // and display the new current balance
}
}


  public static void main(String[] args) { // main method 
    BankAccountGUI bankApp = new BankAccountGUI();
  }
}
