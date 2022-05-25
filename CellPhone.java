
/**
* Represents a Cell Phone.
*
* @author Ryan Jones
*/
public class CellPhone extends PropertyItem{

  /** The phone number */
  private String phoneNumber;

  /** The Cell Service */
  private String cellService;



  /**
  * Constructs a Cell Phone object.
  *
  * @param name The name of this phone.
  * @param value The value of this phone.
  * @param pn The phone number.
  * @param cs The cell service.
  */
  public CellPhone(String name, double value, String pn, String cs){
    this.phoneNumber=pn;
    this.cellService=cs;
    super.setName(name);
    super.setValue(value);
  }


  /**
  * Sets the phone number of this phone.
  *
  * @param num The phone number of this phone.
  */
  public void setNumber(String num){
    this.phoneNumber=num;
  }


  /**
  * Sets the cell service of this phone.
  *
  * @param service The cell service of this phone.
  */
  public void setService(String service){
    this.cellService=service;
  }

  /**
  * Returns the phone number of this phone.
  *
  * @return The phone number of this phone.
  */
  public String getNumber(){
    return this.phoneNumber;
  }

  /**
  * Returns the cell service of this phone.
  *
  * @return The cell service of this phone.
  */
  public String getService(){
    return this.cellService;
  }


  /**
  * Returns a description of this cellphone.
  *
  * @return A description of this cellphone.
  */
  @Override
  public String toString() {
    return "Cellphone: Name: "+super.getName()+" Value: "+super.getValue() + " Phone Number:  " + this.getNumber()+ " Cell Service: "+this.getService();
  }
}
