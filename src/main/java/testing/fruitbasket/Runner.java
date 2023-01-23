package testing.fruitbasket;

public class Runner {

    public static void main(String[] args) {

        Fruit orange = new Fruit("orange", "orange", "big", "sweet");
        Fruit lime = new Fruit("lime", "green", "mid", "sour");
        Fruit apple = new Fruit("apple", "red", "big", "tart");
        Fruit grep = new Fruit("grep", "green", "small", "sweet");
        Fruit mango = new Fruit("mango", "yellow", "big", "sweet");

        FruitBowl fruitBowl = new FruitBowl();
        fruitBowl.addFruit(grep);
        fruitBowl.addFruit(orange);
        fruitBowl.addFruit(lime);
        fruitBowl.addFruit(mango);
        fruitBowl.addFruit(apple);
        System.out.println("Big Bowl have: " + fruitBowl);

        FruitBasketStand basketStands = new FruitBasketStand();

        basketStands.sortBySize(fruitBowl);
        basketStands.showBasket();

        basketStands.sortbByColor(fruitBowl);
        basketStands.showBasket();

        basketStands.sortByType(fruitBowl);
        basketStands.showBasket();
    }
}
