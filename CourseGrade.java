// Ryan Jones

public class CourseGrade{
  private int midtermExam;
  private int finalExam;
  private double assignments;



  public CourseGrade(int mExam, int fExam, double assign){
    this.midtermExam = mExam;
    this.finalExam = fExam;
    this.assignments = assign;
  }
  public CourseGrade(){
  }

  public int getMidtermExam(){
    return this.midtermExam;
  }

  public int getFinalExam(){
    return this.finalExam;
  }

  public double getAssignments(){
    return this.assignments;
  }

  public void setMidtermExam(int mExam){
    this.midtermExam=mExam;
  }

  public void setFinalExam(int fExam){
    this.finalExam=fExam;
  }

  public void setAssignments(double assign){
    this.assignments=assign;
  }
  public double grade(){
    double total = this.midtermExam*(.20)+this.finalExam*(.30)+this.assignments*(.50);
    return total;
  }
}
