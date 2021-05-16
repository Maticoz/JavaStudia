package com.company.devices;

import com.company.Human;

public abstract class Car extends Device {

    public String                  color;
    public Double                  engineCapacity;
    public Double                  price;

    public Car(String model, Double _value, Integer _yeafOfProduction) {
        this.model = model;
        this.value = _value;
        this.yearOfProduction = _yeafOfProduction;
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

    public void sell(Human seller, Integer _sellerGaragePlace, Human buyer, Integer _buyerGaragePlace, Double price) throws Exception {
        if(seller.getCar(_sellerGaragePlace) != this)
        {
            throw new Exception("Sprzedajacy nie posiada takiego samochodu.");
        }
        if(buyer.findEmptyGarageSlot() == -1)
        {
            throw new Exception("Kupujacy nie ma miejsca w garazu.");
        }
        if(buyer.getCash() < price)
        {
            throw new Exception("Kupujacy nie posiada wystarczajacej ilosci pieniedzy");
        }

        buyer.setCar(_buyerGaragePlace, seller.getCar(_sellerGaragePlace));
        seller.setCarInGarage(_sellerGaragePlace, null);

        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);
        System.out.println("Transakcja sprzedazy przebiegla pomyslnie...");
    }
    public abstract void refuel();
}
