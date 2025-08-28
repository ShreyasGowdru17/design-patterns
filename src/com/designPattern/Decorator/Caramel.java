package com.designPattern.Decorator;

public class Caramel extends CoffeeDecorator{
    public Caramel(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+addCaramel();
    }
    private String addCaramel(){
        return "Caramel";
    }

    @Override
    public Double getCost() {
        return coffee.getCost()+addCaramelCost();
    }
     private Double addCaramelCost(){
        return 0.8;
     }
}
