package chapterThree;

public class InvoiceMain {
    public static void main(String[] args) {
        Invoice myInvoice = new Invoice();
        double totalPrice = myInvoice.calculateInvoice(20,30);
        System.out.println(totalPrice);

    }
}
