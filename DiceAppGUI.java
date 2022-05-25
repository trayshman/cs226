import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class DiceAppGUI extends CloseableFrame implements ActionListener {


  // Random object
  private Random rand;

  // Two Die objects
  private Die d1;
  private Die d2;

  // Number of sides entered by user
  private JTextField sidesField;

  // Button to click to enter sides
  private JButton sidesButton;

  // Display number of sides
  private JTextArea sidesDisplay;

  // Button to roll the dice
  private JButton rollButton;

  // Display roll of d1
  private JLabel d1Roll;

  // Display roll of d2
  private JLabel d2Roll;

  // Constructor creates the GUI window
  public DiceAppGUI(Random r) {
    this.rand = r;


    // Use a method to create the GUI objects and layout
    this.buildGUI();

    //Make the GUI visible
    super.setVisible(true);
  }

// Creates GUI objects and layout
private void buildGUI() { //private so only other methods in this instance can call this


  // Set up the JFrame
  super.setSize(500, 500);
  super.setTitle("Dice Roller");

  //Create a content pane with a certain layout
  Container contentPane = super.getContentPane();
  contentPane.setLayout(new BorderLayout());

  // Create objects for getting number of sides
  JLabel sidesPrompt = new JLabel("How many sides do the dice have?");
  this.sidesField = new JTextField(5);
  this.sidesButton = new JButton("Click here to set the sides");
  this.sidesButton.addActionListener(this);

  // Put sides objects into a JPanel, then add the JPanel to the contentPane
  JPanel sidesPanel = new JPanel();
  sidesPanel.add(sidesPrompt);
  sidesPanel.add(this.sidesField);
  sidesPanel.add(this.sidesButton);
  contentPane.add("North", sidesPanel);

  // Create text area to display number of sides
  this.sidesDisplay = new JTextArea(20, 10);
  contentPane.add("Center", this.sidesDisplay);

  // Create objects for dice and roll button
  this.rollButton = new JButton("Roll!");
  this.rollButton.addActionListener(this);
  this.d1Roll = new JLabel("Die1");
  this.d2Roll = new JLabel("Die2");

  // Put the die into a JPanel and add to the content pane
  JPanel dicePanel = new JPanel();
  dicePanel.add(this.rollButton);
  dicePanel.add(this.d1Roll);
  dicePanel.add(this.d2Roll);
  contentPane.add("South", dicePanel);
  this.rollButton.setEnabled(false);

} // end of BuildGUI method

public void actionPerformed(ActionEvent e) {
  if(e.getSource() == this.sidesButton) {

    // Get the user input for number of sides
    String sidesText = this.sidesField.getText();

    // Convert String input into an int using the Integer wrapper class
    int numSides = Integer.parseInt(sidesText);

    // Display the number of sides
    this.sidesDisplay.setText("Dice have " + numSides + " sides");

    // Create the two die objects
    d1 = new Die(numSides, this.rand);
    d2 = new Die(numSides, this.rand);

    // Disable sidesButton so it can't be clicked again
    this.sidesButton.setEnabled(false);

    // Enable roll button
    this.rollButton.setEnabled(true);
  } else if(e.getSource() == this.rollButton) {
    // roll button is clicked

    // roll the dice
    int roll1 = d1.roll();
    int roll2 = d2.roll();

    // Display the values rolled
    this.d1Roll.setText(Integer.toString(roll1));
    this.d2Roll.setText(Integer.toString(roll2));

  }
}


public static void main(String[] args) {
  // Create a random object
  Random rand = new Random();

  // Create a DiceAppConsole object
  DiceAppGUI diceApp = new DiceAppGUI(rand);
}
}
