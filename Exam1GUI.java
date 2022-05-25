// Build command: javac CloseableFrame.java Exam1GUI.java
// Run command: java Exam1GUI

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/** RYAN JONES
* CS226 Exam 1 Take Home Problem 3
*
* A graphical user interface.
*
* @author PUT YOUR NAME HERE
*/
public class Exam1GUI extends CloseableFrame implements ActionListener {

  private JTextField aField;
  private JButton aButton;
  private JLabel number;

  /**
  * Constructor creates an Exam1GUI object.
  */
  public Exam1GUI() {
    this.buildGUI();
    super.setVisible(true);
  }

  /**
  * Creates and places objects into the graphical user interface.
  */
  private void buildGUI() {
    super.setSize(400, 150);
    super.setTitle("Exam 1 GUI");

    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());

    JLabel aLabel = new JLabel("Enter a floating point number:");
    this.aField = new JTextField(10);
    JPanel aPanel = new JPanel();
    aPanel.add(aLabel);
    aPanel.add(this.aField);
    contentPane.add("North", aPanel);

    this.aButton = new JButton("Click here to set the number");

    JPanel bPanel = new JPanel();
    bPanel.add(this.aButton);
    contentPane.add("Center", bPanel);
    this.aButton.addActionListener(this);

    JLabel bLabel = new JLabel("Your number multplied by 2 is:");
    this.number = new JLabel("?????");

    JPanel cPanel = new JPanel();
    cPanel.add(bLabel);
    cPanel.add(this.number);
    contentPane.add("South", cPanel);


  }

  /**
  * Implement actions to perform when button is clicked
  */
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == this.aButton) {
      String numText = this.aField.getText();

      double value = Double.parseDouble(numText);

      value *= 2;
      this.number.setText(Double.toString(value));
    }
  }


  public static void main(String[] args) {
    new Exam1GUI();
  }
}
