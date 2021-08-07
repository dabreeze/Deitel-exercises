package solution;

// prompt user to enter a number five times
// accept the number and store to a variable
// compare the numbers in the group for the smallest
//compare the numbers for the largest
// display the smallest and the largest

import java.util.Scanner;
public class TwoPointTwoFour
{
    public static void main(String[] args)
    {
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int largest;
        int smallest;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number");
        number1 = input.nextInt();

        System.out.println("Enter Second Number");
        number2 = input.nextInt();

        System.out.println("Enter third Number");
        number3 = input.nextInt();

        System.out.println("Enter Fourth Number");
        number4 = input.nextInt();

        System.out.println("Enter Fifth Number");
        number5 = input.nextInt();

        largest = number1;
        smallest = number1;

        if(number2 > largest)
            largest = number2;
        if(number2 < smallest)
            smallest = number2;

        if(number3 > largest)
            largest = number3;
        if(number3 < smallest)
            smallest = number3;

        if(number4 > largest)
            largest = number4;
        if(number4 < smallest)
            smallest = number4;

        if(number5 > largest)
            largest = number5;
        if(number5 < smallest)
            smallest = number5;


        System.out.printf("Smallest number is %d Largest number is %d", smallest, largest);


    }

}