package testing.shoppingCart;

import java.util.Map;

public interface Payment {
    void paymentCalculation(Map<Products, Integer> listOfProducts);
}
