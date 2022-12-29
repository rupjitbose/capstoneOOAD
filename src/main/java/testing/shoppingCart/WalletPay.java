package testing.shoppingCart;

import java.util.Map;

public class WalletPay extends Billing implements Payment {

    @Override
    public void paymentCalculation(Map<Products, Integer> listOfProducts) {
        generateBill(listOfProducts);
        if(total>=100.00){
            discountTotal =total*.05;
            System.out.println("5 % discount on wallet payment on total of :"+ total+" Discounted Total: "
                    +(total-discountTotal)+"\n");
        }
        else
            System.out.println("Total Amount: "+ total);

    }

}
