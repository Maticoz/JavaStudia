package com.company.devices;

public class Diesel extends Car{


    public Diesel(String model, Double _value, Integer _yeafOfProduction) {
        super(model, _value, _yeafOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Zatankowano dieslem!");
    }
}
