package chapterThree;
import java.util.Scanner;
// An Invoice Application
public class threePointOneTwo {
private String partNumber;
private String partDescription;
private int quantityBought;
private double pricePerItem;

public void setInvoice(String name, String description, int qty, double price)
{
    this.partNumber = name;
    this.partDescription = description;
    this.quantityBought = qty;
    this.pricePerItem = price;
}

public double getInvoice()
{
    return getInvoiceAmount();
}
public double getInvoiceAmount()
{
    double invoiceAmount =  quantityBought * pricePerItem;
    return invoiceAmount;
}

    public static void main(String[] args) {
    Scanner user = new Scanner(System.in);
        threePointOneTwo invoice = new threePointOneTwo();

        System.out.println("Enter parts number");
//        invoice.partNumber = user.nextLine();
//        System.out.println("Description");
//        invoice.partDescription
        invoice.setInvoice(user.nextLine(), user.nextLine(), user.nextInt(), user.nextInt());

        System.out.println(invoice.getInvoiceAmount());

    }
}
