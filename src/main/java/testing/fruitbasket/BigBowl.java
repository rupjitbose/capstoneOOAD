package testing.fruitbasket;


import java.util.ArrayList;
import java.util.List;

public class BigBowl {

    public List<Fruit> fruitList =new ArrayList<>();
    public static void main(String[] ags){

        Fruit orange=new Fruit();
        orange.setName("orange");
        orange.setColor("orange");
        orange.setSize("big");
        orange.setType("sweet");

        Fruit lime=new Fruit();
        lime.setName("lime");
        lime.setColor("green");
        lime.setSize("mid");
        lime.setType("sour");

        Fruit apple=new Fruit();
        apple.setName("apple");
        apple.setColor("red");
        apple.setSize("big");
        apple.setType("tart");

        Fruit grep=new Fruit();
        grep.setName("grep");
        grep.setColor("green");
        grep.setSize("small");
        grep.setType("sweet");

        Fruit mango=new Fruit();
        mango.setName("mango");
        mango.setColor("yellow");
        mango.setSize("big");
        mango.setType("sweet");

        BigBowl b=new BigBowl();
        b.fruitList.add(grep);
        b.fruitList.add(orange);
        b.fruitList.add(lime);
        b.fruitList.add(mango);
        b.fruitList.add(apple);
        System.out.println("Fruits in the bigbowl:"+  b.fruitList +"\n");


        BasketStand bs=new BasketStand();

        bs.sortBySize(b.fruitList);
        bs.showBasket();

        bs.sortbByColor(b.fruitList);
        bs.showBasket();

        bs.sortByType(b.fruitList);
        bs.showBasket();
    }

}
