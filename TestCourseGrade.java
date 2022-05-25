// You need to write the CourseGrade class before running this test program.
// Build command: javac CourseGrade.java TestCourseGrade.java
// Run command: java TestCourseGrade
//Ryan Jones
/**
* CS226 Spring 2022
* Exam 1
* Take-home Problem 1 Test Program
*
* Your CourseGrade class must work with this test class (do not make changes
* to this test class).
*/
public class TestCourseGrade {

  public static void main(String[] args) {
    CourseGrade g1 = new CourseGrade(87, 92, 94.75);
    System.out.println("CourseGrade object g1:");
    printGrades(g1);

    System.out.println();

    CourseGrade g2 = new CourseGrade();
    g2.setMidtermExam(77);
    g2.setFinalExam(82);
    g2.setAssignments(84.33);
    System.out.println("CourseGrade object g2:");
    printGrades(g2);


  }

  private static void printGrades(CourseGrade g) {
    System.out.println("    Midterm = " + g.getMidtermExam());
    System.out.println("    Final = " + g.getFinalExam());
    System.out.println("    Assignments = " + g.getAssignments());
    System.out.println("    Grade = " + g.grade());

  }

}
