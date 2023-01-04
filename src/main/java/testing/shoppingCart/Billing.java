package testing.shoppingCart;

import java.util.Map;

public class Billing {
    double total=0.0;
    public void generateBill(Map<Products, Integer> listOfProducts) {
        for (Map.Entry<Products,Integer> map : listOfProducts.entrySet()) {
            double ptotal = 0;
            total = total + map.getKey().getPrice() * map.getValue();
            ptotal = map.getKey().getPrice() * map.getValue();

            if(map.getKey().getName().equalsIgnoreCase("1liter Milk")){
                System.out.println(map.getKey().getName()+" : "+ProductOffers.getMilkOffer(listOfProducts)+
                        " : "+ptotal);
            }
            else if(map.getKey().getName().equalsIgnoreCase("1kg Apple")){
                System.out.println(map.getKey().getName()+" : "+ProductOffers.getAppleOffer(listOfProducts)+
                        " : "+ptotal);
            }
            else if(map.getKey().getName().equalsIgnoreCase("NewsPaper")){
                System.out.println(map.getKey().getName()+" : "+ProductOffers.getNewsPaperOffer(listOfProducts)+
                        " : "+ptotal);
            }
            else
                System.out.println(map.getKey().getName() + " : " + map.getValue() + " : " + ptotal);
        }

    }

}
