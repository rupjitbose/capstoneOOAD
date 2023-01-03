package testing.fruitbasket;

import java.util.*;


public class BasketStand {


    HashMap<String,List<Fruit>> sortedFruit=new HashMap<>();
    List<String> topShelf=new ArrayList<>();
    List<String> milddleShelf=new ArrayList<>();
    List<String> bottomShelf=new ArrayList<>();
    List<String > allData=new ArrayList<>();
    
    private void emptyShelfs(){
        topShelf.clear();
        milddleShelf.clear();
        bottomShelf.clear();
        allData.clear();
    }


    public void sortbByColor(List<Fruit> lf) {
        System.out.println("Sorting by color:");
        emptyShelfs();
        for (int i = 0; i < lf.size(); i++) {
            String data=lf.get(i).getColor();
            addToSortList(data, lf, i, allData);
        }
        addToShelf(allData);
    }


    public void sortByType(List<Fruit> lf){
        System.out.println("Sorting by Type:");
        emptyShelfs();
        for (int i = 0; i < lf.size(); i++) {
            String data=lf.get(i).getType();
            addToSortList(data, lf, i, allData);
        }
        addToShelf(allData);
    }

    public void sortBySize(List<Fruit> lf){
        System.out.println("Sorting by Size:");
        emptyShelfs();
        for (int i = 0; i < lf.size(); i++) {
            String data=lf.get(i).getSize();
            addToSortList(data, lf, i, allData);
        }
        addToShelf(allData);
    }


    private void addToSortList(String data, List<Fruit> lf, int i, List<String> allData) {
        if(sortedFruit.containsKey(data)){
            List<Fruit>flist=new ArrayList<>();
            flist.addAll(sortedFruit.get(data));
            flist.add(lf.get(i));
            sortedFruit.put(data,flist);
        }
        else
        {
            allData.add(data);
            sortedFruit.put(data,List.of(lf.get(i)));
        }
    }

    private void addToShelf(List<String> data) {
        sortedFruit.get(data.get(0)).stream().forEach(fruit -> topShelf.add(fruit.getName()));
        sortedFruit.get(data.get(1)).stream().forEach(fruit -> milddleShelf.add(fruit.getName()));
        for(int i = 2; i< data.size(); i++){
            sortedFruit.get(data.get(i)).stream().forEach(fruit -> bottomShelf.add(fruit.getName()));
        }
    }

    public void showBasket(){
        System.out.println("topShelf: "+topShelf);
        System.out.println("middleShelf: "+milddleShelf);
        System.out.println("bottomShelf: "+bottomShelf);
        System.out.println();
    }
}
