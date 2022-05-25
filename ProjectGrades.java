// Build command: javac ProjectGrades.java
// Run command: java ProjectGrades

/**
* CS226 Exam 1 Take Home Problem 2
*
* Represents one CS226 student's grades on the programming projects.
*
* Ryan Jones
*/
public class ProjectGrades {

  /** Grade on Programming Project 1 */
  int proj1;

  /** Grade on Programming Project 2 */
  int proj2;

  /** Number of programming projects */
  int numProjects;

  /**
  * Constructor initializes the instance variables.
  *
  * @param one Student's grade on Programming Project 1
  * @param two Student's grade on Programming Project 2
  * @param num Number of programming projects
  *
  * EXAM 1 [5 points]: This constructor contains errors.
  * Edit multiple lines of code in this constructor to correct these errors.
  */
  public ProjectGrades(int one, int two, int num) {

    this.proj1 = one;
    this.proj2 = two;
    this.numProjects = num;

  }

  /**
  * Returns the student's average project grade.
  *
  * @return The student's average project grade.
  *
  * EXAM 1 [5 points]: This method contains one line of code with an error.
  * You may only alter the one marked line of code in this method.
  * You must use variables in the computation (you may not use literal numbers).
  * Do not add more lines of code or make changes in other parts of this method
  * or class as part of fixing this error.
  */
  public double projectAverage() {

    int sum = this.proj1 + this.proj2;

    // EXAM 1: Edit the following one line of code to fix the error in this method.
    // You must use variables in this computation (you may not use literal numbers).
    double average = (double) sum / this.numProjects;

    return average;
  }

  /**
  * Returns a string representation of this student's project grades.
  *
  * @return A string representation of this student's project grades.
  *
  * EXAM 1 [5 points]: This method contains errors.
  * Alter two lines of code to fix these errors.
  */
  @Override
  public String toString() {

    String info = "Grades on " + this.numProjects + " projects: ";
    info += this.proj1 + "; " + this.proj2;

    return info;
  }

  /**
  * Main method creates and uses a ProjectGrades object.
  *
  * EXAM 1: There are no errors in the main method.
  * Do not make changes to the main method.
  */
  public static void main(String[] args) {
    ProjectGrades myGrades = new ProjectGrades(84, 91, 2);
    System.out.println(myGrades);
    System.out.println("My project average: " + myGrades.projectAverage());
  }

}
