package testing.shoppingCart;
import java.util.Map;

public class Billing {
    double total=0.0;
    public void generateBill(Map<Product, Double> cartData) {
        for (Map.Entry<Product,Double> map : cartData.entrySet()) {
            double ptotal = 0;
            total = total + map.getKey().getPrice() * map.getValue();
            ptotal = map.getKey().getPrice() * map.getValue();
            System.out.println(map.getKey().getName()+" : "+ ProductOffer.applyOffer(map.getKey().getName(),map.getValue())
                    +" "+map.getKey().getUnit()+" : "+ ptotal);
        }
    }
}
