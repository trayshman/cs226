/**
* CS226 Spring 2022 Individual Assignment 1
* Program that tests the TaxWhiz class.
* Your TaxWhiz class must work with an unmodified version of this test program.
*
* Command for building the program: javac TaxWhiz.java TestTaxWhiz.java
* Command for running the program: java TestTaxWhiz
*
* @author Christine Reilly
*/
public class TestTaxWhiz {
  public static void main(String[] args) {
    double myTax;

    // Creating multiple TaxWhiz objects using sales tax rates in various NY counties
    // https://www.tax-rates.org/new_york/sales-tax-by-county
    TaxWhiz taxSaratoga = new TaxWhiz(0.07);
    TaxWhiz taxErie = new TaxWhiz(0.0875);

    // Calculate the sales tax for different purchase amounts in different counties

    myTax = taxSaratoga.calcTax(118);
    System.out.println("In Saratoga County, the tax on a $118 purchase is $" + myTax);

    myTax = taxErie.calcTax(118);
    System.out.println("In Erie County, the tax on a $118 purchase is $" + myTax);

    myTax = taxSaratoga.calcTax(56.78);
    System.out.println("In Saratoga County, the tax on a $56.78 purchase is $" + myTax);

    myTax = taxErie.calcTax(56.78);
    System.out.println("In Erie County, the tax on a $56.78 purchase is $" + myTax);
  }
}
