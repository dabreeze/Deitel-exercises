package CartRecipt;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Cart {
    private String cartOwnerName= " ";
    private ArrayList<Item> myItems = new ArrayList<>();


    public String Cart(String cartOwnerName) {
        this.cartOwnerName = cartOwnerName;
        return cartOwnerName;
    }



    public BigDecimal calculateGrandTotal()
    {
        BigDecimal total = BigDecimal.ZERO;
        for(Item items: myItems)
        {

            total.add(items.calculatePrice());
        }
        return total;
    }
//    public BigDecimal calculateVat()
//    {
//
//    }
//    public BigDecimal calculateDiscount()
//    {
//
//    }
//    public BigDecimal calculateBalance()
//    {
//
//    }
    public void addItem(Item item){
        myItems.add(item);

    }

    @Override
    public String toString() {
        String itemDetails =" ";

        for (Item cartDetails : myItems)
              {
            itemDetails = myItems.toString();
        }
        return itemDetails;

    }
}
