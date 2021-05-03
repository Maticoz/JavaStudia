package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

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
    private Double      cash = 0.0;

    private Car     car;
    private Phone   phone;
    private Animal animal;

    public Car getCar() {
        return car;
    }
    public Phone getPhone() { return phone; }
    public Animal getAnimal() { return animal; }

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

    public void setPhone(Phone phone){
        this.phone = phone;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Double getCash()
    {
        return this.cash;
    }
    public void setCash(Double _cash)
    {
        this.cash = _cash;
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
