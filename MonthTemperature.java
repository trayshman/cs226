/**
* Uses a two-dimensional array to work with temperature data for every day
* of a year.
*/
import java.util.Random;

public class MonthTemperature {

  /** Two-dimensional array for temperatures of every day of every month of the year */
  int[][] monthTemps;

  /** A random number object */
  private Random rand;

  /**
  * Constructor initializes the two-dimensional array of temperatures and the
  * Random object.
  */
  public MonthTemperature() {
    rand = new Random();

    // Create the outer array: one element for each month of the year
    monthTemps = new int[12][];

    // Initialize each row of the array
    monthTemps[MonthType.JAN.getTypeCode()] = new int[31];
    monthTemps[MonthType.FEB.getTypeCode()] = new int[28];
    monthTemps[MonthType.MAR.getTypeCode()] = new int[31];
    monthTemps[MonthType.APR.getTypeCode()] = new int[30];
    monthTemps[MonthType.MAY.getTypeCode()] = new int[31];
    monthTemps[MonthType.JUN.getTypeCode()] = new int[30];
    monthTemps[MonthType.JUL.getTypeCode()] = new int[31];
    monthTemps[MonthType.AUG.getTypeCode()] = new int[31];
    monthTemps[MonthType.SEP.getTypeCode()] = new int[30];
    monthTemps[MonthType.OCT.getTypeCode()] = new int[31];
    monthTemps[MonthType.NOV.getTypeCode()] = new int[30];
    monthTemps[MonthType.DEC.getTypeCode()] = new int[31];

    // Fill each month with random values between 0 and 99
    for(int i = 0; i < monthTemps.length; i++) {
      for(int j = 0; j < monthTemps[i].length; j++) {
        monthTemps[i][j] = rand.nextInt(100);
      }
    }
  } // end of constructor

  /**
  * Calcualtes the average temperature for the year.
  * Example of iterating over all values in this jagged 2D array.
  *
  * @return The average temperature for the year.
  */
  public double yearAvg() {
    int sum = 0; // The sum of the temperatures for the year.
    int count = 0; // The number of values.

    // Loop over each month of the year (each row of the 2D array)
    for(int i = 1; i < monthTemps.length; i++) {
      // Loop over each day of the current month (each item in the current row)
      for(int j = 0; j < monthTemps[i].length; j++) {
        sum += monthTemps[i][j];
      }
      count += monthTemps[i].length;
    }

    double avg = (double)sum / (double)count;
    return avg;
  }

  /**
  * Calculates the average tempearture for the given month.
  * Example of iterating over one row of the 2D array.
  *
  * @param m The desired month.
  * @return The average temperature for the given month.
  */
  public double monthAvg(MonthType m) {
    int sum = 0; // The sum of the temperatures for the month

    // Loop through the temperatures for each day of the given month
    for(int i = 0; i < monthTemps[m.getTypeCode()].length; i++) {
      sum += monthTemps[m.getTypeCode()][i];
    }

    double avg = (double)sum / (double)monthTemps[m.getTypeCode()].length;

    return avg;
  }


  public static void main(String[] args) {
    MonthTemperature mt = new MonthTemperature();

    System.out.println("July enum: " + MonthType.JUL);

    double yAvg = mt.yearAvg();
    System.out.println("Average daily temperature over the entire year: " + yAvg);

    double mAvg = mt.monthAvg(MonthType.JUL);
    System.out.println("Average daily temperature during the month of " + MonthType.JUL + ": " + mAvg);

    mAvg = mt.monthAvg(MonthType.DEC);
    System.out.println("Average daily temperature during the month of December " + MonthType.DEC + ": " + mAvg);

  }

}
