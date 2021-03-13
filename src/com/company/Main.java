package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal();
        dog.species = "rasa";
        dog.name = "Szarik";
        dog.weight = 6.0;
        System.out.println("Pies: ");
        System.out.println(dog.species);
        System.out.println(dog.name);
        System.out.println(dog.weight);

        System.out.println("Człowiek: ");

        Human human = new Human();
        human.age = 20;
        human.firstName = "Marek";
        human.lastName = "Kowalski";
        human.gender = "Mężczyzna";

        System.out.println(human.firstName);
        System.out.println(human.lastName);
        System.out.println(human.gender);
        System.out.println(human.age);

        Animal cat = new Animal();
        cat.species = "Kotek";
        cat.name = "Cat";
        cat.weight = 2.0;

        System.out.println("Kot: ");
        System.out.println(cat.species);
        System.out.println(cat.name);
        System.out.println(cat.weight);

    }
}
