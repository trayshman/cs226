
/**
* Represents a Correctable Graded Item.
*
* @author Ryan Jones
*/
public class CorrectableGradedItem extends GradedItem{

  /** The original grade */
  private int originalGrade;

  /** Whether the assignment has been corrected or not */
  private boolean corrected;

  /**
  * Constructs a Correctable Graded Item object.
  *
  * @param g The grade.
  * @param f The files.
  */
  public CorrectableGradedItem(int g, String[] f){
    super(g,f);
    this.originalGrade=g;
    boolean corrected = false;
  }

  /**
  * Returns whether or not the item has been corrected.
  *
  * @return The value of corrected.
  */
  public boolean isCorrected(){
    return corrected;
  }

  /**
  * Returns the original grade of the item.
  *
  * @return The original grade of the correctable graded item.
  */
  public int getOriginalGrade(){
    return this.originalGrade;
  }
  /**
  * updates the grade and files of the assignment, then sets corrected to true.
  *
  * @param ng The new grade.
  * @param nf the new files
  */
  public void correction(int ng, String[] nf){
    super.setGrade(ng);
    super.setFiles(nf);
    this.corrected = true;
  }


  /**
  * Returns a description of this correctable graded item.
  *
  * @return A description of this correctable graded item.
  */
  @Override
  public String toString() {
    return "Correctable Graded Item: Grade: "+super.getGrade()+" files: "+ super.getFiles() + " Original Grade: " + this.getOriginalGrade();
  }

}
