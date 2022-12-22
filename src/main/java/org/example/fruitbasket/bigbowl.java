package org.example.fruitbasket;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class bigbowl {

    public List<fruits> fruitsList=new ArrayList<>();



    public static void main(String[] ags){

        fruits orange=new fruits();
        orange.setName("orange");
        orange.setColor("orange");
        orange.setSize("big");
        orange.setType("sweet");

        fruits lime=new fruits();
        lime.setName("lime");
        lime.setColor("green");
        lime.setSize("mid");
        lime.setType("sour");

        fruits apple=new fruits();
        apple.setName("apple");
        apple.setColor("red");
        apple.setSize("big");
        apple.setType("tart");

        fruits grep=new fruits();
        grep.setName("grep");
        grep.setColor("green");
        grep.setSize("small");
        grep.setType("sweet");

        fruits mango=new fruits();
        mango.setName("mango");
        mango.setColor("yellow");
        mango.setSize("big");
        mango.setType("sweet");

        bigbowl b=new bigbowl();
        b.fruitsList.add(apple);
        b.fruitsList.add(grep);
        b.fruitsList.add(orange);
        b.fruitsList.add(lime);
        b.fruitsList.add(mango);
        System.out.println("Fruits in the bigbowl:"+  b.fruitsList +"\n");


        basketStand bs=new basketStand();

        bs.sortBySize(b.fruitsList);
        bs.showBasket();

        bs.sortbByColor(b.fruitsList);
        bs.showBasket();

        bs.sortByType(b.fruitsList);
        bs.showBasket();
    }

}
