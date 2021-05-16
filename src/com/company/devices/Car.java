package com.company.devices;

import com.company.Human;

public abstract class Car extends Device {

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

    public void sell(Human seller, Human buyer, Double price)
    {
        if(seller.getCar() != this)
        {
            System.out.println("Sprzedajacy nie posiada takiego samochodu.");
            return;
        }
        if(buyer.getCash() < price)
        {
            System.out.println("Kupujacy nie posiada wystarczajacej ilosci pieniedzy.");
            return;
        }

        buyer.setCar(seller.getCar());
        seller.setCar(null);

        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);
        System.out.println("Transakcja sprzedazy przebiegla pomyslnie...");
    }
    public abstract void refuel();
}
