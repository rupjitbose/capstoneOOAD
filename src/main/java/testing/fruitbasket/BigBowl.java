package testing.fruitbasket;

import java.util.ArrayList;
import java.util.List;

public class BigBowl {
    public List<Fruit> fruitList =new ArrayList<>();
    public static void main(String[] ags){

        Fruit orange=new Fruit("orange","orange","big","sweet");
        Fruit lime=new Fruit("lime","green","mid","sour");
        Fruit apple=new Fruit("apple","red","big","tart");
        Fruit grep=new Fruit("grep","green","small","sweet");
        Fruit mango=new Fruit("mango","yellow","big","sweet");

        BigBowl b=new BigBowl();
        b.fruitList.add(grep);
        b.fruitList.add(orange);
        b.fruitList.add(lime);
        b.fruitList.add(mango);
        b.fruitList.add(apple);
        System.out.println("Big Bowl have: "+b);

        BasketStand bs=new BasketStand();

        bs.sortBySize(b.fruitList);
        bs.showBasket();

        bs.sortbByColor(b.fruitList);
        bs.showBasket();

        bs.sortByType(b.fruitList);
        bs.showBasket();
    }

    @Override
    public String toString(){
        String s="";
        for(Fruit f:  this.fruitList){
            s=s+f.getName()+" ,";
        }
        return s+"\n" ;
    }
}
