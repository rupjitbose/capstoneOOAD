package testing.shoppingCart;


import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map<Products,Integer> listOfProducts=new HashMap<>();

    public void addToCart(Products p, int amount){
        listOfProducts.put(p,amount);
    }

}
