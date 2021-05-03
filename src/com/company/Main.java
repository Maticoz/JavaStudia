package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Dog");
        Human human = new Human();
        human.firstName = "Marek";
        human.lastName  = "Derela";
        Phone phone = new Phone();
        phone.model = "X";
        phone.producer = "Apple";
        phone.operationSystem = "IOS";
        phone.screenSize = 6.01;

        Car car1         = new Car("Vw");
        Car     car2         = new Car("Vw");

        car1.price           = 10000.0;
        car1.engineCapacity  = 1598.0;
        car1.producer        = "VW";
        car1.color           = "Czerwony";

        car2.price           = 10000.0;
        car2.engineCapacity  = 1598.0;
        car2.producer        = "VW";
        car2.color           = "Czerwony";

        if(car1.equals(car2))
        {
            System.out.println("Obiekty Car1 i Car 2 sa takie same");
        }
        else
        {
            System.out.println("Obiekty Car1 i Car 2 sa różne");
        }

        System.out.println("Wypisanie obiektu");
        //System.out.println(car1);

        System.out.println(car1.toString());
        System.out.println(animal.toString());
        System.out.println(human.toString());
        System.out.println(phone.toString());


    }
}
