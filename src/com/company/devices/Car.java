package com.company.devices;

public class Car extends Device {

    public String                  color;
    public Double                  engineCapacity;
    public Double                  price;

    public Car(String model) {
        this.model = model;
    }


    public String toString() {
        return "Model: " + this.model +
                "EngineCapacity: " + this.engineCapacity +
                "Price: " + this.price +
                "Producer: " + this.producer +
                "Year of production: " + this.yearOfProduction;
    }

    public void turnOn()
    {
        System.out.println("Odpalam samochód");
    }
}
