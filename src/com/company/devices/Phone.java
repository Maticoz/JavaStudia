package com.company.devices;

public class Phone extends Device{

    public String operationSystem;
    public Double screenSize;

    public String toString() {
        return "Model: " + this.model +
                "Operation system: " + this.operationSystem +
                "Screen size: " + this.screenSize +
                "Producer: " + this.producer +
                "Year of production: " + this.yearOfProduction;
    }
    public void turnOn()
    {
        System.out.println("Uruchamiam telefon");
    }
}
