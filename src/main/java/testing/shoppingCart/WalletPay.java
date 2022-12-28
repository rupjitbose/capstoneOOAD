package testing.shoppingCart;

import java.util.Map;

public class WalletPay implements Payment,Billing {

    double total=0.0;
    double discountTotal=0.0;
    @Override
    public void generateBill(Map<Products, Integer> listOfProducts){

        for (Map.Entry<Products,Integer> entry : listOfProducts.entrySet()){
            double ptotal=0;

            total=total+entry.getKey().getPrice()*entry.getValue();
            ptotal=entry.getKey().getPrice()*entry.getValue();

            if(entry.getKey().getName().equalsIgnoreCase("1liter Milk")){
                System.out.println(entry.getKey().getName()+" : "+Offers.getMilkOffer(listOfProducts)+" : "+ptotal);
            }
            else
            System.out.println(entry.getKey().getName()+" : "+entry.getValue()+" : "+ptotal);
    }
        paymentCalculation();
    }

    @Override
    public void paymentCalculation() {
        if(total>=100.00){
            discountTotal =total*.05;
            System.out.println("5 % discount on wallet payment on total of :"+ total+" Discounted Total: "
                    +(total-discountTotal)+"\n");
        }
    }

}
