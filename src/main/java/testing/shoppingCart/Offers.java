package testing.shoppingCart;

import java.util.Map;

public class Offers {


    public static int getMilkOffer(Map<Products, Integer> listOfProducts) {

        int qty = 1;

        for (Map.Entry<Products, Integer> entry : listOfProducts.entrySet()) {

            if (entry.getKey().getName().equalsIgnoreCase("1liter Milk")) {
                qty = entry.getValue();

                if (entry.getValue() >= 2) {

                    qty = entry.getValue() + entry.getValue() / 2;
                    System.out.printf("You get extra %s Liter Milk for as part of buy 2 get 1 free offer. \n"
                            ,entry.getValue() / 2);
                }

            }

        }
        return qty;
    }

}
