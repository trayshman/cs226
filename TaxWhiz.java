

public class TaxWhiz {
  private double taxRate;


  public TaxWhiz(double rate){
    this.taxRate = rate;
  }

  public double calcTax(double purchase) {
    return purchase*taxRate;
  }
}
