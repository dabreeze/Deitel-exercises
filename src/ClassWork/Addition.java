package ClassWork;
import java.util.Scanner;
public class Addition {

    public static void main(String[] args) {
        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);

        Scanner input = new Scanner(System.in);

        System.out.println("please what is the sum of "+number1+" and "+number2);
        int userInput = input.nextInt();

        while(number1 + number2 != userInput)
        {
            System.out.println("Answer incorrect Sorry please try again ");
            userInput = input.nextInt();
        }
        System.out.println("You got it!");
    }

}
