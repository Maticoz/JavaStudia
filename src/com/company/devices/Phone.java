package com.company.devices;

import com.company.Human;

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

    public void sell(Human seller, Human buyer, Double price)
    {
        if(seller.getPhone() != this)
        {
            System.out.println("Sprzedajacy nie posiada takiego telefonu.");
            return;
        }
        if(buyer.getCash() < price)
        {
            System.out.println("Kupujacy nie posiada wystarczajacej ilosci pieniedzy.");
            return;
        }

        buyer.setPhone(seller.getPhone());
        seller.setPhone(null);

        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);
        System.out.println("Transakcja sprzedazy przebiegla pomyslnie...");
    }
}
