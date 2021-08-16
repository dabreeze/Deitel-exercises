package ClassWork;

public class TestDriller {


    public int numberOfCopies(int copies) {
        int minimumPrice = 1500;
        int copyNumber=  copies;
        int totalPrice=0;
        int totalNumberOfCopies;

        if (copyNumber >=1 && copyNumber <=4){
            totalPrice = minimumPrice * copyNumber;
        }else
        if(copyNumber >=5 && copyNumber <=9){
            int price2 = minimumPrice - 100;
            totalPrice = price2 * copyNumber;
        }else
        if(copyNumber >= 10 && copyNumber <=29){
            int price3 = minimumPrice - 300;
            totalPrice = price3 * copyNumber;
        }else
        if(copyNumber >= 30 && copyNumber<= 49){
            int price4 = minimumPrice - 400;
            totalPrice = price4 * copyNumber;
        }else
        if (copyNumber >= 50 && copyNumber <= 99){
            int price5 = minimumPrice - 500;
            totalPrice = price5 * copyNumber;
        }else
        if (copyNumber >= 100 && copyNumber < 199){
            int price6 = minimumPrice - 600;
            totalPrice = price6 * copyNumber;
        }else
        if (copyNumber >= 200){
            int price7 = minimumPrice - 700;
            totalPrice = price7 * copyNumber;
        }
        return totalPrice;
    }

}