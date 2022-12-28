package testing.shoppingCart;

public class main {

    public static void main(String[] a){

        Products milk=new Products("1liter Milk",70.00);
        Products apple=new Products("1kg Apple",110.00);
        Products newspaper=new Products("NewsPaper",12.00);

        Cart cart=new Cart();
        cart.addToCart(milk,3);
        cart.addToCart(apple,2);
        cart.addToCart(newspaper,1);

         Billing wallet=new WalletPay();
        wallet.generateBill(cart.listOfProducts);

        Billing cash=new CashPayment();
        cash.generateBill(cart.listOfProducts);

    }
}
