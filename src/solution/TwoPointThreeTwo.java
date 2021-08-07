package solution;

// A program that inputs 5 numbers determines negetive values, posetive values and number of zero input

import java.util.Scanner;
public class TwoPointThreeTwo
{
    public static void main(String[] args)
    {
        int number;
        int number2;
        int number3;
        int number4;
        int number5;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number: ");
        number = input.nextInt();

        System.out.println("Enter Number: ");
        number2 = input.nextInt();
        System.out.println("Enter Number: ");
        number3 = input.nextInt();
        System.out.println("Enter Number: ");
        number4 = input.nextInt();
        System.out.println("Enter Number: ");
        number5 = input.nextInt();

        if(number < 0)

            System.out.printf("%d is a negetive Value: \n", number);
        if(number > 0)
            System.out.printf("%d is a Positive Value: \n", number);

        if(number == 0)
            System.out.printf("%d is a zero value: \n", number);

        if(number2 < 0)

            System.out.printf("%d is a negetive Value: \n", number2);
        if(number2 > 0)
            System.out.printf("%d is a Positive Value: \n", number2);

        if(number2 == 0)
            System.out.printf("%d is a zero value: \n", number2);

        if(number3 < 0)

            System.out.printf("%d is a negetive Value: \n", number3);
        if(number3 > 0)
            System.out.printf("%d is a Positive Value: \n", number3);

        if(number3 == 0)
            System.out.printf("%d is a zero value: \n", number3);

        if(number4 < 0)

            System.out.printf("%d is a negetive Value: \n", number4);
        if(number4 > 0)
            System.out.printf("%d is a Positive Value: \n", number4);

        if(number4 == 0)
            System.out.printf("%d is a zero value: \n", number4);

        if(number5 < 0)

            System.out.printf("%d is a negetive Value: \n", number5);
        if(number5 > 0)
            System.out.printf("%d is a Positive Value: \n", number5);

        if(number5 == 0)
            System.out.printf("%d is a zero value: \n", number5);
    }
}