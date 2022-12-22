package org.example;

public class apple {
    private String name;
    private int tart;

    public apple(String name, int tart) {
        this.name = name;
        this.tart = tart;
    }


    public static void main(String[] a) {

        apple a1=new apple("pink lady",2);
        System.out.println(a1);

    }
    @Override
    public String toString() {
        return "{"
                + "\"name\":\""
                + name
                + "\""
                + ", \"tart\":\""
                + tart
                +"\""
                + "}";
    }
}