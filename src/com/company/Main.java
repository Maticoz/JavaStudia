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
        car1.price           = 10000.0;
        car1.engineCapacity  = 1598.0;
        car1.producer        = "VW";
        car1.color           = "Czerwony";

        car1.turnOn();
        phone.turnOn();


    }
}
