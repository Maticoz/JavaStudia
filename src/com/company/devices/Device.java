package com.company.devices;

public abstract class  Device {
    public String                  model;
    public String                  producer;
    public Integer                 yearOfProduction;
    public Double                  value;

    public abstract void turnOn();
}
