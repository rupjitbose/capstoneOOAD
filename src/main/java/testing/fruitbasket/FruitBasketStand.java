package testing.fruitbasket;

import java.util.*;


public class FruitBasketStand {
    HashMap<String,List<Fruit>> sortedFruit=new HashMap<>();
    List<String> topShelf=new ArrayList<>();
    List<String> milddleShelf=new ArrayList<>();
    List<String> bottomShelf=new ArrayList<>();
    List<String > listOfColorOrSizeOrType =new ArrayList<>();

    private void emptyShelfs(){
        topShelf.clear();
        milddleShelf.clear();
        bottomShelf.clear();
        listOfColorOrSizeOrType.clear();
    }

    public void sortbByColor(List<Fruit> lf) {
        System.out.println("Sorting by color:");
        emptyShelfs();
        for (int i = 0; i < lf.size(); i++) {
            String data=lf.get(i).getColor();
            addToSortList(data, lf, i, listOfColorOrSizeOrType);
        }
        addToShelf(listOfColorOrSizeOrType);
    }

    public void sortByType(List<Fruit> lf){
        System.out.println("Sorting by Type:");
        emptyShelfs();
        for (int i = 0; i < lf.size(); i++) {
            String data=lf.get(i).getType();
            addToSortList(data, lf, i, listOfColorOrSizeOrType);
        }
        addToShelf(listOfColorOrSizeOrType);
    }

    public void sortBySize(List<Fruit> lf){
        System.out.println("Sorting by Size:");
        emptyShelfs();
        for (int i = 0; i < lf.size(); i++) {
            String data=lf.get(i).getSize();
            addToSortList(data, lf, i, listOfColorOrSizeOrType);
        }
        addToShelf(listOfColorOrSizeOrType);
    }
    private void addToSortList(String data, List<Fruit> lf, int i, List<String> listOfColorOrSizeOrType) {
        if(sortedFruit.containsKey(data)){
            List<Fruit>flist=new ArrayList<>();
            flist.addAll(sortedFruit.get(data));
            flist.add(lf.get(i));
            sortedFruit.put(data,flist);
        }
        else
        {
            listOfColorOrSizeOrType.add(data);
            sortedFruit.put(data,List.of(lf.get(i)));
        }
    }

    private void addToShelf(List<String> listOfColorOrSizeOrType) {
        sortedFruit.get(listOfColorOrSizeOrType.get(0)).stream().forEach(fruit -> topShelf.add(fruit.getName()));
        sortedFruit.get(listOfColorOrSizeOrType.get(1)).stream().forEach(fruit -> milddleShelf.add(fruit.getName()));
        for(int i = 2; i< listOfColorOrSizeOrType.size(); i++)
            sortedFruit.get(listOfColorOrSizeOrType.get(i)).stream().forEach(fruit -> bottomShelf.add(fruit.getName()));
    }

    public void showBasket(){
        System.out.println("topShelf: "+topShelf);
        System.out.println("middleShelf: "+milddleShelf);
        System.out.println("bottomShelf: "+bottomShelf);
        System.out.println();
    }
}
