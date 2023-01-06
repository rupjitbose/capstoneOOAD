package testing.shoppingCart;
import java.util.Map;

public class Billing {
    double total=0.0;
    public void generateBill(Map<Product, Integer> cartData) {

        for (Map.Entry<Product,Integer> map : cartData.entrySet()) {
            double ptotal = 0;
            total = total + map.getKey().getPrice() * map.getValue();
            ptotal = map.getKey().getPrice() * map.getValue();
            System.out.println(map.getKey().getName()+" : "+ ProductOffer.getOffer(map.getKey().getName(),map.getValue())
                    +" : "+ ptotal);

        }

    }

}
