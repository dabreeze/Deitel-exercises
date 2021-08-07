package solution;

// A program that seperates five numbers using three white spaces
// promt a user to enter numbers
// accept those numbers
// stores the numbers
// display those numbers with spaces

import java.util.Scanner;
public class TwoPointThirty
{
    public static void main(String[] args)
    {
        int number;
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int fourthNumber;
        int fifthNumber;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter five Numbers: ");
        number = input.nextInt();

        firstNumber = number / 10000;
        secondNumber = number % 10000/ 1000;
        thirdNumber = number % 10000% 1000 / 100;
        fourthNumber = number % 10000% 1000 % 100 / 10;
        fifthNumber = number % 10000 % 1000 % 100 % 10;

        System.out.printf("%d %d %d %d %d", firstNumber,secondNumber, thirdNumber, fourthNumber, fifthNumber );







        //if(number){
        //number.append(" ");
        //}
        //System.out.print(number);

        //System.out.format("%4d; System.out.format("%3d); System.out.format("%3d"));




    }

}