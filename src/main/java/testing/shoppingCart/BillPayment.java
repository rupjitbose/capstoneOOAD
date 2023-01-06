package testing.shoppingCart;
import java.util.Scanner;

public class BillPayment {

    public static void main(String[] a){

        Product milk=(new Product("1liter Milk",70.00));
        Product apple=new Product("1kg Apple",110.00);
        Product newspaper=new Product("NewsPaper",12.00);
        Product oranges=Product.builder().name("1Kg Oranges").price(100.00).build();


        Cart cart=new Cart();
        cart.addToCart(milk,3);
        cart.addToCart(apple,2);
        cart.addToCart(newspaper,1);

        System.out.println("Please mention your payment method \"w\" for wallet and \"c\" for cash: ");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();

        if(input.equalsIgnoreCase("w")){
            WalletPay wallet=new WalletPay();
            wallet.paymentCalculation(cart.cartData);
        }
        else if(input.equalsIgnoreCase("c")){
            CashPayment cash=new CashPayment();
            cash.paymentCalculation(cart.cartData);
        }
        else System.out.println("Option entered is invalid!");
    }
}
