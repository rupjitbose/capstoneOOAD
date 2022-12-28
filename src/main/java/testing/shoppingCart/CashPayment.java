package testing.shoppingCart;

import java.util.Map;

public class CashPayment implements Billing,Payment {

    double total=0.0;
    double discountTotal=0.0;
    @Override
    public void generateBill(Map<Products, Integer> listOfProducts) {
        for (Map.Entry<Products,Integer> map : listOfProducts.entrySet()) {
            double ptotal = 0;
            total = total + map.getKey().getPrice() * map.getValue();
            ptotal = map.getKey().getPrice() * map.getValue();

            if(map.getKey().getName().equalsIgnoreCase("1liter Milk")){
                System.out.println(map.getKey().getName()+" : "+Offers.getMilkOffer(listOfProducts)+" : "+ptotal);
            }
            else
            System.out.println(map.getKey().getName() + " : " + map.getValue() + " : " + ptotal);
        }
        paymentCalculation();
    }

    @Override
    public void paymentCalculation() {
        System.out.println("Total Amount :"+ total+"\n");
    }
}
