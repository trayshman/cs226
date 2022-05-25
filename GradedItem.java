
/**
* Represents a Graded Item.
*
* @author Ryan Jones
*/
public class GradedItem{

  /** The grade */
  private int grade;
  /** The files the student uploaded for the assignment*/
  private String[] files;


  /**
  * Constructs a Graded Item object.
  *
  * @param g The grade.
  * @param f The files.
  */
  public GradedItem(int g, String[] f){
    this.grade=g;
    this.files=f;
  }

  /**
  * Returns the grade of the graded item.
  *
  * @return The grade of the graded item.
  */
  public int getGrade(){
    return this.grade;
  }

  /**
  * Sets the grade of this graded item.
  *
  * @param g The grade of this graded item.
  */
  protected void setGrade(int g){
    this.grade=g;
  }

  /**
  * Returns the uploaded files.
  *
  * @return The uploaded files.
  */
  public String[] getFiles(){
    return this.files;
  }

  /**
  * Sets the uploaded files of this graded item.
  *
  * @param f The uploaded files of this graded item.
  */
  protected void setFiles(String[] f){
    this.files=f;
  }


  /**
  * Returns a description of this graded item.
  *
  * @return A description of this graded item.
  */
  @Override
  public String toString() {
    return "Graded Item: Grade: "+this.getGrade()+" files: "+this.getFiles();
  }
}
