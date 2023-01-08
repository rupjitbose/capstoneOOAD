package testing.shoppingCart;

public class ProductOffer {

    public static double getMilkOffer(double amount) {
        int addon = 0;
        if (amount >= 2) {
                addon = (int)amount / 2;
                System.out.printf("You get extra %s Liter Milk for as part of buy 2 get 1 free offer. \n"
                        ,  addon);
            }
        return amount+addon;
    }
    public static double getOrangeOffer(double amount) {
        int addon = 0;
        if (amount >= 2) {
            addon = (int)amount / 2;
            System.out.printf("You get extra %s kg Orange for as part of buy 2 get 1 free offer. \n"
                    ,addon);
        }
        return amount+addon;
    }

    public static double getAppleOffer(double amount) {
        double qty = amount;
        return qty;
    }

    public static double getNewsPaperOffer(double amount) {
        double qty = amount;
        return qty;
    }
    public static double getOffer(String name, double amount) {
        double newQty=0;
        if(name.equalsIgnoreCase("Milk")){
            newQty= getMilkOffer(amount);
        }
        else if(name.equalsIgnoreCase("Apple")){
            newQty= getAppleOffer(amount);
        }
        else if(name.equalsIgnoreCase("NewsPaper")){
            newQty= getNewsPaperOffer(amount);
        }
        else if(name.equalsIgnoreCase("Oranges")){
            newQty= getOrangeOffer(amount);
        }
        return newQty;
    }
}