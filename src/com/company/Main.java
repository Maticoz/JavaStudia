package com.company;

public class Main {

    public static void main(String[] args) {

        Human   human       = new Human();

        System.out.println("Obecne wynagrodzenie: ");
        System.out.println(human.getSalary());

        human.setSalary(3000.0);
        System.out.println("Wynagrodzenie po podwyzce: ");
        System.out.println(human.getSalary());


        System.out.println("Obecne wynagrodzenie: ");
        System.out.println(human.getSalary());

    }
}
