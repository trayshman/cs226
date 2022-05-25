import java.util.*;
/**
* Examples of sorting and searching arrays and lists of objects.
*
* @author Christine Reilly
*/
public class SortSearchHashMap {

  /**
  * Example of sorting an array of objects then using binary search
  */
  public void arrayExample() {
    CompProduct[] products = new CompProduct[6]; // created an array with 6 objects in it
    products[0] = new CompProduct("pencil", 0.56);
    products[1] = new CompProduct("notebook", 3.45);
    products[2] = new CompProduct("calculator", 15.87);
    products[3] = new CompProduct("pen", 3.89);
    products[4] = new CompProduct("ruler", 5.31);
    products[5] = new CompProduct("pen", 2.11);

    System.out.println("\nArray Example...");

    System.out.println("Before sorting: ");
    printArray(products); //prints unsorted array

    // Sort the items in the array
    Arrays.sort(products); // sorts array

    System.out.println("\nAfter sorting: ");
    printArray(products); // prints after sorting

     System.out.println("\nUsing binary search:");
    CompProduct find = new CompProduct("notebook", 3.45);
    int foundIndex = Arrays.binarySearch(products, find);
    System.out.println(find + " is at index " + foundIndex);
  }

  /**
  * Example of sorting a LinkedList of objects
  */
  public void listExample() {
    LinkedList<CompProduct> products = new LinkedList<CompProduct>();
    products.add(new CompProduct("pencil", 0.56));
    products.add(new CompProduct("notebook", 3.45));
    products.add(new CompProduct("calculator", 15.87));
    products.add(new CompProduct("pen", 3.89));
    products.add(new CompProduct("ruler", 5.31));
    products.add(new CompProduct("pen", 2.11));

    System.out.println("\nLinkedList Example...");

    System.out.println("Before sorting: ");
    printArray(products.toArray());

    // Sort the items in the list
    Collections.sort(products); // sorts LinkedList

    System.out.println("\nAfter sorting: ");
    printArray(products.toArray());

  }

  private void printArray(Object[] arr) {
    for(Object a : arr) {
      System.out.println(a);
    }
  }

  /**
  * Example of using a HashMap
  */
  public void hashMapExample() {
    HashMap<String,CompProduct> productMap = new HashMap<String,CompProduct>();
    productMap.put("pencil", new CompProduct("pencil", 0.56));
    productMap.put("notebook", new CompProduct("notebook", 3.45));
    productMap.put("calculator", new CompProduct("calculator", 15.87));
    productMap.put("pen", new CompProduct("pen", 3.89));
    productMap.put("ruler", new CompProduct("ruler", 5.31));

    System.out.println("\nHashMap Example...");

    // If the key was previously in the map, the old mapping is replaced with
    // the new mapping
    System.out.println("Before putting second pen: " + productMap.get("pen") + "; map size = " + productMap.size());
    productMap.put("pen", new CompProduct("pen", 2.11));
    System.out.println("After putting second pen: " + productMap.get("pen") + "; map size = " + productMap.size());

    System.out.println("\nContains key ruler: " + productMap.containsKey("ruler"));
    System.out.println("Contains key eraser: " + productMap.containsKey("eraser"));

    

  } // end of hashMapExample method

  public static void main(String[] args) {
    SortSearchHashMap s = new SortSearchHashMap();

    s.arrayExample();

    System.out.println("-----------------------");

    s.listExample();

    System.out.println("-----------------------");

    s.hashMapExample();
  }
}
