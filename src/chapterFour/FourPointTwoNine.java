package chapterFour;
import java.util.Scanner;
public class FourPointTwoNine {
    // A program that prints a hollowed square;
    // begin by prompting the user to enter the size of the square;
    // display the hollowed square using asterisks;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of Square:");
        int sideOfSquare = input.nextInt();
        int spaceCount = sideOfSquare - 1;

                System.out.println("*  ".repeat(sideOfSquare));
        for (int row = 0; row < sideOfSquare-2; row++) {
            System.out.print("*  ");
            for (int column = 0; column< sideOfSquare-2; column++){
                        System.out.print("   ");
            }
            System.out.println("*  ");
        }
        System.out.println("*  ".repeat(sideOfSquare));

    }
}
