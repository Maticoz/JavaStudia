package com.company;

public class Human {
    String      firstName;
    String      lastName;
    String      gender;
    Integer     age;

    private Car         car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
