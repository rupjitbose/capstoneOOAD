package testing.fruitbasket;

public class Runner {

    public static void main(String[] args){

        Fruit orange=new Fruit("orange","orange","big","sweet");
        Fruit lime=new Fruit("lime","green","mid","sour");
        Fruit apple=new Fruit("apple","red","big","tart");
        Fruit grep=new Fruit("grep","green","small","sweet");
        Fruit mango=new Fruit("mango","yellow","big","sweet");

        FruitBowl b=new FruitBowl();
        b.fruitList.add(grep);
        b.fruitList.add(orange);
        b.fruitList.add(lime);
        b.fruitList.add(mango);
        b.fruitList.add(apple);
        System.out.println("Big Bowl have: "+b);

        FruitBasketStand bs=new FruitBasketStand();

        bs.sortBySize(b.fruitList);
        bs.showBasket();

        bs.sortbByColor(b.fruitList);
        bs.showBasket();

        bs.sortByType(b.fruitList);
        bs.showBasket();
    }
}
