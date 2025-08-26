package com.raksh.Decorator;

public class Latte implements Coffee{
    @Override
    public String getDescription() {
        return "Description:Latte";
    }

    @Override
    public Double getCost() {
        return 4.0;
    }
}
