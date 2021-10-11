package chapterFour;
// user enters the 10 different sales units
// check if the first unit is the largest
// chech the second till the end for the largest number
// display the largest number
import java.util.Scanner;
public class FourPointOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int largestNumber = 0;
        int counter = 1;
        int secondNUmber=0;
        System.out.println("enter number 1");
        largestNumber = input.nextInt();

        for (int i = 1; i <= 8; i++) {

            System.out.println("enter number "+(i+1));
            secondNUmber = input.nextInt();
            if (largestNumber < secondNUmber) {
                largestNumber = secondNUmber;

            }
                System.out.println("Largest Number:" + largestNumber);




        }
    }
}