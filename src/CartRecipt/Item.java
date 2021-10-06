package CartRecipt;

import java.math.BigDecimal;

public class Item {
    private String itemName;
    private int itemQuantity;
    private BigDecimal itemPrice;
    private BigDecimal totalPrice;

    public  Item(String itemName, int itemQuantity, BigDecimal itemPrice)
    {
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }
//    public BigDecimal calculateTotalPrice(){
//        return itemPrice itemPrice;
//    }

    public BigDecimal calculatePrice()
    {
        return BigDecimal.valueOf(itemQuantity).multiply(itemPrice);
    }

    @Override
    public String toString() {
        return
               itemName + " \t\t\t" +
                itemQuantity +
                "\t\t\t\t" + itemPrice +
                "\t\t\t\t" + calculatePrice()+"\n"
                ;
    }
}
