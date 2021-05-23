package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.devices.*;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException {

        Human owner = new Human("Marek","Kowalski","male",21,4);
        owner.setCash(99999.0);
        owner.setSalary(9999.0);


        Application app1 = new Application("Facebook","1.0.0",100.0);
        Application app2 = new Application("Google Hangouts","1.0.0", 50.0);
        Application app3 = new Application("Twitter","1.0.0", 5.0);
        Application testApp = new Application("Facebook","1.0.0",100.0);
        Application firstApp = new Application("AApp","1.0.0",0.0);

        Phone phone = new Phone();
        phone.model = "Iphone X";
        phone.yearOfProduction = 2020;
        phone.producer = "Apple";
        phone.operationSystem = "IOS";


        phone.installApplication(owner, app1);
        phone.installApplication(owner, app2);
        phone.installApplication(owner, app3);
        phone.installApplication(owner, firstApp);


        System.out.println("Wartość wszystkich aplikacji to: " + phone.getPriceAllApp().toString());

        System.out.println(phone.hasApplication("Facebook") == true ? "Ten smartphone posiada aplikacje facebook" : "Ten smartphone nie posiada aplikacji facebook");
        System.out.println(phone.hasApplication(app2) == true ? "Ten smartphone posiada aplikacje Google Hangouts" : "Ten smartphone nie posiada aplikacji Google Hangouts");
        System.out.println(phone.hasApplication("XYZ") == true ? "Ten smartphone posiada aplikacje XYZ" : "Ten smartphone nie posiada aplikacji XYZ");
        System.out.println(phone.hasApplication(testApp) == true ? "Ten smartphone posiada aplikacje TestApp/Facebook" : "Ten smartphone nie posiada aplikacji TestApp/Facebook");

        System.out.println("Wylistowanie aplikacji darmowych");
        phone.printFreeApplications();
        System.out.println("Wylistowanie aplikacji alfabetycznie");
        phone.printAppsAlphabetically();
        System.out.println("Wylistowanie aplikacji po cenie");
        phone.printAppsPrice();
    }
}
