package com.company;

import com.company.devices.Car;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    String      firstName;
    String      lastName;
    String      gender;
    Integer     age;
    private Double      salary = 0.0;
    private Double      previousSalary;
    private Date        salaryGetAt;

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if(this.salary >= car.price)
        {
            System.out.println("Udalo sie kupic za gotówke! :D");
            this.car = car;
        }
        else if((this.salary * 12) >= car.price  )
        {
            System.out.println("Udalo sie kupic na kredyt!");
            this.car = car;
        }
        else
        {
            System.out.println("Nie stac Cie na te auto, zmien prace/idz po podwyzke");
        }
    }

    public Double getSalary() {
        if(this.previousSalary != null)
        {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

            System.out.println("Ostatnio pobierano informacje na temat pensji dnia: ");
            System.out.print(formatter.format(this.salaryGetAt));
            System.out.println(this.previousSalary);
        }
        this.salaryGetAt = new Date(System.currentTimeMillis());
        return salary;
    }

    public void setSalary(Double salary) {
        if(salary <= 0)
        {
            System.out.println("Wynagrodzenie nie moze byc mniejsze badź równe 0");
            return;
        }


        System.out.println("Dane zostały wysłane do systemu księgowego.");
        System.out.println("Prosze odebrać aneks w dziale kadr.");

        System.out.println("US już dostał informacje na temat wypłaty, prosze o nie ukrywanie dochodu");
        previousSalary = this.salary;

        this.salary = salary;
    }
}
