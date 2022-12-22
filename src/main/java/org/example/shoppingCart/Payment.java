package org.example.shoppingCart;

import java.util.Map;
import java.util.Scanner;

public class Payment {

    private double total=0,  discountTotal = 0;;

    public void generateBill(Map<Products,Integer> listOfProducts){

        for (Map.Entry<Products,Integer> entry : listOfProducts.entrySet()){
            double ptotal=0;
            total=total+entry.getKey().getPrice()*entry.getValue();
            ptotal=entry.getKey().getPrice()*entry.getValue();

            if(entry.getKey().getName().equalsIgnoreCase("1liter Milk")){
                System.out.println(entry.getKey().getName()+" : "+checkMilkOffer(listOfProducts)+" : "+ptotal);
            }
            else
            System.out.println(entry.getKey().getName()+" : "+entry.getValue()+" : "+ptotal);
    }
        finalPayment();
    }

    public int checkMilkOffer(Map<Products,Integer> listOfProducts){
        int qty=1;
        for (Map.Entry<Products,Integer> entry : listOfProducts.entrySet()){

            if(entry.getKey().getName().equalsIgnoreCase("1liter Milk")){
                 qty=entry.getValue();
                if(entry.getValue()>=2){

                    qty= entry.getValue()+entry.getValue()/2;
                    System.out.printf("You get extra %s Liter Milk for as part of buy 2 get 1 free offer. \n"
                            ,entry.getValue()/2);
                }
            }
        }
        return qty;
    }

    public void finalPayment(){
        System.out.println("Enter \"w\" for wallet and \"c\" for cash payment:");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        if(input.equalsIgnoreCase("w") && total>=100.00){
            discountTotal =total*.05;
            System.out.println("5 % discount on wallet payment Discounted Total: "+(total-discountTotal));
        }
        else {
            System.out.println("Total Price: "+total);
        }


    }





}
