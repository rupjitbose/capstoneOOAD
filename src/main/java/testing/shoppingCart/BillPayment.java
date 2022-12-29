package testing.shoppingCart;

import java.util.Scanner;

public class BillPayment {

    public static void main(String[] a){

        Products milk=new Products("1liter Milk",70.00);
        Products apple=new Products("1kg Apple",110.00);
        Products newspaper=new Products("NewsPaper",12.00);

        Cart cart=new Cart();
        cart.addToCart(milk,3);
        cart.addToCart(apple,2);
        cart.addToCart(newspaper,1);

        System.out.println("Please mention your payment method \"w\" for wallet and \"c\" for cash: ");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();

        if(input.equalsIgnoreCase("w")){
            WalletPay wallet=new WalletPay();
            wallet.paymentCalculation(cart.listOfProducts);
        }
        else if(input.equalsIgnoreCase("c")){
            CashPayment cash=new CashPayment();
            cash.paymentCalculation(cart.listOfProducts);
        }
        else System.out.println("Option entered is invalid!");
    }
}
