package chapterFour;
// A java application that determines if the customer her exceeded his credit limit.
// account number
// allocate credit unit
// Accept user account input
// accept user account details
// determine if the account is in negative
// check for previous bal
import java.util.Scanner;
public class FourPointOneEight {
    public static void main(String[] args) {
        int accountNumber=0;
        int oldAccountBalance=0;
        int newAccountBalance=0;
        int totalPriceOfItems=0;
        int allowedCreditLimit=0;
        int balance = 0;
        int customers = 0;
        String name = " ";

        Scanner userInput = new Scanner(System.in);
        System.out.println("Hello please REGISTER if your new HERE ");

        System.out.println("Please ENTER new account name : ");
        name = userInput.nextLine();

        System.out.println("Welcome "+name+" Please enter 5 digits of your choice : ");
        accountNumber = userInput.nextInt();
        System.out.println("Hello "+ name+ " your account Number is: "+accountNumber);
        System.out.println();
        System.out.println("Please enter the Account Balance :" );
        balance = userInput.nextInt();

        if(balance >= 5000){
            allowedCreditLimit = 3000;
        }else
        {
            allowedCreditLimit = 500;
        }
        System.out.println("Congratulations your monthly Credit is! "+ allowedCreditLimit);

        System.out.println("Proceed to purchase");
        System.out.println();
       System.out.println("Please enter the total price of items you bought");
        totalPriceOfItems = userInput.nextInt();

        newAccountBalance = balance + allowedCreditLimit - totalPriceOfItems;

        System.out.println("Your new balance is : "+ newAccountBalance);


            if (newAccountBalance > allowedCreditLimit) {
                System.out.println("Valid purchase pls continue buying");
            } else {
                System.out.println("Invalid Transaction Credit limit exceeded.");
            }


    }

}
