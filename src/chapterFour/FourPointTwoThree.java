package chapterFour;

import java.util.Scanner;

public class FourPointTwoThree {

// user enters the 10 different sales units
// check if the first unit is the largest
// check the second till the end for the largest number
// display the largest number

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int number=0;
            int thirdNumber=0;
            int counter = 1;
            int secondNUmber=0;
            int secondLargest=0;
            int largestNumber=0;




//            System.out.println("enter number 1");
//            number = input.nextInt();
            for (int i = 1; i <= 8; i++) {

                System.out.println("enter number "+i);
                number = input.nextInt();
                if (number > largestNumber ) {
                    secondLargest = largestNumber;
                    largestNumber = number;
                }else if(number > secondLargest){
                    secondLargest = number;
                }


            }
                System.out.println("Largest Number is: "+ largestNumber);
                System.out.println("second Largest Number is: "+ secondLargest);






        }
//            System.out.println("Largest Number:" + thirdNumber);
//            System.out.println("Second Largest Number is: "+ secondLargest);


}
