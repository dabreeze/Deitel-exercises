package eStore;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public class Card {
    private byte ccv;
    private Date yearOfExpiration;
    private Date monthOfExpiration;
    private BigInteger cardNumber;
    private String nameOnCard;
    List <CardType> cardType;
}
