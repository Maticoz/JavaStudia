package com.company.creatures;
import com.company.Human;
import com.company.Salleable;

import java.io.File;

public abstract class Animal implements Salleable, Feedable {
    public static final String DOG  =    "DOG";
    public static final String LION =   "LION";
    public static final String CAT  =    "CAT";
    public static final String RABBIT = "RABBIT";

    protected String name;
    protected Double weight;
    public final String species;
    protected File pic;

    public Animal(String species)
    {
        this.species = species;
        this.setWeightSpecies();
    }

    public void feed() {
        this.weight += 1.0;
        System.out.println("Wrrr...");
    }
    public void feed(Double foodWeight)
    {
        if(foodWeight <= 0.0)
        {
            System.out.println("Nie mozesz nakarmic czyms co nie istnieje");
            return;
        }
        this.weight += foodWeight;
        System.out.println("Wrrr...");
    }
    public void takeForAWalk() {
        this.weight -= 1.0;
        if(this.weight <= 0)
        {
            System.out.println("Zwierze umarło z głodu.");
            return;
        }
        System.out.println("Grrr....");

    }

    public void sell(Human seller, Human buyer, Double price)
    {
        if(seller.getAnimal() != this)
        {
            System.out.println("Sprzedajacy nie posiada takiego zwierzecia.");
            return;
        }
        if(buyer.getCash() < price)
        {
            System.out.println("Kupujacy nie posiada wystarczajacej ilosci pieniedzy.");
            return;
        }

        buyer.setAnimal(seller.getAnimal());
        seller.setAnimal(null);

        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);
        System.out.println("Transakcja sprzedazy przebiegla pomyslnie...");
    }

    protected void setWeightSpecies()
    {
        switch (this.species)
        {
            case DOG:
            {
                this.weight = 8.0;
                break;
            }
            case LION:
            {
                this.weight = 80.0;
                break;
            }
            case CAT:
            {
                this.weight = 2.0;
                break;
            }
            case RABBIT:
            {
                this.weight = 0.5;
                break;
            }
            default: {
                break;
            }
        }

    }


}
