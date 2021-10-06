package chapterThree;

import java.util.Scanner;

public class Account {
    private String accountName;
    private int accountBalance;


    public String inputForString(){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello welcome. Please enter a name for your account:");
        return input.nextLine();
    }

    private int inputForInt(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 to Deposit, 2 to Withdraw, 3 for Balance");
        return input.nextInt();

    }

    public String getName()
    {
        return setAccountName();
    }

    public String setAccountName()
    {
        accountName = inputForString();
        return accountName;
    }

    private void introduceCustomer(){
        System.out.println("Welcome " + getName());
    }

    private int initiateTransaction(){
        introduceCustomer();
        System.out.println("what would you like to do today?");
        return inputForInt();
    }

    public void validateTransaction(){
        int input = initiateTransaction();
        while (true) {
            if (input == 1) {
                System.out.println("Enter Amount to Deposit");
                validateDeposit();

            } else if (input == 2) {
                validateWithdrawal();
            } else {
                inputForInt();
            }
        }
    }

    public int printBalance(){
        return accountBalance;
    }

    private int receiveDepositAmount(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void deposit(){
        accountBalance += receiveDepositAmount();
       // return printBalance();
    }

    public void validateWithdrawal(){
        int withdrawAmount = receiveWithdrawAmount();
        if (withdrawAmount >0 && withdrawAmount < accountBalance){
            withdraw();
        }
    }

    public void validateDeposit(){
        int deposit = receiveDepositAmount();
        if (deposit > 0){
            deposit();

        }
    }
    private int receiveWithdrawAmount(){
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

    private void withdraw()
    {
        accountBalance -=receiveWithdrawAmount();
    }


}
