package testing.shoppingCart;

import java.util.Map;

public class CashPayment extends  Billing implements Payment {

    double total=0.0;
    double discountTotal=0.0;
    @Override
    public void paymentCalculation(Map<Products, Integer> listOfProducts) {
        super.generateBill(listOfProducts);
        System.out.println("Total Amount :"+ total+"\n");
    }
}
