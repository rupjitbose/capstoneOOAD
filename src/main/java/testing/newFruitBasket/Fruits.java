package testing.newFruitBasket;

import java.util.ArrayList;
import java.util.List;

public class Fruits {

    String name="";
    String color="";
    String type="";
    String size="";

    int quantity;
    int sizeValue;

    List<Fruits> listOfFruits=new ArrayList<Fruits>();


    public Fruits(){

    }
    public Fruits(String name, String color, String type, String size,int quantity) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.size = size;
        this.quantity=quantity;


        if (this.size.equalsIgnoreCase("small")) {
            sizeValue = 1;
        } else if (this.size.equalsIgnoreCase("mid")) {
            sizeValue = 2;
        } else if (this.size.equalsIgnoreCase("large")) {
            sizeValue = 3;
        } else {

            throw new RuntimeException(this.size+" is not a valid size");

        }

    }

    public void showFruit(){

        System.out.println(this.name);
        System.out.println(this.size);
        System.out.println(sizeValue);
        System.out.println(this.type);
        System.out.println(this.color);
    }


    public static void main(String[] a)  {


        Fruits apple=new Fruits("apple","red","sweet","mid",5);



        apple.showFruit();


        Fruits flits=new Fruits();
        flits.listOfFruits.add(apple);
    }


}
