package chapterThree;
import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AccountMainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account harryAccount = new Account();
        int userChoice = 0;
        boolean exit = true;


            System.out.println("Hello welcome. Please enter a name for your account:");
            harryAccount.setAccountName(input.nextLine());
            System.out.println();
            System.out.println("Welcome " + harryAccount.getName());
            System.out.println("what would you like to do today?");
            System.out.println("");
            System.out.println("Enter :" +
                    "1: Deposit" +
                    " 2: Withdraw");
            userChoice = input.nextInt();




            while (exit == exit) {
                if (userChoice == 1) {

                    System.out.println("Enter Amount to Deposit");
                    int depositAmount = input.nextInt();
                    harryAccount.deposit(depositAmount);

                    System.out.println("Deposit of " + depositAmount + " is Successful");
                    System.out.println("Your balance is: " + harryAccount.getAccountBalance());
                    System.out.println();
                    System.out.println("what would you like to do today?");
                    System.out.println("");
                    System.out.println("Enter :" +
                            "1: Deposit" +
                            " 2: Withdraw");
                    userChoice = input.nextInt();

                } else if (userChoice == 2) {

                    System.out.println("Enter Amount to withdraw");
                    int withdrawAmount = input.nextInt();
                    if (withdrawAmount >= 0 && withdrawAmount < harryAccount.getAccountBalance()) {
                        harryAccount.withdraw(withdrawAmount);
                        System.out.println("Withdrawal of " + withdrawAmount + " Successful");
                    } else {
                        System.out.println("Withdrawal of " + withdrawAmount + " Unsuccessful");
                    }

                    System.out.println("Your balance is: " + harryAccount.getAccountBalance());
                    System.out.println();
                    System.out.println("what would you like to do today?");
                    System.out.println("");
                    System.out.println("Enter :" +
                            "1: Deposit" +
                            " 2: Withdraw");
                    userChoice = input.nextInt();
                }


            }
        }
    }
