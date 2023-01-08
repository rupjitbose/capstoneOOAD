package testing.shoppingCart;
import java.util.Map;

public class WalletPay extends Billing implements Payment,Discount {
    @Override
    public void paymentCalculation(Map<Product, Double> cartData) {
        generateBill(cartData);
        System.out.println("5 % discount on wallet payment on payment over 100, Total: "
                    +(total-total*discountOffer())+"\n");
    }

    @Override
    public double discountOffer() {
        double discount;
        if(total>=100)
            discount=.05;
        else
            discount=0;
        return discount;
    }
}
