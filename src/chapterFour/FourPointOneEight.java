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
        int totalNumberOfItems=0;
        int totalMonthlyCreditAllowance=5000;
        int customers=0;
        String name = " ";

        Scanner userInput = new Scanner(System.in);
        System.out.println("Hello please REGISTER if your new HERE ");

        System.out.println("Please ENTER new account name : ");
        name = userInput.nextLine();

        System.out.println("Welcome "+name+" Please enter 5 digits of your choice : ");
        accountNumber = userInput.nextInt();
        customers = accountNumber;

        System.out.println("Proceed to purchase");
//        System.out.println("Please enter the total price of items you bought");
//        totalNumberOfItems = userInput.nextInt();

        while(customers == accountNumber) {

            System.out.println("Please enter the total price of items you bought");
           totalNumberOfItems = userInput.nextInt();

            System.out.println(" Enter Account Balance");
            oldAccountBalance =userInput.nextInt();



            if(newAccountBalance <= totalMonthlyCreditAllowance){
                System.out.println("Valid Purchase!");
                newAccountBalance = oldAccountBalance + totalNumberOfItems - totalMonthlyCreditAllowance;
            }else
            {
                System.out.println("Credit Limit Exceeded");
            }
        }


    }

}
