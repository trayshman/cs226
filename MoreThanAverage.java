import java.util.Random;

public class MoreThanAverage {


  int[] numbers;



  public MoreThanAverage(int size, int range) {

    this.numbers = new int[size];

    // Fill array with random numbers
    Random rand = new Random();

    for(int i = 0; i < this.numbers.length; i++){
      this.numbers[i] = rand.nextInt(range); //range is upper limit exclusive, up to but not including
    }



  }

  public double average() {
    int sum = 0; // sum of numbers in the array

    // use for each loop to get each array element
    // add each array element to the sum
    for(int n : this.numbers) {
      sum += n;
    }

    double average = sum / (double)this.numbers.length;

    return average;
  }

  public int countAboveAverage() {

    int count = 0;
    double a = this.average();
    for(int n: this.numbers) {
      if(n > a){
        count++;
      }
    }

    return count;
  }



  public static void main(String[] args){

    MoreThanAverage mta = new MoreThanAverage(10000, 50000);

    System.out.println("The average is: " + mta.average());

    System.out.println(mta.countAboveAverage() + " of the numbers have a value above average");
  }
}
