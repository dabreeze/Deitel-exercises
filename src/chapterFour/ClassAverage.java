package chapterFour;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int counter =1;
        double average;

        System.out.println("Please enter an average or -1 to Exit");
        int userInput = input.nextInt();
        while(userInput != -1) {

                total = total + userInput;

                counter++;
            System.out.println("Please enter an average");
            userInput = input.nextInt();

        }
        average = total / 10;
        System.out.printf("Total of all 10 grades is: %s%n", total);
        System.out.printf("Average is: %2f%n", average);
    }
}
