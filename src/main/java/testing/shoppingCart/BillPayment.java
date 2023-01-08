package testing.shoppingCart;
import java.util.Scanner;

public class BillPayment {

    public static void main(String[] a){

        Product milk=(new Product("Milk",70.00,"liter"));
        Product apple=new Product("Apple",110.00, "kg");
        Product newspaper=new Product("NewsPaper",12.00, "");
        Product oranges=new Product("Oranges",100.00, "kg");


        Catalogue productCatalogue=new Catalogue();
        productCatalogue.catalogue.add(milk);
        productCatalogue.catalogue.add(apple);
        productCatalogue.catalogue.add(newspaper);
        productCatalogue.catalogue.add(oranges);
        System.out.println("The below is the product catalogue: \n"+productCatalogue);


        Cart cart=new Cart();
        cart.addToCart(milk,3.5);
        cart.addToCart(apple,2.0);
        cart.addToCart(newspaper,1.0);
        //cart.addToCart(oranges,2);

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
