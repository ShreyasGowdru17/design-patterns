package com.raksh.Decorator;

public class Mocha extends CoffeeDecorator{
    public Mocha(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+addMocha();
    }

    private String addMocha(){
        return "Mocha";
    }

    @Override
    public Double getCost() {
        return coffee.getCost()+addMochaCost();
    }
    private Double addMochaCost(){
        return 0.7;
    }
}
