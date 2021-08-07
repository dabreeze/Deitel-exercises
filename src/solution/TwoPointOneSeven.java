package solution;

// prompt a user to enter three numbers
//accept the numbers and store to a variable
// add the numbers
// average the numbers
// multiply the numbers
// determine the Smallest and the largest
// Display the sum, average, multiplication
// also display the smallest and the largets

import java.util.Scanner;

public class TwoPointOneSeven
{
    public static void main(String[] args)
    {
        int number1;
        int number2;
        int number3;
        int sum;
        int avg;
        int multiply;

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the First Number");
        number1 = input.nextInt();

        System.out.println("Please Enter the Second Number");
        number2 = input.nextInt();

        System.out.println("Please Enter the Third Number");
        number3 = input.nextInt();

        sum = number1 + number2 + number3;
        avg = sum / 3;
        multiply = number1 * number2 * number3;

        System.out.println("Sum = " + sum);
        System.out.println("Average = "+avg);
        System.out.println("Multiplication = "+multiply);


        if(number1 > number2 && number1 > number3 && number2 >number3)

            System.out.printf("%d Is the Largest and %d Is the Smallest", number1, 				number3);

        if(number1 > number2 && number3> number2 && number1 > number3)

            System.out.printf("%d Is the Largest and %d Is the Smallest", number1, 				number2);

        if(number1 == number2 && number2 > number3)

            System.out.printf("%d Is the Largest and %d Is the Smallest", number1, 				number3);
        if(number1 == number2 && number2 < number3)

            System.out.printf("%d Is the Largest and %d Is the Smallest", number3, 				number1);

        if(number2 == number3 && number2 < number1)

            System.out.printf("%d Is the Largest and %d Is the Smallest", number1, 				number2);


        if(number2 > number3 && number2> number1 && number3 > number1)


            System.out.printf("%d Is the Largest and %d Is the Smallest", number2, 				number1);

        if(number2 > number3 && number2> number1 && number1 > number3)

            System.out.printf("%d Is the Largest and %d Is the Smallest", number2, 				number3);

        if(number2 == number3 && number2 > number1)

            System.out.printf("%d Is the Largest and %d Is the Smallest", number2, 				number1);


        if(number3 > number1 && number3> number2 && number2 > number1)

            System.out.printf("%d Is the Largest and %d Is the Smallest", number3, 				number1);

        if(number3 > number2 && number3> number1 && number1 > number2)

            System.out.printf("%d Is the Largest and %d Is the Smallest", number3, 				number2);

        if(number3 == number1 && number3 > number2)

            System.out.printf("%d Is the Largest and %d Is the Smallest", number3, 				number2);




        if(number3 == number1 && number1 == number2)


            System.out.println("All numbers are equal");

    }

}