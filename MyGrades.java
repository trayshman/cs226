/**
* Represents my graded assignments in a course.
*
* @author Ryan Jones
*/
public class MyGrades {

  // EXAM 2: DO NOT ALTER INSTANCE OR CLASS VARIABLES

  /** An array of GradedItem objects */
  private GradedItem[] grades;

  /**
  * EXAM 2: DO NOT ALTER THIS METHOD
  * Creates a MyGrades object. Saves a reference to the parameter array.
  *
  * @param g Array of graded item objects.
  */
  public MyGrades(GradedItem[] g) {
    this.grades = g;

  }

  /**
  * EXAM 2: WRITE THIS METHOD
  * Prints the array of GradedItem objects.
  */
  public void print() {
    System.out.println("My Graded Items: \n");
    for (int i=0; i<grades.length; i++){ // for each graded item in the array
      if (grades[i] instanceof CorrectableGradedItem){ // If it's an instance of CorrectableGradedItem
        CorrectableGradedItem godo = (CorrectableGradedItem)grades[i]; //cast to a correctablegraded
        System.out.println(godo.toString()); // no idea why toString isn't working for the file array
      }
      else if (grades[i] instanceof GradedItem) { //same but if just regular gradeditem
        GradedItem godo = (GradedItem)grades[i];
        System.out.println(godo.toString()); //file array still doesn't work
      }
    }
  }


  /**
  * EXAM 2: WRITE THIS METHOD
  * Prints the graded items that are correctable. Correctable graded items
  * are objects of the CorrectableGradedItem class and have not yet been corrected.
  */
  public void remindToCorrect() {
    System.out.println("I could submit corrections for: ");
    for (int i=0; i<grades.length; i++){ //for each graded item in the array
      if (grades[i] instanceof CorrectableGradedItem){ // if the item is an instance of CorrectableGradedItem
        CorrectableGradedItem god = (CorrectableGradedItem)grades[i]; //casts it to CorrectableGradedItem
        if (god.isCorrected()==false){ // if corrected is false
          System.out.print(god+"\n"); // it prints it
      }
    }
  }
}

  /**
  * EXAM 2: WRITE THIS METHOD
  * Updates the correctable graded item objects that have a grade below the
  * specified limit with information about the corrections. This method uses the
  * same definition of correctable graded item as used in the remindToCorrect method.
  *
  * Half of the points lost in the original submission (assuming a maximum grade
  * of 100) are added to the original grade to compute the corrected grade.
  *
  * The names of each file in the file list from the original submission is
  * modified by appending "C_" to the front of the file name.
  *
  * The correction method is used to update the graded item with this information.
  *
  * @param limit Correctable graded item objects with a grade lower than this value will be updated.
  */
  public void correctAllBelow(int limit) {
    for (int i=0; i<grades.length; i++){ // for each item in the array
      if (grades[i] instanceof CorrectableGradedItem){ // if it's an instance of CorrectableGradedItem
        if (grades[i].getGrade()<limit){ // with a grade lower than the limit
          String[] newfiles = grades[i].getFiles(); // creates a String array called new files and sets it to be the files of that specific grade item
          for (int fil=0; fil<newfiles.length; fil++){ //for each file in the item
            newfiles[fil]="C_"+newfiles[fil]; //each file is now C_+it's original file name
          }
          CorrectableGradedItem go = (CorrectableGradedItem)grades[i]; //cast as CorrectableGradedItem
          go.correction(go.getGrade()+((100-go.getGrade())/2),newfiles); // correction method,
          grades[i]=go; //replaces the object in the array with the corrected item
        }
      }
    }
  }

  /**
  * EXAM 2: DO NOT ALTER THIS METHOD
  * main method creates and uses a MyGrades object.
  */
  public static void main(String[] args) {

    // Create an array of GradedItem objects
    GradedItem[] someGrades = new GradedItem[5];

    // Creating objects to add to the array
    String[] files0 = {"TaxWhiz.java", "screen1.jpg", "screen2.jpg"};
    someGrades[0] = new CorrectableGradedItem(99, files0);

    String[] files1 = {"LunarLander.java", "LanderUML.pdf"};
    someGrades[1] = new CorrectableGradedItem(93, files1);

    String[] files2 = {"BankAccountConsole.java", "BankAccountGUI.java"};
    someGrades[2] = new CorrectableGradedItem(86, files2);

    String[] files3 = {"Dog.java", "DogOwner.java", "UI.java", "UML.pdf"};
    someGrades[3] = new GradedItem(88, files3);

    String[] files4 = {"StuffUML.pdf", "Bag.java", "Backpack.java", "MyStuff.java"};
    someGrades[4] = new CorrectableGradedItem(83, files4);

    // Creating a MyGrades object and calling its methods
    MyGrades mg = new MyGrades(someGrades);
    mg.print();
    System.out.println();
    mg.remindToCorrect();
    System.out.println();

    System.out.println("Correcting correctable assignments with grade below 90.");
    mg.correctAllBelow(90);
    mg.print();

    System.out.println();
    mg.remindToCorrect();

  }
}
