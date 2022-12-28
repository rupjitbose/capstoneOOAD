package testing.fruitbasket;

import java.util.ArrayList;
import java.util.List;


public class basketStand {

    List<String> topShelf=new ArrayList<>();
    List<String> milddleShelf=new ArrayList<>();
    List<String> bottomShelf=new ArrayList<>();


    private void emptyShelfs(){
        topShelf.clear();
        milddleShelf.clear();
        bottomShelf.clear();
    }
    public void sortbByColor(List<fruits> lf) {
        System.out.println("Sorting by color:");
        emptyShelfs();
        for (int i = 0; i < lf.size(); i++) {

            if (lf.get(i).getColor().equalsIgnoreCase("red")) {
                topShelf.add(lf.get(i).getName());
            }
            else if (lf.get(i).getColor().equalsIgnoreCase("green")){
                milddleShelf.add(lf.get(i).getName());
            }
            else bottomShelf.add(lf.get(i).getName());
        }
    }
    public void sortByType(List<fruits> lf){

        System.out.println("Sorting by Type:");
        emptyShelfs();
        for(int i=0;i<lf.size();i++){
            if(lf.get(i).getType().equalsIgnoreCase("sour")) {
                topShelf.add(lf.get(i).getName());
            }

            else if (lf.get(i).getType().equalsIgnoreCase("sweet")) {
                milddleShelf.add(lf.get(i).getName());

                }
            else bottomShelf.add(lf.get(i).getName());

        }
    }

    public void sortBySize(List<fruits> lf){
        System.out.println("Sorting by Size:");
        emptyShelfs();
       for(int i=0;i<lf.size();i++){

           if(lf.get(i).getSize().equalsIgnoreCase("small")){
               topShelf.add(lf.get(i).getName());

           }
           else  if(lf.get(i).getSize().equalsIgnoreCase("mid")){

               milddleShelf.add(lf.get(i).getName());
           }
           else
               bottomShelf.add(lf.get(i).getName());
           }

    }

    public void showBasket(){

        System.out.println("topShelf: "+topShelf);
        System.out.println("middleShelf: "+milddleShelf);
        System.out.println("bottomShelf: "+bottomShelf);
        System.out.println();

    }

}
