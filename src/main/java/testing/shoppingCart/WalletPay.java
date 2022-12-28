package testing.shoppingCart;

import java.util.Map;

public class WalletPay implements Payment,Billing {

    double total=0.0;
    double discountTotal=0.0;
    @Override
    public void generateBill(Map<Products, Integer> listOfProducts){

        for (Map.Entry<Products,Integer> map : listOfProducts.entrySet()){
            double ptotal=0;

            total=total+map.getKey().getPrice()*map.getValue();
            ptotal=map.getKey().getPrice()*map.getValue();

            if(map.getKey().getName().equalsIgnoreCase("1liter Milk")){
                System.out.println(map.getKey().getName()+" : "+Offers.getMilkOffer(listOfProducts)+
                        " : "+ptotal);
            }
            else if(map.getKey().getName().equalsIgnoreCase("1kg Apple")){
                System.out.println(map.getKey().getName()+" : "+Offers.getAppleOffer(listOfProducts)+
                        " : "+ptotal);
            }
            else if(map.getKey().getName().equalsIgnoreCase("NewsPaper")){
                System.out.println(map.getKey().getName()+" : "+Offers.getNewsPaperOffer(listOfProducts)+
                        " : "+ptotal);
            }
            else
                System.out.println(map.getKey().getName() + " : " + map.getValue() + " : " + ptotal);
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
