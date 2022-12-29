package testing.shoppingCart;

import java.util.Map;

public class ProductOffers {

    public static int getMilkOffer(Map<Products, Integer> listOfProducts) {

        int qty = 1;
        for (Map.Entry<Products, Integer> entry : listOfProducts.entrySet()) {

            if (entry.getKey().getName().equalsIgnoreCase("1liter Milk") && entry.getValue() >= 2) {
                qty = entry.getValue() + entry.getValue() / 2;
                System.out.printf("You get extra %s Liter Milk for as part of buy 2 get 1 free offer. \n"
                        , entry.getValue() / 2);
            }
        }
        return qty;
    }


    public static int getAppleOffer(Map<Products, Integer> listOfProducts) {
        int qty = 1;

        for (Map.Entry<Products, Integer> entry : listOfProducts.entrySet()) {

            if (entry.getKey().getName().equalsIgnoreCase("1kg Apple")) {
                qty = entry.getValue();
            }
        }
        return qty;
    }

    public static int getNewsPaperOffer(Map<Products, Integer> listOfProducts) {
        int qty = 1;

        for (Map.Entry<Products, Integer> entry : listOfProducts.entrySet()) {

            if (entry.getKey().getName().equalsIgnoreCase("NewsPaper")) {
                qty = entry.getValue();
            }
        }
        return qty;
    }
}