package testing.shoppingCart;

import java.util.Map;

public interface Payment {
    void paymentCalculation(Map<Product, Integer> listOfProducts);
}
