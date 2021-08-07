package solution;

//A BMI calculator that reads the user’s weight in kilograms and height in meters

// prompt user for their weight in kilograms and height in meters
// accept and store in a variable
// calculate the BMI using BMI formula
// Display ythe person's BMI

import java.util.Scanner;
public class TwoPointThreeThree
{
    public static void main(String[] args)
    {

        int weight;
        int bodyMassIndex;
        int height;
        String name;

        Scanner input = new Scanner(System.in);

        System.out.println("What is your Name?");
        name = input.nextLine();

        System.out.println("Enter your Weight in Kilograms(kg)");
        weight = input.nextInt();

        System.out.println("Enter your Height in meters (m)");
        height = input.nextInt();

        bodyMassIndex = weight / height * height;


        System.out.println("BMI \tVALUES\n");
        System.out.println("Underweight less than 18.5 \t\n");
        System.out.println("Normal 18.5 and 24.9\t\n");
        System.out.println("Overweight 25 and 29.9\t\n");
        System.out.println("Obese 30 or greater\t\n");
        System.out.println("========================================\t\n");

        System.out.println("WELCOME  "+name+" \t\n");
        System.out.printf("Your BMI VALUE is\t %d\n", bodyMassIndex);

    }

}