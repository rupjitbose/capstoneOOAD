package testing.shoppingCart;


public class Product {
    private String name;
    private String unit;
    private double price;
    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }
    public double getPrice() {
        return price;
    }
    public Product(String name, double price, String unit) {
        this.name = name;
        this.price = price;
        this.unit= unit;
    }
}
