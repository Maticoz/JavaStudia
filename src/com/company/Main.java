package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal(Animal.CAT);
        dog.name = "Mruczek";
        System.out.println("Kot: ");
        System.out.println(dog.species);
        System.out.println(dog.name);

        dog.feed();

        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();

    }
}
