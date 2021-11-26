package chapterFour;
import java.util.Scanner;
public class FourPointThreeFour {
    // A program that reads input from the user
    // sums it up till it gets to the first.

    public static void main(String[] args) {
        int number = 0;
        int sum = 0;
        int number2 = 0;


        Scanner input = new Scanner(System.in);

        System.out.println("enter number");
        number = input.nextInt();
        while (sum <= number) {
            if (sum <= number) {
                System.out.println("enter number");
                number2 = input.nextInt();
                sum += number2;
            }
        }

    }
}
