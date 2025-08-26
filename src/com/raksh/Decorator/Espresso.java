package com.raksh.Decorator;

public class Espresso implements Coffee {
    @Override
    public String getDescription() {
        return "Description:Espresso";
    }

    @Override
    public Double getCost() {
        return 3.0;
    }
}
