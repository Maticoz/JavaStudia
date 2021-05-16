package com.company.devices;

import com.company.Human;

import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device {

    public String                  color;
    public Double                  engineCapacity;
    public Double                  price;
    public List<Human>             owners = new ArrayList<Human>();

    public Car(String model, Double _value, Integer _yeafOfProduction, Human _owner) {
        this.model = model;
        this.value = _value;
        this.yearOfProduction = _yeafOfProduction;
        owners.add(_owner);
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
        if(seller != this.getLastOwner())
        {
            throw new Exception("Sprzedajacy nie jest włascicielem tego auta.");
        }
        if(buyer.getCash() < price)
        {
            throw new Exception("Kupujacy nie posiada wystarczajacej ilosci pieniedzy");
        }

        buyer.setCar(_buyerGaragePlace, seller.getCar(_sellerGaragePlace));
        seller.setCarInGarage(_sellerGaragePlace, null);

        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);
        owners.add(buyer);
        System.out.println("Transakcja sprzedazy przebiegla pomyslnie...");
    }

    public Human getLastOwner()
    {
        return owners.get(owners.size() -1);
    }

    public boolean isOwner(Human _owner)
    {
        if(owners.contains(_owner))
            return true;
        return false;
    }

    public boolean isHumanSoldToHuman(Human _a, Human _b)
    {
        for (int i = 0; i < owners.size(); i++) {
            if((i+1) < owners.size() && owners.get(i) == _a && owners.get(i +1) == _b)
            {
                return true;
            }
        }
        return false;
    }

    public Integer getTransactionCount()
    {
        return owners.size();
    }

    public abstract void refuel();
}
