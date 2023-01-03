package testing;

import java.util.ArrayList;
import java.util.List;

public class AgileP {

    int unitCost=1000;

    double taxCA=.0825;


    public void cost(){
        System.out.println(unitCost);
    }

    public void costIncludingTax(){
        System.out.println(unitCost*taxCA+unitCost);
    }
    public static void main(String[] args) {

AgileP a=new AgileP();
a.cost();
a.costIncludingTax();

    }


}
