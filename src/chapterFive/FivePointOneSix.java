package chapterFive;
import java.util.Scanner;

public class FivePointOneSix {
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;

        Scanner input = new Scanner(System.in);

        while (count1 != -1) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter a number:");
                count1 = input.nextInt();
                for (int y = 1; y <= i; y++) {
                    count2 = count1 * ('*');

                    System.out.println();
                    //System.out.printf("%d%n %d%n %d%n %d%n %d%n", count1, count1, count1, count1, count1);

                }
            }
        }
    }
}