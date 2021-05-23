package com.company.devices;

import com.company.Human;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Collections;


public class Phone extends Device{

    public String operationSystem;
    public Double screenSize;

    public static final String APPS_URL = "mojeaplikacje.pl";
    public static final String APPS_PROTOCOL = "https://";
    public static final String APPS_VERSION = "1.0.0";

    public List<Application> appList = new ArrayList<>();

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

    public void installApplication(Human _owner, Application _app) {
        if(_owner.getCash() < _app.price)
        {
            System.out.println("Nie stać Cie na tą aplikacje.");
            return;
        }

        this.appList.add(_app);
        _owner.setCash(_owner.getCash() - _app.price);
    }
    public boolean hasApplication(Application _app)
    {
        Enumeration<Application> e = Collections.enumeration(appList);
        while(e.hasMoreElements()) {
            if(e.nextElement() == _app)
                return true;
        }

        return false;
    }
    public boolean hasApplication(String _name)
    {
        Enumeration<Application> e = Collections.enumeration(appList);
        while(e.hasMoreElements()) {
            if(e.nextElement().name == _name)
                return true;
        }

        return false;
    }

    public void printFreeApplications()
    {
        printAllApplications(true);
    }
    public void printAllApplications()
    {
        printAllApplications(false);
    }
    public Double getPriceAllApp()
    {
        Application app;
        Double      _sum = 0.0;
        Enumeration<Application> e = Collections.enumeration(appList);
        while(e.hasMoreElements()) {
            app = e.nextElement();
            _sum+= app.price;
        }
        return _sum;
    }

    public void printAppsAlphabetically() {
        List<Application> tmp = new ArrayList<>();
        tmp = this.appList;
        tmp.sort(new AlphabeticallyAppSorter());

        Application app;
        Enumeration<Application> e = Collections.enumeration(tmp);
        while(e.hasMoreElements()) {
            app = e.nextElement();
            System.out.println(app.name);
        }
    }
    public void printAppsPrice() {
        List<Application> tmp = new ArrayList<>();
        tmp = this.appList;
        tmp.sort(new PriceAppSorter());

        Application app;
        Enumeration<Application> e = Collections.enumeration(tmp);
        while(e.hasMoreElements()) {
            app = e.nextElement();
            System.out.println(app.name + " - " + app.price.toString());
        }
    }
    protected void printAllApplications(boolean _onlyFree)
    {
        Application app;
        Enumeration<Application> e = Collections.enumeration(appList);
        while(e.hasMoreElements()) {
            app = e.nextElement();
            if(_onlyFree)
            {
                if(app.price <= 0)
                {
                    System.out.println(app.name);
                }
            }
            else
            {
                System.out.println(app.name);
            }
        }
    }
}
