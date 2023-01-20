package testing.fruitbasket;

import java.util.ArrayList;
import java.util.List;

public class FruitBowl {
    public List<Fruit> fruitList =new ArrayList<>();
    @Override
    public String toString(){
        String s="";
        for(Fruit f:  this.fruitList){
            s=s+f.getName()+" ,";
        }
        return s+"\n" ;
    }
}
