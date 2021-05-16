package com.company.devices;

public class LPG extends Car{
    public LPG(String model) {
        super(model);
    }

    @Override
    public void refuel() {
        System.out.println("Zatankowano LPG!");
    }
}
