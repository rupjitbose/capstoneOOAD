package testing.shoppingCart;

import java.util.Map;

public class CashPayment extends  Billing implements Payment {

    double discountTotal=0.0;
    @Override
    public void paymentCalculation(Map<Products, Integer> listOfProducts) {
        generateBill(listOfProducts);
        System.out.println("Total Amount :"+ total+"\n");
    }
}
