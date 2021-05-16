package com.company.devices;

public class Electric extends Car{
    public Electric(String model) {
        super(model);
    }

    @Override
    public void refuel() {
        System.out.println("Załadowano, baterie sa jak nowe!");
    }
}
