package chapterTwo;

// prompt a user a enter a number
// accept a number and store it
// compare these numbers for even number
//compare these numbers for odd number
// display the odd and even number

import java.util.Scanner;
public class TwoPointTwoFive
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number1;
        int evenNumber;
        int oddNumber;


        System.out.println("Enter Number");
        number1 = input.nextInt();

        evenNumber = number1 % 2;

        if(evenNumber == 0)

            System.out.printf("%d is Even", number1);

        if(evenNumber != 0)
            System.out.printf("%d is Odd", number1);

    }

}