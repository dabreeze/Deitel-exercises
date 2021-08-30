package ClassWork;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int low = 0;
        int high = word.length()-1;

        boolean isWordPalindrome = true;

        while(low <high)
        {
            if(word.charAt(low)!= word.charAt(high))
            {
                isWordPalindrome = false;
                break;
            }
            low++;
            high--;

        }
        if(isWordPalindrome)
        {
            System.out.println(word+ " is a palindrome ");
        }else System.out.println(word+" is not  a palindrome");
    }
}
