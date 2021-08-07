package solution;

// prompt a user to enter number
// accept and store the number
// check if the first number is a multiple of the second number
// display the result of the number
// display if its multiple

import java.util.Scanner;

public  class TwoPointTwoSix
{

    public static void main(String[] args)
    {
        int number1;
        int number2;
        int isNumberMultiple;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Number");
        number1 = input.nextInt();

        System.out.println("Enter another Number");
        number2 = input.nextInt();

        isNumberMultiple = number2 % number1;
        //isNumberMultiple = number1 % ;


        if(isNumberMultiple == 0)
            System.out.println(number1 +" is a Multiple of"+ number2);

        if(isNumberMultiple != 0)
            System.out.println(number1 +" is NOT a Multiple of" + number2);



    }

}