package testing.fruitbasket;

public class Fruit {
    private String name;
    private String color;
    private String size;
    private String type;
    public Fruit(String name, String color, String size, String type) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.type = type;
    }

    public String getColor() {
        return color;
    }
    public String getSize() {
        return size;
    }
    public String getType() {
        return type;
    }
    public String getName() {
        return name;
    }

}
