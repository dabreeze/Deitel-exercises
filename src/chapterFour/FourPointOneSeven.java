package chapterFour;
//import java.sql.SQLOutput;
import java.util.Scanner;
// use sentinel controlled loop to input correct millage
// Accept the value of the number of gallons used
// Accept miles driven from the driver
// store as integer values
// calculate and display miles per gallon for each trip
// print combined miles per gallon obtained for all trip up to the current trip
// calculate the average of all trips and display as floating point

public class FourPointOneSeven {

    public static void main(String[] args){
        int totalMiles = 0;
        int individualMiles = 0;
        int totalGallons = 0;
        int individualGallons = 0;
        int mileCount= 1;
        int galCount = 1;
        double avgMile= 0;
        double avgGal = 0;
        Scanner driverInput = new Scanner(System.in);

        while(individualMiles != -1){
        System.out.println("Enter Miles or -1 to terminate: ");

            System.out.print("Miles"+mileCount++);
            individualMiles = driverInput.nextInt();

            System.out.println("Enter number of Gallons or -1 to terminate: ");
            System.out.print("Gallon" +
                    galCount++);
            individualGallons = driverInput.nextInt();

            totalGallons = totalGallons + individualGallons;
            avgGal = (double) totalGallons / galCount;


            totalMiles = totalMiles+ individualMiles;
            avgMile = (double) totalMiles / mileCount;

        } System.out.println("Total Gallons used: "+ totalGallons);

        System.out.println("Total Miles used: "+totalMiles);

        System.out.println("Average miles: " + avgMile);
        System.out.println("Average gallon: "+ avgGal);




    }

}
