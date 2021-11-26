package chapterFour;
// a program that compares two numbers for equality
import java.util.Scanner;
public class FourPointThreeSix {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber =0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        firstNumber = input.nextInt();

        System.out.println("Enter a second Number");
        secondNumber = input.nextInt();

        if(firstNumber == secondNumber){
            System.out.println("0");
        }else if(firstNumber > secondNumber){
            System.out.println("1");
        }else

            System.out.println("-1");

    }
}
