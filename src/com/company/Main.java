package com.company;

public class Main {

    public static void main(String[] args) {

        Car     car         = new Car("Vw");

        car.price = 10000.0;
        car.engineCapacity  = 1598.0;
        car.producer        = "VW";
        car.color           = "Czerwony";


        Human   human       = new Human();
        System.out.println("=======================");
        human.setSalary(11000.0);
        human.setCar(car);

        System.out.println("=======================");
        human.setSalary(5000.0);
        human.setCar(car);


        System.out.println("=======================");
        human.setSalary(300.0);
        human.setCar(car);


    }
}
