package com.company.devices;

import com.company.Human;

public class Diesel extends Car{


    public Diesel(String model, Double _value, Integer _yeafOfProduction, Human _owner) {
        super(model, _value, _yeafOfProduction, _owner);
    }

    @Override
    public void refuel() {
        System.out.println("Zatankowano dieslem!");
    }
}
