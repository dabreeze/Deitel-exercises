package chapterFour;
// A program to determine if a number is a palindrome
// accept a sequence of five digit input from the user
// validate the input if the number must be 5 digits else raise an error number should be five digits
// compare the first index wth the last index
// compare the second index with the fourth index
import java.util.Scanner;
public class fourPointThirty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 digit palindrome numbers");
        String user = input.nextLine();



        while (true){

            if(user.charAt(0) == user.charAt(4) && user.charAt(1) == user.charAt(3)){
                System.out.println("Great job. You have entered a Palindrome");
            }else
            {
                System.out.println("Please Enter a correct Palindrome number");
                user = input.nextLine();


            }
            break;
        }

    }

}
