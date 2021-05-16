package com.company.devices;

public class Diesel extends Car{
    public Diesel(String model) {
        super(model);
    }

    @Override
    public void refuel() {
        System.out.println("Zatankowano dieslem!");
    }
}
