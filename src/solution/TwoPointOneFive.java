package solution;

// prompt user to enter two intiger numbers
// Accept number from user
// store it to to a variable
// sum up the two numbers
// show difference of the two numbers
// multiply the two numbers
// divide the two numbers
// display the sum, difference ,multiplication and division of the two numbers

import java.util.Scanner;

public class TwoPointOneFive
{
    public static void main(String[] args)
    {
        int number1;
        int number2;
        int sum;
        int difference;
        int multiply;
        int divide;

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the First Number:");
        number1 = input.nextInt();

        System.out.println("Please Enter the Second Number:");
        number2 = input.nextInt();

        sum = number1 + number2;
        difference = number1 - number2;
        multiply = number1 * number2;
        divide = number1 / number2;

        System.out.printf("The Sum of %d And %d is %d: \n", number1, number2, sum);
        System.out.printf("The difference between %d And %d is %d: \n", number1, number2, difference);
        System.out.printf("The multiplication of %d And %d is %d: \n", number1, number2, multiply);
        System.out.printf("The division of %d And %d is %d: \n", number1, number2, divide);

        System.out.println("Thank You!");
    }

}