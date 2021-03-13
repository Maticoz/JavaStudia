package com.company;
import java.io.File;

public class Animal {
    public static final String DOG  =    "DOG";
    public static final String LION =   "LION";
    public static final String CAT  =    "CAT";

    String name;
    private Double weight;
    public final String species;
    File pic;

    public Animal(String species)
    {
        this.species = species;
        this.setWeightSpecies();
    }

    public void feed() {
        this.weight += 1.0;
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
            default: {
                break;
            }
        }

    }

}
