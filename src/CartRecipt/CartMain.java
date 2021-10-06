package CartRecipt;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class CartMain {
    ;
    public static void main(String[] args) {
        String itemName;
        int itemQuantity;




        Scanner input = new Scanner(System.in);
        System.out.println("Buyers name");
        String name = input.nextLine();
        Cart myCart = new Cart();
        myCart.Cart(name);
        String response;


        do{
            System.out.println("What would you love to add to cart? " +myCart.Cart(name));
            System.out.println("What did they buy?");
            itemName = input.next();
            System.out.println("Quantity of purchase?");
            itemQuantity = input.nextInt();

            System.out.println("How much doe it cost");
            BigDecimal itemPrice = input.nextBigDecimal();
            Item item = new Item(itemName, itemQuantity, itemPrice);
            myCart.addItem(item);
            System.out.println("Anything else?");
            response = input.next();
        }while (response.equalsIgnoreCase("yes"));

        System.out.println( "itemName " +"\t\t"+" itemPrice \t\t"+ "Quantity\t\t"+"totalPrice"+"\n");
           System.out.println(myCart);





    }
}
