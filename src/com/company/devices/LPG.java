package com.company.devices;

public class LPG extends Car{

    public LPG(String model, Double _value, Integer _yeafOfProduction) {
        super(model, _value, _yeafOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Zatankowano LPG!");
    }
}
