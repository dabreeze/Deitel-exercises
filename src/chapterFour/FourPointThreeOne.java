package chapterFour;
// A program that inputs the binary digits and prints its decimal equivalent.
// accept input from the user
// multiply its number with its binary position starting from the left
// display result
import java.util.Scanner;

public class FourPointThreeOne {


    public static void main(String[] args) {
        int binaryNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("enter number to get decimal equivalent");
        binaryNumber = Integer.parseInt(input.nextLine());

        int decimalNumber = 0;
        int count = 0;
        while(binaryNumber != 0){
            int digit = binaryNumber % 10;
            decimalNumber += digit * Math.pow(2, count);
            count++;
            binaryNumber = binaryNumber/ 10;
        }
        System.out.println(decimalNumber);
    }
}
