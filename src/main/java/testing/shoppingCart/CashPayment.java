package testing.shoppingCart;

import java.util.Map;

public class CashPayment extends  Billing implements Payment,Discount {
    @Override
    public void paymentCalculation(Map<Products, Integer> listOfProducts) {
        generateBill(listOfProducts);
        System.out.println("5 % discount on wallet payment on payment over 100, Total: "
                +(total-total*discountOffer())+"\n");
    }

    @Override
    public double discountOffer() {
        double discount=0;
        return discount;
    }
}
