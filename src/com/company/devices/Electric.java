package com.company.devices;

import com.company.Human;

public class Electric extends Car{

    public Electric(String model, Double _value, Integer _yeafOfProduction, Human _owner) {
        super(model, _value, _yeafOfProduction, _owner);
    }

    @Override
    public void refuel() {
        System.out.println("Załadowano, baterie sa jak nowe!");
    }
}
