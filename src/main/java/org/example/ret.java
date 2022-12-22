package org.example;

public class ret {

    private static double hight=8;
    private double width;



    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {

//        if(hight<this.hight)
//            System.out.print("you can't set value less than initial value: ");
//        else this.hight = hight;


       String out=(hight<this.hight) ? "you can't set value less than initial value: " : String.valueOf(this.hight=hight);
        System.out.print(out);

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
 public static void main(String [] args){
        ret r1=new ret();
        r1.setWidth(5.5);
        r1.setHight(6);
        System.out.println(r1.getHight());
 }

}
