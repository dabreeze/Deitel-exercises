package ClassWork;
import java.util.Scanner;
public class MagicGuessNumber {


    public static void main(String[] args) {
        int guessNumber;
        int randomNumber = (int)(Math.random()*100);
        Scanner input = new Scanner(System.in);

        System.out.println("Guess a number From ! - 100");
        int answer = input.nextInt();

        while(randomNumber != answer)
        {
            if(answer > randomNumber)
            {
                System.out.println("Guess number Too high");
                System.out.println("Guess Again 1 - 100");
                answer = input.nextInt();
            }else
            if(answer < randomNumber)
            {
                System.out.println("Guess number too low");
                System.out.println("Guess Again 1 - 100");
                answer = input.nextInt();
            }


            }
        System.out.println(" Your Guess is correct!");
        }

}
