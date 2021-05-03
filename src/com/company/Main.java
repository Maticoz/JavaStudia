package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Dog");

        Phone phone = new Phone();
        phone.model = "X";
        phone.producer = "Apple";
        phone.operationSystem = "IOS";
        phone.screenSize = 6.01;

        Car car1         = new Car("Vw");
        car1.price           = 1000.0;
        car1.engineCapacity  = 1598.0;
        car1.producer        = "VW";
        car1.color           = "Czerwony";

        Human human = new Human();
        human.firstName = "Marek";
        human.lastName  = "Derela";
        human.setCash(5000.0);

        Human seller = new Human();
        seller.firstName = "Mirek";
        seller.lastName = "Handlarz";
        seller.setCash(3000.0);
        seller.setSalary(9999.0);


        seller.setPhone(phone);
        seller.setAnimal(animal);


        System.out.println("Marek ilosc pieniedzy - " + human.getCash());
        System.out.println("Mirek ilosc pieniedzy - " + seller.getCash());

        phone.sell(seller, human, 1000.0);
        System.out.println("Marek ilosc pieniedzy - " + human.getCash());
        System.out.println("Mirek ilosc pieniedzy - " + seller.getCash());

        animal.sell(seller, human, 750.0);
        System.out.println("Marek ilosc pieniedzy - " + human.getCash());
        System.out.println("Mirek ilosc pieniedzy - " + seller.getCash());


        car1.sell(seller, human, 500.0);
        System.out.println("Marek ilosc pieniedzy - " + human.getCash());
        System.out.println("Mirek ilosc pieniedzy - " + seller.getCash());

        seller.setCar(car1);
        car1.sell(seller, human, 5000.0);
        System.out.println("Marek ilosc pieniedzy - " + human.getCash());
        System.out.println("Mirek ilosc pieniedzy - " + seller.getCash());



    }
}
