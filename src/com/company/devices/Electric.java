package com.company.devices;

public class Electric extends Car{


    public Electric(String model, Double _value, Integer _yeafOfProduction) {
        super(model, _value, _yeafOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Załadowano, baterie sa jak nowe!");
    }
}
