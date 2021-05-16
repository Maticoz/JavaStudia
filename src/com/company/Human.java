package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;


public class Human {
    String      firstName;
    String      lastName;
    String      gender;
    Integer     age;
    private Double      salary = 0.0;
    private Double      previousSalary;
    private Date        salaryGetAt;
    private Double      cash = 0.0;

    private Car[]   garage;
    private Phone   phone;
    private Animal  animal;

    public Car getCar(Integer _carPlace) {
        if(garage.length >= _carPlace) {
            return garage[_carPlace];
        }
        System.out.println("Nie ma takiego miejsca w garazu.");
        return null;
    }

    public void sortGarage()
    {
        for (int i = 0; i < garage.length; i++) {
            for (int j = 0; j < garage.length; j++)
            {
                Car oldCar = garage[i];
                if(garage[i] == null && garage[j] == null)
                {
                    continue;
                }
                else if(garage[i] != null && garage[j] == null)
                {
                    oldCar = garage[j];
                    garage[j] = garage[i];
                    garage[i] = oldCar;
                }
                else if(garage[i] == null && garage[j] != null)
                {
                    garage[i] = garage[j];
                    garage[j] = oldCar;
                }
                else if(garage[i].yearOfProduction < garage[j].yearOfProduction)
                {
                    garage[i] = garage[j];
                    garage[j] = oldCar;
                }
            }
        }
    }

    public void garageQueue()
    {
        for (Integer i = 0; i < garage.length; i++) {
            if(garage[i] != null) {
            System.out.println(String.format("Miejsce: %s, auto %s, rok produkcji %s", i.toString(), garage[i].model, garage[i].yearOfProduction.toString()));
            }
        }
    }

    public Integer findEmptyGarageSlot()
    {
        for (Integer i = 0; i < garage.length; i++) {
            if(garage[i] == null)
            {
                return i;
            }
        }

        return -1;
    }


    public Double getCarsValue()
    {
        Double value = 0.0;
        for (int i = 0; i < garage.length; i++) {
            if(garage[i] != null)
            {
                value += garage[i].value.doubleValue();
            }
        }
        return value;
    }


    public Phone getPhone() { return phone; }
    public Animal getAnimal() { return animal; }

    public Human(String _firstName, String _lastName, String _gender, Integer _age)
    {
        firstName   = _firstName;
        lastName    = _lastName;
        gender      = _gender;
        age         = _age;
        garage      = new Car[3];
    }
    public Human(String _firstName, String _lastName, String _gender, Integer _age, Integer _garageCount)
    {
        if(_garageCount < 0)
        {
            _garageCount = 1;
        }

        firstName   = _firstName;
        lastName    = _lastName;
        gender      = _gender;
        age         = _age;
        garage      = new Car[_garageCount];
    }

    public void setCar(Integer _carPlace, Car car) {
        if(car == null)
        {
            return;
        }
        if(this.salary >= car.price)
        {
            System.out.println("Udalo sie kupic za gotówke! :D");
            setCarInGarage(_carPlace, car);
        }
        else if((this.salary * 12) >= car.price  )
        {
            System.out.println("Udalo sie kupic na kredyt!");
            setCarInGarage(_carPlace, car);
        }
        else
        {
            System.out.println("Nie stac Cie na te auto, zmien prace/idz po podwyzke");
        }
    }

    public void setCarInGarage(Integer _carPlace, Car _car)
    {
        if(garage.length > _carPlace) {
            garage[_carPlace] = _car;
        }
        else
        {
            System.out.println("Nie ma takiego miejsca w garazu.");
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
