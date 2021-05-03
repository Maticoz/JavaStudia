package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {


        Pet pet = new Pet(Animal.DOG);
        FarmAnimal farmAnimal = new FarmAnimal(Animal.RABBIT);

        farmAnimal.feed();
        farmAnimal.feed(3.0);
        farmAnimal.feed(-3.0);
        farmAnimal.beEaten();
        farmAnimal.beEaten();

        pet.feed();
        pet.takeForAWalk();


    }
}
