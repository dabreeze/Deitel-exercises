package solution;

/* A program that takes a floating point number as radius from the user and displays area,circumfrence and diameter.*/

// prompt user to enter a radius Number
// accept and store the number
// calculate the area, circumference and diameter using the class Math objects
// display the results

import java.util.Scanner;
public class TwoPointTwoEight
{
    public static void main(String[] args)
    {

        float number;
        float area;
        float diameter;
        float circumference;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Radius: ");
        number = input.nextInt();

        System.out.printf("Area is : %f\n", (float)(Math.PI * number * number));
        System.out.printf("Diameter is: %f%n", (float)(2 * number));
        System.out.printf("Circumference is: %f\n", (float)(2 * Math.PI * number));

    }

}