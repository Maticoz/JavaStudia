package com.company;

public class Main {

    public static void main(String[] args) {

        Human   human = new Human();
        Car     car   = new Car("XYZ");
        car.producer  = "VW";

        human.setCar(car);

        System.out.println("Auto");
        System.out.println(human.getCar().producer);
        System.out.println(human.getCar().model);



    }
}
