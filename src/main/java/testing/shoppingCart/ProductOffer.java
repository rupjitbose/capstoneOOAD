package testing.shoppingCart;

import java.util.Map;

public class ProductOffer {

    public static int getMilkOffer(int amount) {
        int qty = 0;
        if (amount >= 2) {
                qty = amount + amount / 2;
                System.out.printf("You get extra %s Liter Milk for as part of buy 2 get 1 free offer. \n"
                        , amount / 2);
            }
        return qty;
    }


    public static int getAppleOffer(int amount) {
        int qty = amount;
        return qty;
    }

    public static int getNewsPaperOffer(int amount) {
        int qty = amount;
        return qty;
    }

    public static int getOffer(String name, int amount) {
        int newQty=0;
        if(name.equalsIgnoreCase("1liter Milk")){
            newQty= getMilkOffer(amount);
        }
        else if(name.equalsIgnoreCase("1kg Apple")){
            newQty= getAppleOffer(amount);
        }
        else if(name.equalsIgnoreCase("NewsPaper")){
            newQty= getNewsPaperOffer(amount);
        }
        return newQty;
    }
}