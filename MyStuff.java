/**
* Console interface for my stuff
*
* @author Ryan Jones
*/
public class MyStuff {

  /** An array of the items I own */
  PropertyItem[] stuff;

  /**
  * Creates an array object to hold 5 PropertyItems (the stuff array).
  * Puts a PropertyItem object into each element of the stuff array.
  */
  public MyStuff() {
    this.stuff = new PropertyItem[5];
    stuff[0]=new SmartPhone("iPhone7", 350, "1234567891", "Verizon", "iOS");
    stuff[1]=new SmartPhone("Samsung Galaxy s7", 500, "9995438576", "T-Mobile", "Android OS");
    stuff[2]=new SmartPhone("iPhoneX", 950, "4766432666", "Sprint", "iOS");
    stuff[3]=new CellPhone("Nokia 2720", 188, "7454749999", "Mint");
    stuff[4]=new CellPhone("TCL Flip Pro", 170, "1019344547", "Verizon");

  }

  /**
  * Prints the contents of the stuff array.
  */
  public void printStuff() {
    for(int i = 0; i < this.stuff.length; i++){
      System.out.println(stuff[i]);
  }
}

  /**
  * Returns the total value of the items in the stuff array.
  *
  * @return The total value of the items in the stuff array.
  */

  public double totalValue() {
    double total=0;
    for(int i = 0; i < this.stuff.length; i++){
      total+=stuff[i].getValue();
    }
    return total;
  }

  /**
  * Counts the number of items in the stuff array that fall under various categories.
  * Uses the most specific category for this count.
  * Prints the count of items in each category.
  */
  public void printCategoryCount() {
    int smartcount=0;
    int cellcount=0;
    for(int i = 0; i < this.stuff.length; i++){
      if(stuff[i] instanceof SmartPhone) {
        smartcount+=1;
      }
      else{
        cellcount+=1;
      }

    }
    System.out.println("Number of Cellphones: "+cellcount+" Number of Smartphones: "+smartcount);
  }

  /**
  * Program execution begins at this main method.
  *
  * Independent Assignment 4: do not alter the main method.
  */
  public static void main(String[] args) {
    MyStuff m = new MyStuff();

    m.printStuff();
    System.out.println();

    double v = m.totalValue();
    System.out.println("The total value of my items is: $" + v);
    System.out.println();

    m.printCategoryCount();
  }
}
