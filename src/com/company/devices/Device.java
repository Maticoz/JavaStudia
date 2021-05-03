package com.company.devices;

public abstract class  Device {
    public String                  model;
    public String                  producer;
    public String                  yearOfProduction;

    public abstract void turnOn();
}
