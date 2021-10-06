package chapterThree;

public class Invoice {
    private String partNumber;
    private  String partDescription;
    private int itemQuantity;
    private double itemPrice;
    private double totalAmount;

    public void Invoice(String partNumber, String partDescription, int itemQuantity, double itemPrice)
    {
        this.partNumber = partNumber;
        this.itemQuantity = itemQuantity;
        this.partDescription = partDescription;
        this.itemPrice = itemPrice;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double calculateInvoice(double itemPrice, int itemQuantity) {
        if(itemQuantity>0 && itemPrice>0)
        {
            this.itemPrice = itemPrice;
            this.itemQuantity = itemQuantity;
            totalAmount = this.itemQuantity * this.itemPrice;

        }else
        {
            this.itemQuantity =0;
            this.itemPrice=0;
            totalAmount = this.itemQuantity * this.itemPrice;
        }
        return totalAmount;

    }



}
