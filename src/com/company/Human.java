package com.company;

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

    private Car         car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
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
