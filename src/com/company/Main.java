package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.devices.*;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException {

        Human seller = new Human("Marek","Kowalski","male",21,4);
        seller.setCash(99999.0);
        seller.setSalary(9999.0);
        Human buyer = new Human("Marek","Kowalski","male",21,1);
        buyer.setCash(99999.0);
        buyer.setSalary(9999.0);

        Car tesla = new Diesel("Tesla", 800.0, 2017, seller);
        tesla.price = 1.0;
        Car audi  = new LPG("Audi", 999.0, 2001, seller);
        audi.price = 1.0;
        Car bmw   = new Electric("BMW", 700.0, 1997, seller);
        bmw.price = 1.0;

        seller.setCash(9999.0);
        seller.setSalary(9999.0);
        seller.setCar(0, tesla);
        seller.setCar(1, audi);
        seller.setCar(2, bmw);

        try {
            bmw.sell(seller, 2, buyer, 0, 1.0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(buyer == bmw.getLastOwner())
        {
            System.out.println("Kupujacy jest ostatnim wlascicielem");
        }
        else
        {
            System.out.println("Kupujacy nie jest ostatnim wlascicielem");
        }

        if(bmw.isHumanSoldToHuman(seller,buyer))
        {
            System.out.println("Kupujacy kupil od sprzedajacego");
        }
        else
        {
            System.out.println("Kupujacy nie kupil od sprzedajacego");
        }

        System.out.println(String.format("BMW mialo %s transakcji",bmw.getTransactionCount().toString()));

        Integer empty = buyer.findEmptyGarageSlot();

        System.out.println(String.format("Wartosc garazu to %s", buyer.getCarsValue().toString()));



    }
}
