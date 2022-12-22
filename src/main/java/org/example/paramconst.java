package org.example;

public class paramconst {
    private String name;
    private String brand;
    private int quantity;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getBrand() { return brand; }

    public void setBrand(String brand) { this.brand = brand; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public static void main(String[] args) {
        //
        paramconst product = new paramconst(); // Default Constructor
        product.setName("Airpods");
        product.setBrand("Apple");
        product.setQuantity(1);
        System.out.println(product);
    }

    @Override
    public String toString() {
        return "{"
                + "\"name\":\""
                + name
                + "\""
                + ", \"brand\":\""
                + brand
                + "\""
                + ", \"quantity\":\""
                + quantity
                + "\""
                + "}";
    }
}

