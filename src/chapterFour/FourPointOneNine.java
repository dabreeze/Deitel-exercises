package chapterFour;
import java.util.Scanner;
public class FourPointOneNine {

    public static void main(String[] args) {

        int numberOfSalesPerson = 0;
        int numberOfItemsSold = 0;
        int pricePerItem = 0;
        double percentagePayableIS = 0.09;
        int salary = 200;
        int totalItemSold = 0;

        Scanner userInput = new Scanner(System.in);



        totalItemSold = numberOfItemsSold * pricePerItem;
        double earnings = totalItemSold * percentagePayableIS;


        double totalPayable = earnings + salary;
        while(numberOfItemsSold != -1) {

            System.out.println("Eeter name of seller");
            String name = userInput.nextLine();

            System.out.println("Number of items sold :");
            numberOfItemsSold = userInput.nextInt();
            System.out.println();
            System.out.println("Price per Item");
            pricePerItem = userInput.nextInt();
            System.out.println(totalPayable);
        }
    }
}
