package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.devices.*;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException {


        Pet pet = new Pet(Animal.DOG);
        FarmAnimal farmAnimal = new FarmAnimal(Animal.RABBIT);

        farmAnimal.feed();
        farmAnimal.feed(3.0);
        farmAnimal.feed(-3.0);
        farmAnimal.beEaten();
        farmAnimal.beEaten();

        pet.feed();
        pet.takeForAWalk();


        URL page1BottomURL = new URL("https://www.google.com/");
        String[] apps = {"Facebook", "Hangouts"};

        Phone phone = new Phone();
        phone.yearOfProduction = "2018";
        phone.model = "S10";
        phone.screenSize = 6.4;
        phone.producer = "Samsung";

        phone.installAnnApp("Nazwa");
        phone.installAnnApp(page1BottomURL);
        phone.installAnnApp(apps);
        phone.installAnnApp("Facebook",1.5);
        phone.installAnnApp("Twitter",1.7,"https://www.google.com");


        Car tesla = new Diesel("Tesla");
        Car audi  = new LPG("Audi");
        Car bmw   = new Electric("BMW");


        tesla.refuel();
        audi.refuel();
        bmw.refuel();

    }
}
