package org.example;

public class pumkin {

        public pumkin() {
            System.out.println("Preparing pumkin soup...");
        }
        public pumkin oilheat(){
            System.out.println("Heat oil in a large saucepan over low heat");
            return this;
        }
    public pumkin addveg(){
        System.out.println("Add onion and leek and cook for 2-3 minutes, until softened but not colored.");
        return this;
    }

        public pumkin cooktime(int sec) {
            System.out.printf("Add garlic and spices and cook, stirring, for %s seconds", sec);
            System.out.println();
            return this;
        }

        public pumkin addHotWater(int water) {
            System.out.println("Adding hot water to the coffee mix " + water);
            return this;
        }

        public pumkin mix() {
            System.out.println("Mixing contents in the maker");
            return this;
        }

        public pumkin stirAndBeat(int time) {
            System.out.printf("Stirring the contents in coffee for %s minutes", time);
            System.out.println();
            return this;
        }

        public pumkin pourMilk(double milkQuantity) {
            System.out.println("Adding %s cup milk to the coffee mix");
            return this;
        }

        public soup serve() {
            System.out.println("Serving coffee");
            return new soup();
        }

        private static class soup {}

        public static void main(String[] args) {
            //
            pumkin coffeeMaker = new pumkin();
            coffeeMaker
                    .oilheat()
                    .addveg()
                    .cooktime(30)
                    .addHotWater(3)
                    .mix()
                    .stirAndBeat(3)
                    .pourMilk(0.5)
                    .mix()
                    .serve();
        }
    }

