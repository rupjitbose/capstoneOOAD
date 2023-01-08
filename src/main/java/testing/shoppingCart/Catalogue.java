package testing.shoppingCart;

import testing.fruitbasket.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {

    public List<Product> catalogue=new ArrayList<>();



    @Override
    public String toString(){
        String s="";
        for(Product f:  this.catalogue){
            s=s+f.getName()+" : "+"1"+f.getUnit()+" : "+f.getPrice()+"\n";
        }
        return s+"\n" ;
    }
}
