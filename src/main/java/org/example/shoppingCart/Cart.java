package org.example.shoppingCart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {
    Map<Products,Integer> listOfProducts=new HashMap<>();


    public static void main(String[] a){

        Products milk=new Products();
        milk.setName("1liter Milk");
        milk.setPrice(70.00);

        Products apple=new Products();
        apple.setName("1kg Apple");
        apple.setPrice(110.00);

        Products newspaper=new Products();
        newspaper.setName("NewsPaper");
        newspaper.setPrice(12.00);


        Cart cart1=new Cart();
        cart1.listOfProducts.put(milk,3);
        cart1.listOfProducts.put(apple,2);
        cart1.listOfProducts.put(newspaper,1);

        Payment pay=new Payment();
        pay.generateBill(cart1.listOfProducts);

    }
}
