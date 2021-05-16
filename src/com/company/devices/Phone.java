package com.company.devices;

import com.company.Human;

import java.net.URL;

public class Phone extends Device{

    public String operationSystem;
    public Double screenSize;

    public static final String APPS_URL = "mojeaplikacje.pl";
    public static final String APPS_PROTOCOL = "https://";
    public static final String APPS_VERSION = "1.0.0";


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

    public void installAnnApp(String appName)
    {
        System.out.println(String.format("Zainstalowano aplikacje %s w wersji %s z url %s", appName, APPS_VERSION, (APPS_PROTOCOL + APPS_URL)));
    }
    public void installAnnApp(String appName, Double version)
    {
        System.out.println(String.format("Zainstalowano aplikacje %s w wersji %s z url %s", appName, version.toString(), (APPS_PROTOCOL + APPS_URL)));
    }
    public void installAnnApp(String appName, Double version, String downloadUrl)
    {
        System.out.println(String.format("Zainstalowano aplikacje %s w wersji %s z url %s", appName, version.toString(), (APPS_PROTOCOL + downloadUrl)));
    }
    public void installAnnApp(String[] appsName)
    {
        for (String appName: appsName) {
            System.out.println(String.format("Zainstalowano aplikacje %s w wersji %s z url %s", appName, APPS_VERSION, (APPS_PROTOCOL + APPS_URL)));
        }
    }
    public void installAnnApp(URL appUrl)
    {
        System.out.println(String.format("Zainstalowano aplikacje z url %s", (APPS_PROTOCOL + appUrl)));
    }
}
