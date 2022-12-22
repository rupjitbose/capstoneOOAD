package org.example;



import java.util.HashMap;
import java.util.Map;

public class checkDuplicate {
    private String data;

    public void setData(String data) {
        this.data = data;
    }




    public Map stringCounter() {
        Map<String, Integer> strCount = new HashMap<String, Integer>();
        String arr[] = data.split(" ");

        for (String s : arr) {
            if (strCount.containsKey(s)) {
                strCount.replace(s, strCount.get(s) + 1);
            } else {
                strCount.put(s, 1);
            }
        }
        return strCount;
    }


    public static void main(String[] ars) {
        String s = "hi this is a hi , to check the hi , to know how many hi";

        checkDuplicate ch = new checkDuplicate();

        ch.setData(s);

        ch.stringCounter().forEach((key, value) -> {
            System.out.printf("\"%s\" - %s \n", key, value);
        });

        System.out.println(ch.stringCounter());

    }


}