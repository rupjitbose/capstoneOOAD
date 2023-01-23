package testing.fruitbasket;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class FruitBowl {

    public List<Fruit> getFruitList() {
        return fruitList;
    }

    private List<Fruit> fruitList;

    public FruitBowl() {
        fruitList = new ArrayList<>();
    }

    public void addFruit(Fruit fruit) {
        fruitList.add(fruit);
    }

    @Override
    public String toString() {
        String s = "";
        for (Fruit f : this.fruitList) {
            s = s + f.getName() + " ,";
        }
        return s + "\n";
    }
}
