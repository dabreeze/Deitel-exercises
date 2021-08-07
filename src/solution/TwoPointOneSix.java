package solution;

// prompt a user to enter two integer numbers
// accept the two numbers and store to a variable
// compare the two numbers for the largest
// display the largest number

import java.util.Scanner;
public class TwoPointOneSix
{
    public static void main(String[] args)
    {
        int number1;
        int number2;

        Scanner input = new Scanner(System.in);

        System.out.println("please Enter the First Number:");
        number1 = input.nextInt();

        System.out.println("please Enter the Second Number:");
        number2 = input.nextInt();

        if(number1 == number2)

            System.out.println("These numbers are equal.");
        if(number1 > number2)

            System.out.println( number1 +" is Larger");
        if(number1 < number2)

            System.out.println(number2 +" is larger");

    }

}