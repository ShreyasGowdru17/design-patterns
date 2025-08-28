package com.designPattern.Decorator;

public class Milk extends CoffeeDecorator{
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+addMilk();
    }

    private String addMilk(){
        return "Milk";
    }

    @Override
    public Double getCost() {
        return coffee.getCost()+addMilkCost();
    }
    private Double addMilkCost(){
        return 0.5;
    }
}
