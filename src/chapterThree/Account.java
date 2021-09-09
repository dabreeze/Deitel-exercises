package chapterThree;

public class Account {
    private String accountName;
    private int accountBalance;


    public void input(){}
    public String getName()
    {

        return accountName;
    }
    public void setAccountName(String name)
    {
        accountName = name;
    }
    public void deposit( int depositAmount)
    {
        if(depositAmount > 0)
        {
            accountBalance += depositAmount;
        }else
        {
            System.out.println("Sorry Negative values not allowed"+ depositAmount);
        }

    }


    public void withdraw(int withdrawalAmount)
    {
        if(accountBalance >= withdrawalAmount) {
            accountBalance = accountBalance - withdrawalAmount;
        }else
        {
            System.out.println("Insufficient balance "+ accountBalance);
        }

    }

    public int getAccountBalance()
    {
        return accountBalance;
    }
    public int makeDecision(int choiceNumber)
    {
        if(choiceNumber == 1)
        {
            deposit(choiceNumber);
        }else
        {
            withdraw(choiceNumber);
        }
        return choiceNumber;
    }


}
