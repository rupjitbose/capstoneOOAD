package testing.shoppingCart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {
    Map<Product,Double> cartData =new HashMap<>();

    public void addToCart(Product p, double amount){
        cartData.put(p,amount);
    }

}
