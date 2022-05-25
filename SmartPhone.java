
/**
* Represents a Smartphone.
*
* @author Ryan Jones
*/
public class SmartPhone extends CellPhone{


  /** The operating number */
  private String operatingSystem;


  /**
  * Constructs a Smart Phone object.
  *
  * @param name The name of this phone.
  * @param value The value of this phone.
  * @param pn The phone number.
  * @param cs The cell service.
  * @param os The operating system of the phone.
  */
  public SmartPhone(String name, double value, String pn, String cs, String os){
    super(name, value, pn, cs);
    this.operatingSystem=os;

  }

  /**
  * Sets the operating system of this phone.
  *
  * @param system The operating system of this phone.
  */
  public void setOS(String system){
    this.operatingSystem=system;
  }


  /**
  * Returns the operating system of this phone.
  *
  * @return The operating system of this phone.
  */
  public String getOS(){
    return this.operatingSystem;
  }


  /**
  * Returns a description of this smartphone.
  *
  * @return A description of this smartphone.
  */
  @Override
  public String toString() {
    return "Smart Phone: Name: "+super.getName()+" Value: "+super.getValue() + " Operating System: " + this.operatingSystem + " Phone number: " + super.getNumber() + " Cell Service: " + super.getService();
  }
}
