package com.company.devices;

public class Application {
    public String version;
    public String name;
    public Double price;

    public Application(String _name, String _version, Double _price)
    {
        this.version = _version;
        this.name = _name;

        if(_price < 0.0)
        {
            _price = 0.0;
        }

        price = _price;
    }
}
